package com.iknow.degree_program_allocator.services;

import com.iknow.degree_program_allocator.models.Applicant;
import com.iknow.degree_program_allocator.repositories.ApplicantRepository;
import com.nkosi.programallocator.dtos.ApplicantDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    public Applicant registerApplicant(ApplicantDto applicantDto){

        return applicantRepository.save(Applicant.builder()
                .firstname(applicantDto.getFirstname())
                .lastname(applicantDto.getLastname())
                .combination(applicantDto.getCombination())
                .points(applicantDto.getPoints())
                .facultyOfInterest(applicantDto.getFacultyOfInterest().name())
                .previousSchool(applicantDto.getPreviousSchool())
                .isAllocated(false)
                .build()
        );
    }

    public List<Applicant> getAllUnAllocatedApplicants(){
        return applicantRepository.findAllByIsAllocated(false);
    }


    public void updateApplicantStatus(Applicant applicant,Boolean isAllocated) {

        applicant.setIsAllocated(isAllocated);

        applicantRepository.save(applicant);
    }
}
