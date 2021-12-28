package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;

public class StudentPrinter implements Printer{
    @Override
    public void printInfo(Person p) {

        System.out.println(p.getAge()+ " "+p.getFirstName()+" "+ p.getSecondName()+" ");
        if(p.getPhone() != null)
        {
            System.out.println(p.getPhone());
        }
        System.out.println(((Student)p).getGroup());
        System.out.println(((Student)p).getScore());


    }
}
