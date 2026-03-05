package org.example.third;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public List<String> convertToNameDepartment(List<Employee> employees) {
        return employees.stream()
                .map(emp -> emp.getFullName() + " - " + emp.getDepartment())
                .collect(Collectors.toList());
    }
}
