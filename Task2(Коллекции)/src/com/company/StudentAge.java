package com.company;

import java.util.Comparator;


//Сортировка по возрасту
class StudentAge implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        } else {
            return -1;
        }
    }
}