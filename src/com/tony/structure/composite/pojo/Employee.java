package com.tony.structure.composite.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinate;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinate = new ArrayList<>();
    }

    public void add(Employee employee) {
        if (!subordinate.contains(employee))
            subordinate.add(employee);
    }

    public void remove(Employee employee) {
        subordinate.remove(employee);
    }

    public List<Employee> getSubordinate() {
        return subordinate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept) && Objects.equals(subordinate, employee.subordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dept, salary, subordinate);
    }
}
