package com.patientservice.VO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long doctId;
	private String docName;
	private Integer doctAge;
	private String doctGender;
	private Long  numberOfpatientAttneded;
	private String doctSpecialist;
	
	
	public String getDoctSpecialist() {
		return doctSpecialist;
	}
	public void setDoctSpecialist(String doctSpecialist) {
		this.doctSpecialist = doctSpecialist;
	}
	public Long getDoctId() {
		return doctId;
	}
	public void setDoctId(Long doctId) {
		this.doctId = doctId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public Integer getDoctAge() {
		return doctAge;
	}
	public void setDoctAge(Integer doctAge) {
		this.doctAge = doctAge;
	}
	public String getDoctGender() {
		return doctGender;
	}
	public void setDoctGender(String doctGender) {
		this.doctGender = doctGender;
	}
	public Long getNumberOfpatientAttneded() {
		return numberOfpatientAttneded;
	}
	public void setNumberOfpatientAttneded(Long numberOfpatientAttneded) {
		this.numberOfpatientAttneded = numberOfpatientAttneded;
	}
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Doctor(Long doctId, String docName, Integer doctAge, String doctGender, Long numberOfpatientAttneded) {
		super();
		this.doctId = doctId;
		this.docName = docName;
		this.doctAge = doctAge;
		this.doctGender = doctGender;
		this.numberOfpatientAttneded = numberOfpatientAttneded;
		this.doctSpecialist = doctSpecialist;
	}
	@Override
	public String toString() {
		return "Doctor [doctId=" + doctId + ", docName=" + docName + ", doctAge=" + doctAge + ", doctGender="
				+ doctGender + ", numberOfpatientAttneded=" + numberOfpatientAttneded + ", doctSpecialist="
				+ doctSpecialist + "]";
	}
	
	
	}
	
