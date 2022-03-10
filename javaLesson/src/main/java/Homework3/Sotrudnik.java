package Homework3;

public class Sotrudnik
    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата,возраст.

{
    private String FIO;
    private String kem_rabotaet ;// должность
    private String email;
    private int telephone; // будет целотичсленным
    private double zp ; // зп может быть не целочисленыс например 30р 50к
    private  int age;

    //задание 2
    public  Sotrudnik() // Конструктор класса должен заполнять эти поля при создании объекта.

    {
        //  по дефулту будут такие данные
        FIO =  "Аноним" ;
        kem_rabotaet = "Никто не знает";
        email = "test@test.ts" ;
        telephone = 123456789;
        zp = 0;
        age = 50;
    }
    public  Sotrudnik(String FIO, String kem_rabotaet, String email, int telephone, double zp, int age)
    {
        this.FIO = FIO;
        this.kem_rabotaet = kem_rabotaet;
        this.email = email;
        this.telephone = telephone;
        this.zp = zp;
        this.age = age;


    }



    public  static void main (String[] args)
    {
        Sotrudnik person = new Sotrudnik();
        person.print_info();

        Sotrudnik person2 = new Sotrudnik("ТЕст","Qa", "yander@ys.ru", 54564546, 456.6 ,80);
        person2.print_info();




    }


    /*
    нутри класса «Сотрудник» написать метод, который выводит информацию об
объекте в консоль.

     */

    public  void  print_info()
    {
        System.out.println("ФИО: " + FIO);
        System.out.println("Должность: " + kem_rabotaet );
        System.out.println("Почта: " + email );
        System.out.println("Тел:+  " + telephone);
        System.out.println("Зп: " + zp + " шоколадныхх монет");
        System.out.println("Возраст:  " + age);

    }


}
