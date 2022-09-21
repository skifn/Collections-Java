package com.company;


import java.util.*;


//первая подзадача выполнена

public class Main {

    public static final Scanner in = new Scanner(System.in);
    public static final Scanner count = new Scanner(System.in);
    public static final Scanner digit = new Scanner(System.in);
    public static final Scanner choice = new Scanner(System.in);





    public static void main(String[] args) {
        int choicer;

        //Лист для первой позадачи
        ArrayList<String> source = new ArrayList<>();

        //Листы для второй подзадачи
        ArrayList<Integer> source_2 = new ArrayList<>();
        LinkedList<Integer> source2 = new LinkedList<>();

        //Для третьей подзадачи
        TreeMap<Student, Integer> source_3 = new TreeMap<>();

        //Для четвертой подзадачи
        TreeMap<Student, Integer> source_4_age = new TreeMap<>(new StudentAge()); //Сортировка по возрасту
        TreeMap<Student, Integer> source_4_name = new TreeMap<>(new StudentName()); //Сортировка по имени
        TreeMap<Student, Integer> source_4_average = new TreeMap<>(new StudentAverage()); //Сортировка по среднему баллу

        //Для пятой подзадачи
        HashSet<Student> source_5 = new HashSet<>();


        System.out.println("Введите номер подзадачи для проверки (всего 5):\n");
        choicer = choice.nextInt();


            switch (choicer) {
                case 1 -> {
                    //Первая подзадача
                    System.out.println("\nВведите лист:\n");
                    Task1.get(source); //Считываем лист
                    Task1.display(source); //Выводим исходный лист
                    System.out.println("\nОтсортированный лист:\n");
                    Task1.sort(source); //Сортируем лист
                    Task1.count(source); //Выводим число повторений
                    source = Task1.delete_same(source); //Убираем одинаковые фамилии
                    System.out.println("\nУбираем одинаковые фамилии:\n");
                    Task1.display(source);
                }
                case 2 -> {

                    //Вторая подзадача
                    Task2 task_2 = new Task2();
                    task_2.test_adding(source_2); //Проверка ArrayList
                    task_2.test_adding(source2);  //Проверка LinkedList
                    task_2.test_deleting(source_2);
                    task_2.test_deleting(source2);
                }
                case 3 -> {
                    System.out.println("\nВведите студентов\n");
                    Student.get(source_3);
                    System.out.println("\nСортировка по среднему баллу:\n");
                    Student.display(source_3);
                }
                case 4 -> {

                    //Четвертая подзадача
                    System.out.println("\nСортировка по возрасту:\nВведите Фамилию, Возраст и Средний балл\n");
                    Student.get(source_4_age);
                    Student.display(source_4_age);
                    System.out.println("\nСортировка по имени:\nВведите Фамилию, Возраст и Средний балл\n");
                    Student.get(source_4_name);
                    Student.display(source_4_name);
                    System.out.println("\nСортировка по среднему баллу:\nВведите Фамилию, Возраст и Средний балл\n");
                    Student.get(source_4_average);
                    Student.display(source_4_average);
                }
                case 5 -> {
                    //Пятая подзадача
                    System.out.println("\nВведите лист:\n");
                    Student.get(source_5);
                    Student.display(source_5);
                }


                default -> {System.out.println("Введите число от 1-5 для проверки\n");}
            }


        }

}
