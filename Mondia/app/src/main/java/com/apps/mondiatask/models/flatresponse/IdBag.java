
package com.apps.mondiatask.models.flatresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IdBag {

    @SerializedName("isrc")
    @Expose
    private String isrc;
    @SerializedName("roviId")
    @Expose
    private String roviId;
    @SerializedName("roviTrackId")
    @Expose
    private String roviTrackId;

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getRoviId() {
        return roviId;
    }

    public void setRoviId(String roviId) {
        this.roviId = roviId;
    }

    public String getRoviTrackId() {
        return roviTrackId;
    }

    public void setRoviTrackId(String roviTrackId) {
        this.roviTrackId = roviTrackId;
    }

}
