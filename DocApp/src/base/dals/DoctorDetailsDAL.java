package base.dals;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import base.daos.DoctorDetailsDAO;
import base.models.AppointmentSchedule;
import base.models.Doctor;
import base.utils.AppointmentScheduleMapper;
import base.utils.DoctorMapper;

public class DoctorDetailsDAL implements DoctorDetailsDAO {

	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_DOCTOR = "select \r\n"
			+ "d.doctorid, d.fullname,d.photo,d.designation, d.qualification, d.experience, s.specializationname\r\n"
			+ "from \r\n" + "	doctor d, \r\n" + "	specialization s\r\n" + "where \r\n"
			+ "	(s.specializationid = d.specializationid) and doctorid = ?";

	private final String SQL_GET_ALL_DOCTORS = "select \r\n"
			+ "d.doctorid, d.fullname,d.photo,d.designation, d.qualification, d.experience, s.specializationname\r\n"
			+ "from \r\n" + "	doctor d, \r\n" + "	specialization s\r\n" + "where \r\n"
			+ "	(s.specializationid = d.specializationid)";

	private final String SQL_DOCTOR_SCHEDULE = "select * from appointmentsslotcalendar where slotdoctorid = ?";

	@Autowired
	public DoctorDetailsDAL(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Doctor> getAllDoctorsInfo() {
		return jdbcTemplate.query(SQL_GET_ALL_DOCTORS, new DoctorMapper());
	}

	@Override
	public Doctor getDoctorInfoById(int docid) {
		return jdbcTemplate.queryForObject(SQL_FIND_DOCTOR, new Object[] { docid }, new DoctorMapper());
	}

	@Override
	public List<AppointmentSchedule> getAppointmentScheduleById(int docid) {
		return jdbcTemplate.query(SQL_DOCTOR_SCHEDULE, new Object[] { docid }, new AppointmentScheduleMapper());
	}

}