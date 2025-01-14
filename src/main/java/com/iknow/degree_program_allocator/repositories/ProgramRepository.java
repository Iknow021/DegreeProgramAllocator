package com.iknow.degree_program_allocator.repositories;


import com.iknow.degree_program_allocator.models.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramRepository extends JpaRepository<Program,Long> {
    List<Program> findAllByIsVacant(boolean isVacant);
}
