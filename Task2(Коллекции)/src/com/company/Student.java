package com.company;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static com.company.Main.*;

public class Student implements Comparable <Student> {

   String name;
   int course;
   int average_score;




    //Конструктор
    public Student(String name, int course, int average_score) {
        this.name = name;
        this.course = course;
        this.average_score = average_score;
    }

    //Считываем фамилии и средний балл в конструктор
    public static void get(TreeMap <Student, Integer> map) {
        String str;
        int course;
        int average;
        while(true) {
            str = in.nextLine(); //Читаем строку
            if(str.equals("stop")) //Если слово стоп видим - заканчиваем чтение
                break;

            //Если слово не stop, то
           else
                course = count.nextInt();
                average = digit.nextInt();

               map.put(new Student(str, course, average), average); //Отправляем в TreeMap
        }


    }

    //Делаем корректный вывод
    public String toString(){
        return "Студент " + this.getName() + " учится на курсе: " + this.getCourse() + " | Средний балл: ";
    }

    //Вывод TreeMap
    public static void display(TreeMap <Student, Integer> map) {

        for(Map.Entry<Student, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());

        }



    }


    //Сравниваем средний балл
    @Override
    public int compareTo(Student o) {
        return this.getAverage() - o.getAverage();
    }

    //Геттеры для переопределения toString
    private int getAverage() {
        return average_score;
    }
    private String getName() { return name;}
    private int getCourse() { return course;}


}
