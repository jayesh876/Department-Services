package com.microservice.department.service;

import com.microservice.department.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> getAllDepartments();


}
