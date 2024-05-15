package com.andru.spring.rest.service.Impl;

import com.andru.spring.rest.dao.DepartmentDAO;
import com.andru.spring.rest.entity.Department;
import com.andru.spring.rest.entity.Employee;
import com.andru.spring.rest.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDAO departmentDAO;

    @Override
    @Transactional
    public List<Department> getAllDepartments() {
        return departmentDAO.getAllDepartments();
    }

    @Override
    @Transactional
    public void saveEmployee(Department department) {
        departmentDAO.saveDepartment(department);
    }

    @Override
    @Transactional
    public Department getDepartment(int id) {
        return departmentDAO.getDepartment(id);
    }

    @Override
    @Transactional
    public void deleteDepartment(int id) {
        departmentDAO.deleteDepartment(id);
    }
}
