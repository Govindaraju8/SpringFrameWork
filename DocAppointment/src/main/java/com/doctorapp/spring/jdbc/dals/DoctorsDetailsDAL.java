package com.doctorapp.spring.jdbc.dals;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.doctorapp.spring.jdbc.dao.DoctorDAO;
import com.doctorapp.spring.jdbc.model.DoctorsList;


import com.doctorapp.spring.jdbc.model.AppointmentSchedularMapper;
import com.doctorapp.spring.jdbc.model.AppointmentSchedule;
import com.doctorapp.spring.jdbc.model.DoctorMapper;


public class DoctorsDetailsDAL implements DoctorDAO{
	JdbcTemplate jdbcTemplate;
	@Autowired
	public DoctorsDetailsDAL(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	private final String SQL_FIND_DOCTOR = "select * from doctor where doctorid = ?";
	private final String SQL_DISPLAY_DOCTORSLIST= "SELECT * FROM DOCTOR";
	private final String SQL_DOCTOR_SCHEDULE = "select * from appointmentsslotcalendar where slotdoctorid = ?";


	@Override
	public List<DoctorsList> getAllDoctorList() {
		return jdbcTemplate.query(SQL_DISPLAY_DOCTORSLIST, new DoctorMapper());
	}

	@Override
	public DoctorsList getDoctorById(int doctorId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_FIND_DOCTOR, new Object[] { doctorId }, new DoctorMapper());
	}

	@Override
	public List<AppointmentSchedule> getAppointmentScheduleById(int docid) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_DOCTOR_SCHEDULE, new Object[] { docid }, new AppointmentSchedularMapper());
	}

	


}
