package com.example.demo.body;

public class CreateBodyPerson {
    private int id;
    private String lastName;
    private String firstName;
    private int age;
    
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }
    public int getId(){
        return id;
    }

    
    public void setId(int id){
        this.id = id;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
