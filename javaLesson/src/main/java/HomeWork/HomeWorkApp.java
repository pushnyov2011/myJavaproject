package HomeWork;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main (String[] args)
    {
        System.out.println( "Задание1\n");
        printThreeWords();
        System.out.println( "\nЗадание2\n");
        checkSumSign();
        System.out.println( "\nЗадание3\n");
        printColor();

    }
// Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец
//три слова: Orange, Banana, Apple.
    public static void printThreeWords()
    {
        System.out.println("Orange\nBanana\nApple"  );
    }
    // Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и
    //инициализируйте их любыми значениями, которыми захотите. Далее метод должен
    //просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в
    //консоль сообщение “Сумма положительная”, в противном случае - “Сумма
    //отрицательная”;
    public static void checkSumSign()
    {

        int a,b ;
        Scanner in = new Scanner(System.in);
        System.out.println ("введите целое число а");
        a = in.nextInt();
        System.out.println ("а = " + a);
        System.out.println ("введите целое число b");
        b = in.nextInt();
        System.out.println ("а = " + b);
        // можно создать переменую с , где будет хранится сумма а + b
        if ((a+b)>=0)
        {
            System.out.println("Сумма положительна\nCумма равна " + (a+b)  );
        }
     else
        {
            System.out.println("Сумма отрицательная\nCумма равна " + (a+b));
        }

    }
    //Создайте метод printColor() в теле которого задайте int переменную value и
    //инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в
    //консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0
    //исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100
    //исключительно) - “Зеленый”;
public  static  void  printColor()
{
    int value ;
    Scanner in = new Scanner(System.in);
    System.out.println("введите целое число ");
    value = in.nextIn();
    if (value <= 0)
    {
        System.out.printl("Красный");
    }
    if (value > 0 && value <=100 )
    {
        System.out.printl("Желтый");

    }
    if (value > 100)
    {
        System.out.printl("Зеленый");
    }
    else
    {
        System.out.printl("что то не так!");
    }



}
}





