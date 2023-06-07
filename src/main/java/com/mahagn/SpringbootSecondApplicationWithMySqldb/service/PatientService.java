package com.mahagn.SpringbootSecondApplicationWithMySqldb.service;

import com.mahagn.SpringbootSecondApplicationWithMySqldb.domain.Patient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PatientService {
    // Save the operation
    Patient savePatient(Patient patient);

    //Read the operation
    List<Patient> fetchPatientList();

    // Update the operation
    Patient updatePatient(Patient patient, int idpatient);

    //Delete the operation
    void deletePatientById(int idpatient);


}
