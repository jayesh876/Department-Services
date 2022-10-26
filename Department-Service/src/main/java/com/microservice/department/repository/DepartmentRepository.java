package com.microservice.department.repository;

import com.microservice.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    //Department getByDepartmentId(Long id);

    Department getByDepartmentName(String name);
}
