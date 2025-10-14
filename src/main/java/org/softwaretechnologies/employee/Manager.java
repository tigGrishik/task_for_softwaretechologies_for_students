package org.softwaretechnologies.employee;

public class Manager extends Employee{

    public Manager(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int getMonthSalary(int month) {
        return baseSalary/(1+month%2);
    }
}
