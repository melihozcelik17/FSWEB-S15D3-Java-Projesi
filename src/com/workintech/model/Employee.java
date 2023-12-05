package com.workintech.model;

import java.util.Objects;

public class Employee {
    private int id;
    private String firtname;
    private String lastname;

    public Employee(int id, String firtname, String lastname) {
        this.id = id;
        this.firtname = firtname;
        this.lastname = lastname;
    }

    //eşitliğe bakacaksak eğer equals metotunu ezmeliyiz.
    //eşitliğine bakacağımız obje Hash geçen bir veri yapıda tutulacaksa HashCode metoduda ezmeliyiz
    //compareTo => comparable sorting.


    //sadece liste olsa equals yeterli olacaktı.


    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

