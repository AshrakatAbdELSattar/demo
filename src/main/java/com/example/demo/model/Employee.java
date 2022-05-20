package com.example.demo.model;

public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private Double salary;
    private Integer depId;


    public Employee(){

    }
    public Employee (Integer id, String firstName, String lastName , Double salary,Integer depId ){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
        this.depId=depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }
}
