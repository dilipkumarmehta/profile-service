package com.dilip.profile.service;

import com.dilip.profile.beans.Profile;

public interface ProfileService {

	public Profile viewProfile(String mobileNumber);

	public String createProfile(Profile profile);

	public String updateProfile(Profile profile);

	public boolean deleteProfile(int mobileNumber);

}
