package com.samsung;

import com.samsung.model.Person;
import com.samsung.model.Student;
import com.samsung.service.PersonDemo;
import com.samsung.service.PersonPrinter;
import com.samsung.service.StudentPrinter;

public class Main {
    public static void main(String[] args)
    {
        PersonDemo p1 = new PersonDemo();
        p1.printAll();
    }
}
