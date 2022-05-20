package com.example.demo.model;

public class Department {
    private Integer id;
    private String depName;
    private Integer countOfEmp;
    public Department(){

    }
    public Department(Integer id,String depName,Integer countOfEmp){
        this.id=id;
        this.depName=depName;
        this.countOfEmp=countOfEmp;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepName() {
        return depName;
    }

    public void setCountOfEmp(Integer countOfEmp) {
        this.countOfEmp = countOfEmp;
    }

    public Integer getCountOfEmp() {
        return countOfEmp;
    }
}
