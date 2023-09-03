package com.doctorapp.spring.jdbc.dao;

import java.util.List;

import com.doctorapp.spring.jdbc.model.DoctorsList;
import com.doctorapp.spring.jdbc.model.AppointmentSchedule;



public interface DoctorDAO {
	
	List<DoctorsList> getAllDoctorList();

	DoctorsList getDoctorById(int doctorId);
	
	List<AppointmentSchedule> getAppointmentScheduleById(int docid);

		
	
}
