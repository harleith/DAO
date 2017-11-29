package com.valensi.dao;

import com.valensi.model.Person;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class PersonDAO {

    public Person findPerson (String nama) {
        Person person = new Person();
        try {
        Scanner scan = new Scanner(new File("E:/persondata.txt"));
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] data = line.split(",");
            if(data[0].equalsIgnoreCase(nama)) {
                person.setName(data[0]);
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
                Date tglLahir = sdf.parse(data[1]);
                person.setDateOfBirth(tglLahir);
                person.setInfoBirthday(person.getAge() + " Tahun");
                break;
              }
        }
        } catch (FileNotFoundException fileErr) {
            System.out.println("File tidak di terimkan");
        } catch (ParseException pe) {
            System.out.println("Parsin tanggal salah");
        }
            return person;

    //mengambil data dari data source
//    Calendar cal = GregorianCalendar.getInstance();
//    cal.set(1990, 3, 15); // 15 april 1990
//    Date dob = cal.getTime();
//    Person person = new Person("Johnson", dob);
}
    
    public Person createPerson(String nama, Date dob) {
    Person person = new Person(nama, dob);
    //nanti di simpan ke database
    return person;
    }
    
    public List<Person> getPersonList(){
        List<Person> personList = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("E:/persondata.txt"));
            while (scan.hasNextLine()) {
                Person person = new Person();
                String line = scan.nextLine();
                String[] data = line.split(",");

                person.setName(data[0]);
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
                Date tglLahir = sdf.parse(data[1]);
                person.setDateOfBirth(tglLahir);
                person.setInfoBirthday(person.getAge() + "tahun");

                personList.add(person);
              
        }
        } catch (FileNotFoundException fileErr) {
            System.out.println("File tidak di terimkan");
        } catch (ParseException pe) {
            System.out.println("Parsin tanggal salah");
        }
            
        return personList;
    }
    
    public boolean deletePerson(Person person) {
        // hapus dari data source
        return true;
    }
    
    public Person updatePerson (Person person) {
        //update data source
        return person;
    }
    
}
