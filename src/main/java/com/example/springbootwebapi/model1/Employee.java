package com.example.springbootwebapi.model1;

public class Employee {
    private  Integer id;
    private  String uid;
    private  String firstname;
    private  String lastname;

    public Employee(int id, String uid, String firstname, String lastname) {
        this.id = id;
        this.uid = uid;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}
