package com.example2.MoviesProject;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService 
{
	@Autowired
	private ReviewRepo repo;
	
    @Autowired
	private MongoTemplate mongoTemplate;
	
	public Reviews createReview(String reviewBody, String imdbId)
	{
		Reviews review = repo.insert(new Reviews(reviewBody, LocalDateTime.now(), LocalDateTime.now()));
		
		mongoTemplate.update(Movies.class)
        .matching(Criteria.where("imdbId").is(imdbId))
        .apply(new Update().push("reviewIds").value(review))
        .first();

    return review;
	}
}
