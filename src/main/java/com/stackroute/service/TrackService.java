package com.stackroute.service;



import com.stackroute.domain.Track;
import com.stackroute.exceptions.GlobalException;
import com.stackroute.exceptions.TrackAlreadyExistsException;
import com.stackroute.exceptions.TrackNotFoundException;

import java.util.List;

public interface TrackService {

    public Track savingTrack(Track track) throws TrackAlreadyExistsException;
    //public List<Track> getAllTracksByNameById(String trackName, int trackId) throws TrackNotFoundException;

    public boolean deleteTrack(Track track) throws TrackNotFoundException;
    public Track searchTrack(Track track) throws TrackNotFoundException;
    public List<Track> getAllTracks();
    public Track updateComment(Track track) throws GlobalException;



}
