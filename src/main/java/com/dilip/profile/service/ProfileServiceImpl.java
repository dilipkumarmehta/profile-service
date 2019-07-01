package com.dilip.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.dilip.profile.beans.Profile;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public Profile viewProfile(Profile profile) {
		// TODO Auto-generated method stub
		return null;
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
		return null;
	}

	@Override
	public boolean deleteProfile(int mobileNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
