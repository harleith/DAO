package com.valensi.model;

import java.util.Calendar;
import java.util.Date;
public class Person {

    private String name;
    private Date dateOfBirth;
    private String infoBirthday;

    public Person() {
    }

    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public int getAge() {
        Date sekarang = new Date();
        if(sekarang.before(dateOfBirth)) // kalau terus maka code di bawah tidak di eksekusi
            return 0;
        
        Calendar calNow = Calendar.getInstance();
        calNow.setTime(sekarang);
        Calendar calDob = Calendar.getInstance();
        calDob.setTime(dateOfBirth);
        int umur = calNow.get(Calendar.YEAR) - calDob.get(Calendar.YEAR);
        
        return umur;
    }

    /**
     * @return the infoBirthday
     */
    public String getInfoBirthday() {
        return infoBirthday;
    }

    /**
     * @param infoBirthday the infoBirthday to set
     */
    public void setInfoBirthday(String infoBirthday) {
        this.infoBirthday = infoBirthday;
    }
    
}
