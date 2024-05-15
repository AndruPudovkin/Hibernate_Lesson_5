package com.andru.spring.rest.service;

import com.andru.spring.rest.entity.Department;
import com.andru.spring.rest.entity.Employee;

import java.util.List;

public interface DepartmentService {
    public List<Department> getAllDepartments();

    public void saveEmployee(Department department);

    public Department getDepartment(int id);

    public void deleteDepartment(int id);
}
