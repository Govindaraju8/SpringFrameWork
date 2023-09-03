package com.doctorapp.spring.jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class DoctorMapper implements RowMapper<DoctorsList>{

	@Override
	public DoctorsList mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		DoctorsList doc = new DoctorsList();
		doc.setDoctorID(resultSet.getInt("doctorid"));
		doc.setFullname(resultSet.getString("fullname"));
		doc.setSpecID(resultSet.getInt("specializationid"));
		doc.setQualification(resultSet.getString("qualification"));
		doc.setExperience(resultSet.getInt("experience"));
		doc.setDesignation(resultSet.getString("designation"));
		doc.setPhoto(resultSet.getString("photo"));
		return doc;
		
	}

}
