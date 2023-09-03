package com.doctorapp.spring.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doctorapp.spring.jdbc.dals.CredentialsDAL;
import com.doctorapp.spring.jdbc.dao.DoctorDAO;
import com.doctorapp.spring.jdbc.model.AppointmentSchedule;
import com.doctorapp.spring.jdbc.model.DoctorsList;


@Controller
public class DoctorController {
	DoctorDAO doctordao;
	CredentialsDAL c;
	
	@Autowired
	public DoctorController(DoctorDAO doctordao) {
		this.doctordao = doctordao;
	}
	

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String user(Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String userlogin(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
		c = new CredentialsDAL(username, password);
	    if (c.verification()) {
	    	List<DoctorsList> al=doctordao.getAllDoctorList();
			model.addAttribute("DoctorList", al);
	        return "doctorsdetails"; 
	    } else {
	        return "login"; 
	    }
	}
	
	@RequestMapping(value = "/doctordetails", method = RequestMethod.POST)
	public String getdoctordetails(@RequestParam("doctorId") String id,Model model) {
		int ID=Integer.parseInt(id);
		model.addAttribute("doctor",doctordao.getDoctorById(ID));
		return "doctor";
	}
	
	@RequestMapping(value = "/doctorCalendar", method = RequestMethod.GET)
	public String doctorCalender(@RequestParam("doctorId") String id, Model model) {
		int ID=Integer.parseInt(id);
		model.addAttribute("doctorSchedule", doctordao.getAppointmentScheduleById(ID));
		//System.out.println(doctorid);
		return "DoctorCalendar";
	}
	
	@RequestMapping(value = "/getDoctorSchedule", method = RequestMethod.GET)
	@ResponseBody
	public List<AppointmentSchedule> doctorSchedule(@RequestParam("doctorid") int doctorid, Model model) {
		return doctordao.getAppointmentScheduleById(doctorid);
	}	
	
}
