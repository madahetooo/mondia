
package com.apps.mondiatask.models.flatresponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statistics {

    @SerializedName("popularity")
    @Expose
    private Integer popularity;
    @SerializedName("estimatedRecentCount")
    @Expose
    private Integer estimatedRecentCount;
    @SerializedName("estimatedTotalCount")
    @Expose
    private Integer estimatedTotalCount;

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Integer getEstimatedRecentCount() {
        return estimatedRecentCount;
    }

    public void setEstimatedRecentCount(Integer estimatedRecentCount) {
        this.estimatedRecentCount = estimatedRecentCount;
    }

    public Integer getEstimatedTotalCount() {
        return estimatedTotalCount;
    }

    public void setEstimatedTotalCount(Integer estimatedTotalCount) {
        this.estimatedTotalCount = estimatedTotalCount;
    }

}
