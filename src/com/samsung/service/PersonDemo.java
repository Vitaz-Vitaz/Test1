package com.samsung.service;

import com.samsung.model.Person;
import com.samsung.model.Student;
import com.samsung.service.PersonPrinter;
import com.samsung.service.StudentPrinter;

public class PersonDemo {
    public void printAll(){
        Person p = new Person(14,"Kirill","Koribsky");
        Person p1 = new Person(15,"Ivan","Ivanov","+79255697725");
        Person s = new Student(21,"Kl","Ky");
        PersonPrinter printp = new PersonPrinter();

        printp.printInfo(p);
        printp.printInfo(p1);
        StudentPrinter ps = new StudentPrinter();
        ps.printInfo(s);
    }

}
