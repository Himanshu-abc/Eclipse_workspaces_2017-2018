package com.app.bean;

public class Employee {

    private int empId;
    private String name;
    private String city;
    private Double salary;

    public Employee() {
        super();

    }

    public Employee(int empId, String name, String city, Double salary) {
        this.empId = empId;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public String toString(){
        String s=String.format("%5d %-15s %-15s %10.2f", empId,name,city,salary);
        return s;
    }
}
