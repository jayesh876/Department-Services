package com.microservice.department.controller;

import com.microservice.department.entity.Department;
import com.microservice.department.repository.DepartmentRepository;
import com.microservice.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /*
        URL : http://localhost:9001/department/saveDeparment
        Http Method : POST
        {
            "departmentName":"IT Department",
            "departmentCode":"IT001"
        }
     */

    @PostMapping(value = "/saveDepartment")
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        Department department1=departmentService.saveDepartment(department);
        return new ResponseEntity<Department>(department1, HttpStatus.CREATED);
    }

    @GetMapping(value = "/getAllDepartments")
    public ResponseEntity<List<Department>> getAllDepartments(){

        return new ResponseEntity<List<Department>>(departmentService.getAllDepartments(), HttpStatus.OK);
    }


}
