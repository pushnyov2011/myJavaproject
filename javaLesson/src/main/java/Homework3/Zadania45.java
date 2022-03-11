package Homework3;

import java.util.Arrays;

public class Zadania45 {
    public static void main (String[] args)
    {
        /*
        . Создать массив из 5 сотрудников.
Пример:
// Вначале объявляем массив объектов
Person[] persArray = new Person[5];
// потом для каждой ячейки массива задаем объект
persArray[0] = new Person("Ivanov Ivan", "Engineer",
"ivivan@mailbox.com", "892312312", 30000, 30);
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

         */
        Sotrudnik[] person = new Sotrudnik[5]; //
        person[0] = new Sotrudnik("Первый работник","Ломастер", "test@ya.ru", 12345679,5,50);
        person[0].print_info();
        System.out.println();
        // хотел посмотреть как будет работать через геттер и сеттар работать
        person[1] = new Sotrudnik();
        person[1].setFIO("Сотрудник два");
        person[1].setKem_rabotaet("Ломастиер высшей категории");
        person[1].setEmail("test202@ya.ru");
        person[1].setZp(-9);
        person[1].setTelephone(-5645465);
        person[1].setAge(-2);
        person[1].print_info();
        person[2] = new Sotrudnik("Третий работник","Дворник", "dvor@ya.ru", 12305679,5456,90);
        System.out.println();
        person[2].print_info();
        person[3] = new Sotrudnik("Четверный работник","ПРосто КОТ", "cat@ya.ru", 911,2,42);
        System.out.println();
        person[3].print_info();
        person[4] = new Sotrudnik();
        System.out.println();
        person[4].print_info();
        System.out.println("\nСотрудники старше 40 лет.\n");

       // С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        for (int i = 0 ; i < person.length; i++)
        {
            if (person[i].getAge() > 40)
            {
                System.out.println("Сотрудник: " + (i+1));
                person[i].print_info();
                System.out.println();
            }
        }





    }
}

