package com.andru.spring.rest.dao;

import com.andru.spring.rest.entity.Department;
import com.andru.spring.rest.entity.Employee;

import java.util.List;

public interface DepartmentDAO {
    public List<Department> getAllDepartments();

    public void saveDepartment(Department department);

    public Department getDepartment(int id);
    public void deleteDepartment(int id);
}
