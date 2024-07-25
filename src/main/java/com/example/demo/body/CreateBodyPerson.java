package com.example.demo.body;

import java.sql.Date;
import java.util.Calendar;

public class CreateBodyPerson {
    private String lastName;
    private String firstName;
    private int age;
    private Date birthDate;
    
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return calculateAge(birthDate);
    }
    public Date getBirthDate() {
        return birthDate;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public void setAge(int age) {
        this.age = age;
    }


    private int calculateAge(Date birthDate) {
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        Calendar today = Calendar.getInstance();
        System.out.println("here is brithdate  " + birthDate);
        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        System.out.println(today);
        if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        System.out.println("birth day of year" + birth.get(Calendar.DAY_OF_YEAR));
        return age;
    }
}
