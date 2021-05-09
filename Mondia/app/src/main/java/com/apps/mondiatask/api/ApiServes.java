package com.apps.mondiatask.api;

import com.apps.mondiatask.models.flatresponse.FlatResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiServes {
                      // http://staging-gateway.mondiamedia.com/v2/api/sayt/flat?query=string
    @GET("v2/api/sayt/grouped")
    Call<List<FlatResponse> > flatResponse(@Header("Authorization")String accessToken,
                                          @Query("query") String query);

}
