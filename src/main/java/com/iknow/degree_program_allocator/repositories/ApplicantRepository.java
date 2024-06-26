package com.iknow.degree_program_allocator.repositories;


import com.iknow.degree_program_allocator.models.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Long> {


    List<Applicant> findAllByIsAllocated(boolean isAllocated);
}
