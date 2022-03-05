package HomeWork2;
import java.util.Scanner;

public class Zadania1 {
    public static  void main (String[] args)
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("введеди целое число а");
            int a = sc.nextInt();
            System.out.println("введеди целое число b ");
            int b = sc.nextInt();
            sc.close();
            System.out.println(provuslovia(a,b));


        }

        public static boolean provuslovia (int a ,int b)
        {
            int c = a+b;
            if (c > 10 &&  c <=20 )
            {
                return true;
            }
            else return false;


        }
        /*
        Написать метод, принимающий на вход два целых числа и проверяющий, что их
сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в
противном случае – false.5


         */


}
