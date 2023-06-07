package com.mahagn.SpringbootSecondApplicationWithMySqldb.controller;

import com.mahagn.SpringbootSecondApplicationWithMySqldb.domain.Patient;
import com.mahagn.SpringbootSecondApplicationWithMySqldb.service.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    PatientServiceImpl patientService;

    @PostMapping("/patient")
    //save the operation
    public Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @GetMapping("/patient")
    //read the operation
    public List<Patient> fetchPatientList() {
        return patientService.fetchPatientList();
    }

    @PutMapping("/patient/{id}")
    //update the operation
    public Patient updatePatient(@RequestBody Patient patient, @PathVariable("id") int idpatient) {
        return patientService.updatePatient(patient, idpatient);
    }

    @DeleteMapping("/patient/{id}")
    //Delete the operation
    public String deletePatientById(@PathVariable("id") int idpatient) {
        patientService.deletePatientById(idpatient);
        return "Resources has been deleted successfully";


    }


}
