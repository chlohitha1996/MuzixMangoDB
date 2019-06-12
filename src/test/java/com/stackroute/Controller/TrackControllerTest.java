package com.stackroute.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
<<<<<<< HEAD
import com.stackroute.domain.Track;
import com.stackroute.exceptions.GlobalException;
import com.stackroute.exceptions.TrackNotFoundException;
import com.stackroute.service.TrackService;
import com.stackroute.exceptions.TrackAlreadyExistsException;
=======
import com.stackroute.Domain.Track;
import com.stackroute.Exceptions.GlobalException;
import com.stackroute.Exceptions.TrackNotFoundException;
import com.stackroute.Service.TrackService;
import com.stackroute.Exceptions.TrackAlreadyExistsException;
import org.junit.Assert;
>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest
public class TrackControllerTest {

    @Autowired
    private MockMvc mockMvc;
    private Track track;
    @MockBean
    private TrackService trackService;
    @InjectMocks
    private TrackController trackControl;

    private List<Track> list = null;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(trackControl).build();
        track = new Track();
        track.setTrackId(67);
        track.setTrackName("Shailendra");
        track.setTrackcomments("Stay a little longer with me");
        list = new ArrayList();
        list.add(track);
    }



    @Test
<<<<<<< HEAD
    public void givenSaveTrackExpectedTrackSaved() throws Exception {
=======
    public void GivenSaveTrack_ExpectedTrackSaved() throws Exception {
>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
        when(trackService.savingTrack(any())).thenReturn(track);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/track")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andDo(MockMvcResultHandlers.print());


    }

    @Test
<<<<<<< HEAD
    public void givenSaveTrackExpectedTrackSavedFailure() throws Exception {
=======
    public void GivenSaveTrack_ExpectedTrackSavedFailure() throws Exception {
>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
        when(trackService.savingTrack(any())).thenThrow(TrackAlreadyExistsException.class);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/track")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
                .andExpect(MockMvcResultMatchers.status().isConflict())
                .andDo(MockMvcResultHandlers.print());
    }




    @Test
<<<<<<< HEAD
    public void givenShowAllTracksExpectedReturnAllTracks() throws Exception {
=======
    public void GivenShowAllTracks_ExpectedReturnAllTracks() throws Exception {
>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
        when(trackService.getAllTracks()).thenReturn(list);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/track")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());

    }
<<<<<<< HEAD


    @Test
    public void givenToUpdateTrackCommentsExpectedReturnUpdatedTrack() throws Exception, GlobalException {
=======
   /* @Test
    public void GivenTrackByNameById_ExpectedReturnTrack() throws Exception {
        when(trackService.getAllTracksByNameById((track.getTrackName()),track.getTrackId())).thenReturn(list);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/track/Shailendra/67")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }*/

    @Test
    public void GivenToUpdateTrackComments_ExpectedReturnUpdatedTrack() throws Exception, GlobalException {
>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
        when(trackService.updateComment(track)).thenReturn(track);
        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/track/id")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());

    }
    @Test
<<<<<<< HEAD
    public void givenToUpdateTrackCommentsFailureExpectedUpdationTrackFailure()throws Exception, GlobalException {
=======
    public void GivenToUpdateTrackCommentsFailure_ExpectedUpdationTrackFailure()throws Exception, GlobalException {
>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
        when(trackService.updateComment(any())).thenThrow(GlobalException.class);
        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/track/id")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
                .andExpect(MockMvcResultMatchers.status().isConflict())
                .andDo(MockMvcResultHandlers.print());

    }
    @Test
<<<<<<< HEAD
    public void givenToDeleteTrackExpectedDeleteSpecifiedTrack() throws Exception {
=======
    public void GivenToDeleteTrack_ExpectedDeleteSpecifiedTrack() throws Exception {
>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
        when(trackService.deleteTrack(track)).thenReturn(true);
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/track/67")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());

    }
    @Test
<<<<<<< HEAD
    public void givenToDeleteTrackExpectedDeleteSpecifiedTrackFailure() throws Exception {
=======
    public void GivenToDeleteTrack_ExpectedDeleteSpecifiedTrackFailure() throws Exception {
>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
        when(trackService.deleteTrack(track)).thenThrow(TrackNotFoundException.class);
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/track/67")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(track)))
                .andExpect(MockMvcResultMatchers.status().isConflict())
                .andDo(MockMvcResultHandlers.print());

    }


    private static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




}