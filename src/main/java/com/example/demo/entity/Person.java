package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String firstName;
    private String lastName;
    
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    private int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public long getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
}