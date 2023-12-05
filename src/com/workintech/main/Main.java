package com.workintech.main;

import com.workintech.model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList<Employee> employees =new LinkedList<>();
        employees.add(new Employee(1,"Melih","özçelik"));
        System.out.println(employees);
    }

    Map<Integer,Employee> employeeMap=new HashMap<>();
    List<Employee>removedEmployess = new ArrayList<>();

    Iterator iterator= employees.iterator();
    while(iterator.hasNext()){
       Employee employee=(Employee) iterator.next();
       if(employeeMap.containsKey(employee.getId())){

       }else {
           employeeMap.put(employee.getId() , employee);
       }
    }

    employees.removeAll(removedEmployes);
}