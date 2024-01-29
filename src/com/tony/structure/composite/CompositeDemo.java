package com.tony.structure.composite;

import com.tony.structure.composite.pojo.Employee;

public class CompositeDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("tony", "CEO", 10000000);
        Employee headSales = new Employee("Robert", "Head Sales", 100000);
        Employee headMarketing = new Employee("jack", "Head Marketing", 100000);

        Employee check1 = new Employee("bob", "Marketing", 10000);
        Employee check2 = new Employee("laura", "Marketing", 10000);

        Employee sales1 = new Employee("rob", "Sales", 10000);
        Employee sales2 = new Employee("tom", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(sales1);
        headSales.add(sales2);

        headMarketing.add(check1);
        headMarketing.add(check2);

        System.out.println(CEO);

        for (Employee employee : CEO.getSubordinate()) {
            System.out.println(employee);
            for (Employee employee1 : employee.getSubordinate()) {
                System.out.println(employee1);
            }
        }
    }
}
