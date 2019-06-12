package com.stackroute.Controller;

<<<<<<< HEAD
import com.stackroute.domain.Track;
import com.stackroute.exceptions.GlobalException;
import com.stackroute.exceptions.TrackAlreadyExistsException;
import com.stackroute.exceptions.TrackNotFoundException;
import com.stackroute.service.TrackService;
=======
import com.stackroute.Domain.Track;
import com.stackroute.Exceptions.GlobalException;
import com.stackroute.Exceptions.TrackNotFoundException;
import com.stackroute.Service.TrackService;
>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class TrackController {
    TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping(value = "track")
<<<<<<< HEAD
    public ResponseEntity<Track> saveTrack(@RequestBody Track track) throws TrackAlreadyExistsException
    {
        ResponseEntity responseEntity;
        Track savedTrack=null;
        savedTrack = trackService.savingTrack(track);
        responseEntity = new ResponseEntity<Track>(savedTrack, HttpStatus.CREATED);
        return responseEntity;
    }
    @GetMapping(value = "track")
    public ResponseEntity<List<Track>> getAllTracks() throws  TrackNotFoundException
=======
    public ResponseEntity<Track> saveTrack(@RequestBody Track track)
    {
        ResponseEntity responseEntity;
        try {
            Track track1=trackService.savingTrack(track);
            responseEntity=new ResponseEntity<String>("Successfully Added Track", HttpStatus.CREATED);
        }
        catch (Exception e)
        {
            responseEntity=new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
            e.printStackTrace();
        }
        return responseEntity;
    }
    @GetMapping(value = "track")
    public ResponseEntity<List<Track>> getAllTracks()
>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
    {
        List<Track> track1=trackService.getAllTracks();
        return new ResponseEntity<List<Track>>(track1,HttpStatus.OK);
    }
    @RequestMapping(value="track/{id}",method=RequestMethod.PUT)
<<<<<<< HEAD
    public ResponseEntity<Track> updateTrack(@RequestBody Track track) throws TrackNotFoundException, GlobalException {

            ResponseEntity responseEntity;
            responseEntity=new ResponseEntity<Track>(trackService.updateComment(track), HttpStatus.OK);
            return responseEntity;
        }


    @DeleteMapping("track/{id}")
    public ResponseEntity<String> deleteTrack(@RequestBody Track track) throws TrackNotFoundException
    {
        ResponseEntity responseEntity;

            boolean answer=trackService.deleteTrack(track);
            responseEntity= new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
            return responseEntity;
    }


=======
    public ResponseEntity<Track> updateTrack(@RequestBody Track track) throws TrackNotFoundException
    {
        ResponseEntity responseEntity;
        try {
            Track track1=trackService.updateComment(track);
            return new ResponseEntity<Track>(track1,HttpStatus.OK);
        }
        catch (Exception | GlobalException e)
        {
            responseEntity=new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
            e.printStackTrace();
        }
        return responseEntity;
    }

    @DeleteMapping("track/{id}")
    public ResponseEntity<String> deleteTrack(@RequestBody Track track)
    {
        ResponseEntity responseEntity;
        try {
            boolean answer=trackService.deleteTrack(track);
            return new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
        }
        catch (Exception e)
        {
            responseEntity=new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
            e.printStackTrace();
        }
        return responseEntity;
    }






>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
}
