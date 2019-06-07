package com.stackroute.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;





@Document
@Data
@AllArgsConstructor
@NoArgsConstructor




public class Track {



    @Id
    private int trackId;
    private String trackName;
    private String trackcomments;




    /*public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackcomments() {
        return trackcomments;
    }

    public void setTrackcomments(String trackcomments) {
        this.trackcomments = trackcomments;
    }

    public Track() {
    }

    public Track(int trackId, String trackName, String trackcomments) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackcomments = trackcomments;
    }*/
}





