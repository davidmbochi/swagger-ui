package com.restapitest.swarggerui.repository;

import com.restapitest.swarggerui.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeRepository {
    public List<Employee> getEmployees() {
       return List.of(
               new Employee(1,
                       "john",
                       "doe",
                       "john@javawhizz.com"),
               new Employee(2,
                       "mary",
                       "public",
                       "mary@javawhizz.com"),
               new Employee(3,
                       "charles",
                       "darwin",
                       "charles@javawhizz.com")
       );
    }
}
