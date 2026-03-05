package org.example.cli.impl;

import org.example.cli.CliTask;
import org.example.third.Employee;
import org.example.third.EmployeeService;
import org.jline.reader.LineReader;

import java.util.ArrayList;
import java.util.List;

public class ThirdTask implements CliTask {

    private final EmployeeService employeeService = new EmployeeService();

    @Override
    public String name() {
        return "Stream API (мапинг из Employee в Имя - Отдел)";
    }

    @Override
    public void run(LineReader reader) {

        List<Employee> employees = createEmployees();
        System.out.println("Сотрудники:");
        employees.forEach(e ->
                System.out.println(e.getFullName() + ", " + e.getDepartment() + ", " + e.getSalary()));

        List<String> result = employeeService.convertToNameDepartment(employees);
        System.out.println("\nРезультат маппинга:");
        result.forEach(System.out::println);
    }

    private List<Employee> createEmployees() {
        return List.of(
                new Employee("Эль Карнитино", 25, "Забойный отдел", 80_000d),
                new Employee("Протич Барабанов", 32, "Мудрый отдел", 60_000d),
                new Employee("Штиль певучий", 28, "Плохой отдел", 90_000d),
                new Employee("Эрнесто Плов", 35, "Странный отдел", 120_000d),
                new Employee("Венидикт Ключев", 410, "Отдел по турнирам в нарды", 150_000_000d)
        );
    }
}
