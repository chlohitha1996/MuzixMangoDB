package com.stackroute.Repository;

import com.stackroute.Domain.Track;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {




}