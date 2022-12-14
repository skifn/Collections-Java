package com.company;

import java.util.Comparator;

//Сортировка по имени
class StudentName implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}