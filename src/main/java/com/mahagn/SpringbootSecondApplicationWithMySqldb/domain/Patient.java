package com.mahagn.SpringbootSecondApplicationWithMySqldb.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient{
    @Id
    @GeneratedValue
    private int idpatient;
    private String patientname;
    private String patientaddress;

}









