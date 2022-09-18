package com.company;

import java.text.Collator;
import java.util.*;

//первая подзадача выполнена

public class Main {

    public static final Scanner in = new Scanner(System.in);
    public static final Scanner count = new Scanner(System.in);
    public static final Scanner digit = new Scanner(System.in);


    public static void main(String[] args) {

        //Лист для первой позадачи
        ArrayList<String> source = new ArrayList<>();

        //Листы для второй подзадачи
        ArrayList<Integer> source_2 = new ArrayList<>();
        LinkedList<Integer> source2 = new LinkedList<>();

        // для третьей подзадачи
        TreeMap<Student, Integer> source_3 = new TreeMap<>();


        //Первая подзадача
       Task1.get(source); //Считываем лист
       Task1.display(source); //Выводим исходный лист

       Task1.sort(source); //Сортируем лист

       Task1.count(source); //Выводим число повторений
       source = Task1.delete_same(source); //Убираем одинаковые фамилии
       Task1.display(source);

        //Вторая подзадача
        Task2 task_2 = new Task2();
        task_2.test_adding(source_2); //Проверка ArrayList
        task_2.test_adding(source2);  //Проверка LinkedList

        task_2.test_deleting(source_2);
        task_2.test_deleting(source2);

        //Третья подзадача
       Student.get(source_3); //С клавиатуры создаем объекты класса
       Student.display(source_3);





        






    }





}
