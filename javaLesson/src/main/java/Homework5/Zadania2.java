package Homework5;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadania2 {
    public static void main (String[] args)
    {
        Orange orange1 = new Orange();
        Apple apple = new Apple();
        Apple apple2 = new Apple();
        Box<Apple> box_for_aplle1 = new Box<>(); ///создал  язщкик для яблок
        Box<Orange> orangeBox = new Box<>();// создал ящик для апельсин
        Box<Apple> box_for_aplle2 = new Box<>(apple2); ///создал  язщкик для яблок
orangeBox.add_Fruct_in_box(orange1);
        System.out.println("---------------------------------------------------------");
      //  box_for_aplle1.add_Fruct_in_box(orange1);  проверил что нельзя добавить в ящик для яблок апельсин , ругается на разные классы объекта
        box_for_aplle1.ifo_about_intems_in_box();
        System.out.println("Добавил яблако в ящик ");
        box_for_aplle1.add_Fruct_in_box(apple);
        box_for_aplle1.add_Fruct_in_box(apple2);

        System.out.println("Смотрим что в ящике ");
        box_for_aplle1.ifo_about_intems_in_box();
        System.out.println("---------------------------------------------------------");
        System.out.println("Сравниваем ящиком с апельсином ");
        box_for_aplle1.compare(orangeBox);
        System.out.println("---------------------------------------------------------");
        System.out.println("Сравниваем ящиком с самим собой");
        box_for_aplle1.compare(box_for_aplle1);
        System.out.println("---------------------------------------------------------");
        System.out.println("Сравниваем ящиком с ящиком ");
        box_for_aplle1.compare(box_for_aplle2);
        System.out.println("---------------------------------------------------------");
        System.out.println("перносим содержимое один в корбоку два  ");
        Box<Apple> box_for_aplle3 = new Box<>(); ///создал  язщкик для яблок
        Box<Orange> orangeBox2 = new Box<>();// создал ящик для апельсин
        System.out.println("До переноса");
        System.out.println("Ящик1");
        box_for_aplle1.ifo_about_intems_in_box();
        System.out.println("Ящик2");
        box_for_aplle3.ifo_about_intems_in_box();
        //box_for_aplle1.replace_another_box(orangeBox); // проверил , другой тип не подходит
        box_for_aplle1.replace_another_box(box_for_aplle3);
        System.out.println("после");
        System.out.println("Ящик1");
        box_for_aplle1.ifo_about_intems_in_box();
        System.out.println("Ящик2");
        box_for_aplle3.ifo_about_intems_in_box();













    }
}
