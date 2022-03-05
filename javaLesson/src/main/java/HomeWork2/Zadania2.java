package HomeWork2;
import java.util.Scanner;

public class Zadania2 {
    public static void  main (String[] args)
    {
        /*
        Написать метод, которому в качестве параметра передается целое число, метод
должен напечатать в консоль, положительное ли число передали или
отрицательное. Замечание: ноль считаем положительным числом.

         */
        System.out.println("Введите целое цисло =");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(provuslovia(a));



    }

    public  static  String  provuslovia (int a)
    {
        if (a >= 0)
        {
            return  "Число положительное";
        }
        else return  "Число не положительное, а отрицательное ";
    }
}
