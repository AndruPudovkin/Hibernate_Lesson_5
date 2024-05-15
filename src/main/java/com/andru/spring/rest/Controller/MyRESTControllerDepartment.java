package com.andru.spring.rest.Controller;

import com.andru.spring.rest.entity.Department;
import com.andru.spring.rest.entity.Employee;
import com.andru.spring.rest.execption_handing.NoSuchEmployeeException;
import com.andru.spring.rest.service.DepartmentService;
import com.andru.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTControllerDepartment {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> showAllDepartments(){
        List<Department> allDepartments = departmentService.getAllDepartments();
        return allDepartments;
    }

    @GetMapping("/departments/{id}")
    public Department getDepartment(@PathVariable int id){
        Department department = departmentService.getDepartment(id);

        if(department == null){
            throw new NoSuchEmployeeException("There is no employee with ID = " + id + " in Database");
        }
        return department;
    }

    @PostMapping("/departments")
    public Department addNewDepartment (@RequestBody Department department){
        departmentService.saveEmployee(department);
        return department;
    }

    @PutMapping("/departments")
    public Department updateDepartment(@RequestBody Department department){
        departmentService.saveEmployee(department);
        return department;
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartment(@PathVariable int id){
        Department department = departmentService.getDepartment(id);
        if (department == null){
            throw new  NoSuchEmployeeException("There is no employee with ID = " + id + " in Database");

        }
        departmentService.deleteDepartment(id);
        return "Employee with ID = " + id + " was deleted";
    }

}
