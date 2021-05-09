package com.apps.mondiatask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.apps.mondiatask.adapter.DataListAdapter;
import com.apps.mondiatask.models.flatresponse.FlatResponse;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.apps.mondiatask.api.RetrofitClient.getClient;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    ListView listView;

    List<List<FlatResponse>>flatResponseList=new ArrayList<>();
    DataListAdapter dataListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        searchView = findViewById(R.id.main_activity_search);
        listView = findViewById(R.id.main_activity_lv_data);

        getDataFlat();
    }

    private void getDataFlat() {
        String token = "Bearer Cd0b29274-c484-4bdb-b882-cd321a172fc5";
        getClient().flatResponse(token, "string").enqueue(new Callback<List<FlatResponse>>() {
            @Override
            public void onResponse(Call<List<FlatResponse>> call, Response<List<FlatResponse>> response) {

                if (response.isSuccessful()) {

                    Toast.makeText(MainActivity.this,"Successful", Toast.LENGTH_SHORT).show();
                    dataListAdapter=new DataListAdapter(MainActivity.this,flatResponseList);
                    listView.setAdapter(dataListAdapter);

                }
                else {
                    Gson gson = new Gson();
                    FlatResponse errorResponse = new FlatResponse();
                    try {

                        errorResponse=gson.fromJson(response.errorBody().string(),FlatResponse.class);
                        Toast.makeText(MainActivity.this,"Error Body", Toast.LENGTH_SHORT).show();


                    } catch (Exception e) {

                    }
                }

            }

            @Override
            public void onFailure(Call<List<FlatResponse>> call, Throwable t) {

            }
        });

    }
}