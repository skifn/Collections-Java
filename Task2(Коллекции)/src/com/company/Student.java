package com.company;

import java.util.*;

import static com.company.Main.*;

public class Student implements Comparable <Student> {

   String name;
   int age;
   int average_score;

    //Конструктор
    public Student(String name, int age, int average_score) {
        this.name = name;
        this.age = age;
        this.average_score = average_score;
    }

    //Считываем фамилии, возраст и средний балл в конструктор и создаем коллекцию TreeMap
    public static void get(TreeMap <Student, Integer> map) {
        String str;
        int age;
        int average;
        while(true) {
            str = in.nextLine(); //Читаем строку
            if(str.equals("stop")) //Если слово стоп видим - заканчиваем чтение
                break;
            //Если слово не stop, то
           else
                age = count.nextInt();
                average = digit.nextInt();

                //Ключом является средний балл
               map.put(new Student(str, age, average), average); //Отправляем в TreeMap
        }


    }

    //Считываем фамилии, возраст и средний балл в конструктор и создаем коллекцию Set
    public static void get(HashSet<Student> set) {
        String str;
        int age;
        int average;
        while(true) {
            str = in.nextLine(); //Читаем строку
            if(str.equals("stop")) //Если слово стоп видим - заканчиваем чтение
                break;
                //Если слово не stop, то
            else
                age = count.nextInt();
            average = digit.nextInt();

            //Закидываем в set
            set.add(new Student(str, age, average)); //Отправляем в Set
        }


    }

    //Делаем корректный вывод
    public String toString(){
        return "Студент " + this.getName() + " Возраст: " + this.getAge() + " | Средний балл: " + this.getAverage() + "| ";
    }

    //Вывод TreeMap
    public static void display(TreeMap <Student, Integer> map) {

        for(Map.Entry<Student, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());

        }



    }

    //Вывод HashSet
    public static void display(HashSet<Student> set) {


        for (Student student : set) {
            System.out.println(student);
        }


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return String.valueOf(age).equals(String.valueOf(student.age));
    }

    @Override
    public int hashCode() {
        return String.valueOf(age).hashCode();
    }


    //Сравниваем средний балл
    @Override
    public int compareTo(Student o) {
                return this.getAverage() - o.getAverage();
    }

    //Геттеры
    public int getAverage() {
        return average_score;
    }
    public String getName() { return name;}
    public int getAge() { return age;}




}
