package com.samsung.service;

import com.samsung.model.Person;

public class PersonPrinter implements Printer{


    @Override
    public void printInfo(Person p) {
        System.out.println(p.getAge()+ " "+p.getFirstName()+" "+ p.getSecondName()+" ");
        if(p.getPhone() != null)
        {
            System.out.println(p.getPhone());
        }

    }
}
