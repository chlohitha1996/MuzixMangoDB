package com.stackroute.repository;




import com.stackroute.domain.Track;
import com.stackroute.exceptions.TrackNotFoundException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TrackRepositoryTest {

    @Autowired
    private TrackRepository trackRepository;
    private Track track;

    @Before
    public void setUp()
    {
        track = new Track();
        track.setTrackId(10);
        track.setTrackName("John");
        track.setTrackcomments("John Deo");


    }

    @After
    public void tearDown(){

        trackRepository.deleteAll();
    }


    @Test
    public void givenToSaveTrackExpectedToSaveTrack(){  //Save track

      trackRepository.save(track);
        Track fetchTrack = trackRepository.findById(track.getTrackId()).get();
        assertEquals(10,fetchTrack.getTrackId());

    }

    @Test
    public void givenToHaveSaveTrackFailureExpectedNotToSaveTrack(){
        Track testUser = new Track(201,"John","John Deo");
        trackRepository.save(track);
        Track fetchUser = trackRepository.findById(track.getTrackId()).get();
        Assert.assertNotSame(testUser,track);
    }

    @Test
    public void givenToGetAllTrackReturnAllTracks(){
        Track t = new Track(102,"Johny","Jenny");
        Track t1 = new Track(103,"Johny","Jenny");
        trackRepository.save(t);
        trackRepository.save(t1);

        List<Track> list = trackRepository.findAll();
        assertEquals("Johny",list.get(1).getTrackName());

    }
    @Test
    public void givenTrackByNameByIdExpectedToReturnTrack() throws TrackNotFoundException {

        Track track3 = new Track(10, "John", "John Deo");
        trackRepository.existsById(track.getTrackId());
        Assert.assertEquals(track3, track);
    }


    //Updation


    @Test
    public void givenToUpdateTrackExpectedToUpdateTrackSuccessfully() {
        trackRepository.save(track);
        System.out.println(track);
       trackRepository.findById(track.getTrackId()).get().setTrackcomments("Vizag");
        Track fetchTrack = trackRepository.findById(track.getTrackId()).get();
         System.out.println(fetchTrack);
        assertEquals("Vizag",fetchTrack.getTrackcomments());

    }

    @Test
    public void givenUpdateTrackFailureExpectedFailureInUpdation() {
        Track testUser = new Track(17, "sakhi", "Panchandhaname");
        trackRepository.save(testUser);
        Track fetchTrack = trackRepository.findById(testUser.getTrackId()).get();
        Assert.assertNotSame(testUser, fetchTrack);
    }



    //DELETION

    @Test
    public void givenToDeleteTrackExpectedToDeleteSpecifiedTrack(){
        Track track=new Track(10,"John","John Doe");
        trackRepository.delete(track);
        boolean deletedTrack=trackRepository.existsById(14);
        assertEquals(false,deletedTrack);
    }
    @Test
    public void givenToDeleteTrackFailureExpectedFailureInDeletion(){
        Track track=new Track(13,"Lohi","Chatiivanipalem");
        trackRepository.delete(track);
        boolean deletedTrack=trackRepository.existsById(2);
        Assert.assertNotSame(true,deletedTrack);
    }


    }


