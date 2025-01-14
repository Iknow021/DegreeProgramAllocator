package com.nkosi.programallocator.dtos;

import com.nkosi.programallocator.enums.Faculty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicantDto {
    private String firstname;
    private String lastname;
    private String combination;
    private Integer points;
    private String previousSchool;
    private Faculty facultyOfInterest;
}
