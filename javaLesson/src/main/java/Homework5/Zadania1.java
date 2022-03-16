package Homework5;
import java.util.Scanner;

public class Zadania1 {


    public static void main(String[] args) {
        Integer[] mas1 = {1, 2, 6, 7, 5, 6, 10}; // Intetr  так как он входит в Object  int не вроходит (
        String[] mas2 = {"Один", "Два", "Три", "Четыре",};
        Double[] mas3 = {1.2, 1.3, 5.0, 6.5};
        System.out.println("массив 1 тип Interger");
        print_mass(mas1);
        System.out.println("массив 2 тип String");
        print_mass(mas2);
        System.out.println("массив 3 тип Double");
        print_mass(mas3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элемент массива, который хотим поменять");
        int a = sc.nextInt();
        System.out.println("Введите элемент массива, на который хотим поменять");
        int b = sc.nextInt();

        chanche_pos(mas1, a,b);
        print_mass(mas1);
        System.out.println("-------------------------------------------------");

        chanche_pos(mas2, a,b);
        print_mass(mas2);
        System.out.println("-------------------------------------------------");
        chanche_pos(mas3, a,b);
        print_mass(mas3);






    }

    /*
    Написать метод, который меняет два элемента массива местами (массив может быть
любого ссылочного типа);
     */

    public static void print_mass(Object[] mas) {
        // Object[] mas = new Object();
        System.out.print("[ ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ,");
        }
        System.out.print("]");
        System.out.println();

    }

    public static void chanche_pos(Object[] mas, int a, int b) {
        if (a >= 0 && a < mas.length || b >= 0 && b < mas.length )
        {
          Object[] mas2 = new Object[mas.length];
          mas2 = mas;
            mas[a] = mas2[b];
            mas[b] = mas2[a];

        }
       else   if ( a >= mas.length  || b >= mas.length || 0 > a || 0 > b )
        {
        System.out.println("в массиве нет такого элемента \n массив остался прежним ");
        }


    }
}
