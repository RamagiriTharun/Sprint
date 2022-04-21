package com.example.demo.Service;

import com.example.demo.Bean.Employee;
import com.example.demo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmp() {
        List<Employee> employeeList = new ArrayList<>();
        repository.findAll().forEach(x-> employeeList.add(x));
        return employeeList;
    }

    public Employee getEmpById(int empId) {
        return repository.findById(empId).get();
    }

    public Employee addEmp(Employee employee) {
        Employee emp = repository.save(employee);
        return emp;
    }

    public Employee updateEmp(Employee employee) {
        Employee emp = repository.save(employee);
        return emp;
    }

    public void deleteEmpId(int empId) {
        repository.deleteById(empId);
    }

    public void deleteAllEmp() {
        repository.deleteAll();
    }
}
