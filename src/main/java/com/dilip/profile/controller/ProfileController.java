package com.dilip.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dilip.profile.beans.Profile;
import com.dilip.profile.service.ProfileService;

@RestController
public class ProfileController {

	@Autowired
	ProfileService profileService;

	@GetMapping(value = "profile/view")
	public Profile viewProfile(@RequestParam("mobileNumber") String mobileNumber) {
		
		return profileService.viewProfile(mobileNumber);

	}

	@PostMapping(value = "profile/create")
	public String createProfile(@RequestBody Profile profile) {
		profileService.createProfile(profile);
		return null;

	}

	@PostMapping(value = "profile/update")
	public String updateProfile(@RequestBody Profile profile) {
		return null;

	}

	@DeleteMapping(value = "profile/delete")
	public boolean deleteProfile(@PathVariable("mobileNumber") int mobileNumber) {
		return false;

	}
}
