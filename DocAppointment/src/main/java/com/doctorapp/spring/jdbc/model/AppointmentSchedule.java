package com.doctorapp.spring.jdbc.model;

public class AppointmentSchedule {
	private int slotid;
	private int slotdoctorid;
	private String slotdate;
	private String slotfrom;
	private String slotto;
	private String slotstatus;
	
	public AppointmentSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getSlotid() {
		return slotid;
	}
	public void setSlotid(int slotid) {
		this.slotid = slotid;
	}
	public int getSlotdoctorid() {
		return slotdoctorid;
	}
	public void setSlotdoctorid(int slotdoctorid) {
		this.slotdoctorid = slotdoctorid;
	}
	public String getSlotdate() {
		return slotdate;
	}
	public void setSlotdate(String slotdate) {
		this.slotdate = slotdate;
	}
	public String getSlotfrom() {
		return slotfrom;
	}
	public void setSlotfrom(String slotfrom) {
		this.slotfrom = slotfrom;
	}
	public String getSlotto() {
		return slotto;
	}
	public void setSlotto(String slotto) {
		this.slotto = slotto;
	}
	public String getSlotstatus() {
		return slotstatus;
	}
	public void setSlotstatus(String slotstatus) {
		this.slotstatus = slotstatus;
	}


}
