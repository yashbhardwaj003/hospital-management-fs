package com.patientservice.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.patientservice.VO.Doctor;
import com.patientservice.VO.ResponseTemplateVO;
import com.patientservice.entity.Patient;
import com.patientservice.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	 @Autowired
	    private RestTemplate restTemplate;

	public String savePatient(Patient patient) {
		
		 patientRepository.save(patient);
		 return "Hi " + patient.getPatientName()+ " your Registration process successfully completed";
	}

	public ResponseTemplateVO getPatientWithDoctor(Long patientId) {
		 ResponseTemplateVO vo = new ResponseTemplateVO();
	        Patient patient= patientRepository.findByPatientId(patientId);

	        Doctor doctor = restTemplate.getForObject("http://DOCTOR-SERVICE/doctors/"+patient.getDoctId(), Doctor.class);


	        vo.setPatient(patient);
	        vo.setDoctor(doctor);
	       	return vo ;
	}

	public Patient updatePatient(Long patientId, Patient patient) {
		Patient patDB = patientRepository.findById(patientId).get();
		
		if(Objects.nonNull(patient.getPatientName()) && !"".equalsIgnoreCase(patient.getPatientName())) {
            patDB.setPatientName(patient.getPatientName());
        }

		
		if(Objects.nonNull(patient.getDateOfVisit())) {
			patDB.setDateOfVisit(patient.getDateOfVisit());
		}
		if(Objects.nonNull(patient.getVisitedDoctor())) {
			patDB.setVisitedDoctor(patient.getVisitedDoctor());
		}
		if(Objects.nonNull(patient.getPrecription())) {
			patDB.setPrecription(patient.getPrecription());
		}

			return patientRepository.save(patDB);
	}

	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}
	
	public List<Patient> deletePatientById(Long patientId){
		patientRepository.deleteById(patientId);
		System.out.println("Doctor Deleted Successfully");
		return patientRepository.findAll();
	}
	
	


}
