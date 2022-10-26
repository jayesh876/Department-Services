package com.microservice.department.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue
    private Long departmentId;
    @Column
    private String departmentName;
    @Column
    private String departmentCode;
}
