package com.iknow.degree_program_allocator.repositories;


import com.iknow.degree_program_allocator.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Optional<Department> findByDepartmentCode(String departmentCode);
}
