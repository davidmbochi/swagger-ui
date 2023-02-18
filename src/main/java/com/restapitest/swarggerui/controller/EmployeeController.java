package com.restapitest.swarggerui.controller;

import com.restapitest.swarggerui.model.Employee;
import com.restapitest.swarggerui.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee findEmployeeById(@PathVariable("id") Integer id) {
        return employeeRepository.getEmployees()
                .stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElse(null);

    }
}
