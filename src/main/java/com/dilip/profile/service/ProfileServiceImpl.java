package com.dilip.profile.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.dilip.profile.beans.Profile;
import com.dilip.profile.exception.ProfileNotFoundException;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public Profile viewProfile(String mobileNumber) {
		Query query = new Query();
		query.addCriteria(Criteria.where("mobileNubmer").is(mobileNumber));
		Profile profile = mongoTemplate.findOne(query, Profile.class);
		if (profile == null) {
			throw new ProfileNotFoundException(mobileNumber);
		}

		return profile;
	}

	@Override
	public String createProfile(Profile profile) {
		// TODO Auto-generated method stub
		mongoTemplate.save(profile);
		return null;
	}

	@Override
	public String updateProfile(Profile profile) {
		// TODO Auto-generated method stub
		// mongoTemplate.findAndModify(query, update, entityClass)
		return null;
	}

	@Override
	public boolean deleteProfile(int mobileNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
