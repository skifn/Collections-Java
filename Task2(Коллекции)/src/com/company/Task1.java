package com.company;

import java.text.Collator;
import java.util.*;

import static com.company.Main.in;

public class Task1 {

    //Вывод листа
    public static void display(ArrayList<String> list) {

        System.out.println("Лист:");
        for(String temp : list) {
            System.out.println(temp);
        }
        System.out.println("\n");

    }

    //Чтение листа
    public static void get(ArrayList<String> list) {
        String str;
        while(true) {
            str = in.nextLine(); //Читаем строку
            if(str.equals("stop")) //Если слово стоп видим - заканчиваем чтение
                break;

            //Если слово не stop, то
            list.add(str); //Добавляем в лист




        }

    }

    //Сортировка листа по алфавиту
    public static void sort(ArrayList<String> list) {

        list.sort(Collator.getInstance());
        System.out.println("Отсортированный лист:");
        for(String temp : list) {
            System.out.println(temp);
        }
        System.out.println("\n");

    }

    //Подсчитываем количество повторений
    public static void count(ArrayList<String> list) {

        Set<String> unique = new HashSet<>(list); // в конструктор кладем наш список
        for (String key : unique) {
            System.out.println("Фамилия: " + key + ", Встречается раз: " + Collections.frequency(list, key));
        }
        System.out.println("\n");





    }

    //Убираем одинаковые фамилии
    public static ArrayList<String> delete_same(ArrayList<String> list) {

        // строим множество из элементов списка
        Set<String> set = new LinkedHashSet<>(list);

        // создаем новый список из набора и печатаем его

        return new ArrayList<>(set);


    }



}
