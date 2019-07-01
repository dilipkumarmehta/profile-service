package com.dilip.profile.beans;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Profile")
public class Profile {
	private String name;
	private String email;
	private String mobileNubmer;
	private Address address;
	private KycDetails kycDetails;
	private AdditionDetail additionDetails;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNubmer() {
		return mobileNubmer;
	}

	public void setMobileNubmer(String mobileNubmer) {
		this.mobileNubmer = mobileNubmer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public KycDetails getKycDetails() {
		return kycDetails;
	}

	public void setKycDetails(KycDetails kycDetails) {
		this.kycDetails = kycDetails;
	}

	public AdditionDetail getAdditionDetails() {
		return additionDetails;
	}

	public void setAdditionDetails(AdditionDetail additionDetails) {
		this.additionDetails = additionDetails;
	}

}
