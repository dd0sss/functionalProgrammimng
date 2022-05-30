package com.mahdi.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    new Thread(() -> {
        System.out.println("Printing from Runnable");
        System.out.println("Line 2");
        System.out.println("Line 3");
    }).start();

    Employee mahdi = new Employee("mahdi",25);
        Employee cengiz = new Employee("cengiz",26);
        Employee john = new Employee("john",30);
        Employee stefan = new Employee("stefan",50);

        List<Employee> employees =new ArrayList<>();
        employees.add(mahdi);
        employees.add(cengiz);
        employees.add(john);
        employees.add(stefan);

     //   Collections.sort(employees, new Comparator<Employee>() {
       //     @Override
         //   public int compare(Employee employee1, Employee employee2) {
          //      return employee1.getName().compareTo(employee2.getName());
         //   }
        //});
        Collections.sort(employees, (Employee employee1, Employee employee2)->employee1.getName().compareTo(employee2.getName()));

        for (Employee employee: employees){
            System.out.println(employee.getName());
        }
    }
}
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}