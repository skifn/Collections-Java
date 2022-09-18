package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


public class Task2 {

    public void test_adding(ArrayList<Integer> list) {
        Date startLinked = new Date();
        for (int i = 0; i < 1000000; i++) {
            //операция .add .insert. remove. get .set с начала середины, и конца списка
            list.add(i);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();
        System.out.println("ArrayList справился с добавлением за: " + linkedTime + " Миллисекунд\n");

    }

    public void test_deleting(ArrayList<Integer> list) {
        Date startLinked = new Date();
        for (int i = 0; i < 1000; i++) {
            //операция .add .insert. remove. get .set с начала середины, и конца списка
            list.remove(i);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();
        System.out.println("ArrayList справился с удалением за: " + linkedTime + " Миллисекунд\n");

    }

    public void test_adding(LinkedList<Integer> list) {
        Date startLinked = new Date();
        for (int i = 0; i < 1000000; i++) {
            //операция .add .insert. remove. get .set с начала середины, и конца списка
            list.add(i);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();
        System.out.println("LinkedList справился с добавлением за: " + linkedTime + " Миллисекунд\n");

    }

    public void test_deleting(LinkedList<Integer> list) {
        Date startLinked = new Date();
        for (int i = 0; i < 1000; i++) {
            //операция .add .insert. remove. get .set с начала середины, и конца списка
            list.remove(i);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();
        System.out.println("LinkedList справился с удалением за: " + linkedTime + " Миллисекунд\n");


    }

}
