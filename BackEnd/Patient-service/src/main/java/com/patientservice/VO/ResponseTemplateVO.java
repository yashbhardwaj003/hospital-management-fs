package com.patientservice.VO;

import com.patientservice.entity.Patient;


public class ResponseTemplateVO {

	private Patient patient;
	private Doctor doctor;
	
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseTemplateVO(Patient patient, Doctor doctor) {
		super();
		this.patient = patient;
		this.doctor = doctor;
	}
	@Override
	public String toString() {
		return "ResponseTemplateVO [patient=" + patient + ", doctor=" + doctor + "]";
	}
	
	
}
