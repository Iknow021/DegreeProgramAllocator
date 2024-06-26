package com.iknow.degree_program_allocator.services;

import com.iknow.degree_program_allocator.exceptions.DataNotFoundException;
import com.iknow.degree_program_allocator.models.Faculty;
import com.iknow.degree_program_allocator.repositories.FacultyRepository;
import com.nkosi.programallocator.dtos.FacultyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FacultyService {

    private final FacultyRepository facultyRepository;


    public Faculty addFaculty(FacultyDto facultyDto){

        return facultyRepository.save(Faculty.builder()
                .facultyCode(facultyDto.getFacultyCode())
                .facultyName(facultyDto.getFacultyName())
                .build()
        );

    }

    public Faculty getFaculty(String facultyCode){

        return facultyRepository.findByFacultyCode(facultyCode)
                .orElseThrow(() ->
                        new DataNotFoundException("Failed to find department with the given facultyCode"
                                .concat(" ").concat(facultyCode)));
    }

}
