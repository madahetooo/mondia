
package com.apps.mondiatask.models.flatresponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlatResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("publishingDate")
    @Expose
    private String publishingDate;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("mainArtist")
    @Expose
    private MainArtist mainArtist;
    @SerializedName("statistics")
    @Expose
    private Statistics statistics;
    @SerializedName("release")
    @Expose
    private Release release;
    @SerializedName("volumeNumber")
    @Expose
    private Integer volumeNumber;
    @SerializedName("trackNumber")
    @Expose
    private Integer trackNumber;
    @SerializedName("genres")
    @Expose
    private List<String> genres = null;
    @SerializedName("additionalArtists")
    @Expose
    private List<Object> additionalArtists = null;
    @SerializedName("idBag")
    @Expose
    private IdBag idBag;
    @SerializedName("adfunded")
    @Expose
    private Boolean adfunded;
    @SerializedName("streamable")
    @Expose
    private Boolean streamable;
    @SerializedName("bundleOnly")
    @Expose
    private Boolean bundleOnly;
    @SerializedName("cover")
    @Expose
    private Cover cover;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(String publishingDate) {
        this.publishingDate = publishingDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public MainArtist getMainArtist() {
        return mainArtist;
    }

    public void setMainArtist(MainArtist mainArtist) {
        this.mainArtist = mainArtist;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }

    public Integer getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(Integer volumeNumber) {
        this.volumeNumber = volumeNumber;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<Object> getAdditionalArtists() {
        return additionalArtists;
    }

    public void setAdditionalArtists(List<Object> additionalArtists) {
        this.additionalArtists = additionalArtists;
    }

    public IdBag getIdBag() {
        return idBag;
    }

    public void setIdBag(IdBag idBag) {
        this.idBag = idBag;
    }

    public Boolean getAdfunded() {
        return adfunded;
    }

    public void setAdfunded(Boolean adfunded) {
        this.adfunded = adfunded;
    }

    public Boolean getStreamable() {
        return streamable;
    }

    public void setStreamable(Boolean streamable) {
        this.streamable = streamable;
    }

    public Boolean getBundleOnly() {
        return bundleOnly;
    }

    public void setBundleOnly(Boolean bundleOnly) {
        this.bundleOnly = bundleOnly;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

}
