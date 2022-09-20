package com.company;

import java.util.Comparator;

//Сортировка по среднему баллу
class StudentAverage implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAverage() > o2.getAverage()){
            return 1;
        } else {
            return -1;
        }
    }
}