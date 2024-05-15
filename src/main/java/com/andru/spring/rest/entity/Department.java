package com.andru.spring.rest.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "department_name")
    private String name;
    @Column(name = "salaryAverage")
    private int salaryAverage;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "departmentEmployee")
    @Fetch(FetchMode.SELECT)
    @BatchSize(size = 10)
    @JsonIgnore
    private List<Employee> emps;

    public Department() {
    }

    public Department(String name, int salaryAverage) {
        this.name = name;
        this.salaryAverage = salaryAverage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryAverage() {
        return salaryAverage;
    }

    public void setSalaryAverage(int salaryAverage) {
        this.salaryAverage = salaryAverage;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }
}
