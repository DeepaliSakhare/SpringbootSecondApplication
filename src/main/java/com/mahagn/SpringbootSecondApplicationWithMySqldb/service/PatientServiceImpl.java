package com.mahagn.SpringbootSecondApplicationWithMySqldb.service;

import com.mahagn.SpringbootSecondApplicationWithMySqldb.domain.Patient;
import com.mahagn.SpringbootSecondApplicationWithMySqldb.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }


    public List<Patient> fetchPatientList() {

        return (List<Patient>) patientRepository.findAll();
    }


    public Patient updatePatient(Patient patient, int idpatient) {
        Patient patient1 = patientRepository.findById(idpatient).get();

        if (Objects.nonNull(patient.getIdpatient())
                && !"".equalsIgnoreCase(patient.getPatientname())) {
            patient1.setPatientname(patient.getPatientname());
        }
        if (Objects.nonNull(patient.getIdpatient())
                && !"".equalsIgnoreCase(patient.getPatientaddress())) {
            patient1.setPatientaddress(patient.getPatientaddress());
        }
        return patientRepository.save(patient1);

    }

    public void deletePatientById(int idpatient) {
        patientRepository.deleteById(idpatient);

    }
}
