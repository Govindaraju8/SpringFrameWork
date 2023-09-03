package com.doctorapp.spring.jdbc.model;

public class DoctorsList {
	private int DoctorID;
	private String Fullname;
	private int SpecID;
	private String Qualification;
	private int Experience;
	private String Designation;
	private String Photo;
	
	
	public DoctorsList() {
		
	}


	public int getDoctorID() {
		return DoctorID;
	}


	public void setDoctorID(int doctorID) {
		DoctorID = doctorID;
	}


	public String getFullname() {
		return Fullname;
	}


	public void setFullname(String fullname) {
		Fullname = fullname;
	}


	public int getSpecID() {
		return SpecID;
	}


	public void setSpecID(int specID) {
		SpecID = specID;
	}


	public String getQualification() {
		return Qualification;
	}


	public void setQualification(String qualification) {
		Qualification = qualification;
	}


	public int getExperience() {
		return Experience;
	}


	public void setExperience(int experience) {
		Experience = experience;
	}


	public String getDesignation() {
		return Designation;
	}


	public void setDesignation(String designation) {
		Designation = designation;
	}


	public String getPhoto() {
		return Photo;
	}


	public void setPhoto(String photo) {
		Photo = photo;
	}
	
	
}
