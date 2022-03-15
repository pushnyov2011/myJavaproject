package Homework4;

public class TestClass {
    public static void main(String[] args){
        Cats cat1 = new Cats() ;
        Dogs dog1 = new Dogs();

        dog1.print_count_dogs();
        cat1.print_count_cats();
        cat1.print_count_animal();
        System.out.println("---------------------------------");
        cat1.swim(5);
        System.out.println("---------------------------------");
        dog1.swim(5);
        System.out.println("---------------------------------");
        dog1.run(100);
        System.out.println("---------------------------------");
        dog1.run(600);
        System.out.println("---------------------------------");
        cat1.run(5);
        System.out.println("---------------------------------");
        cat1.print_info_animal();
        System.out.println("---------------------------------");
        dog1.print_info_animal();
        System.out.println("---------------------------------");
        Tarelka plate = new Tarelka();
        plate.ino_food_in_tarelka();
        System.out.println("---------------------------------");
       cat1.eat(plate);
       cat1.print_info_animal();
        System.out.println("---------------------------------");
        plate.ino_food_in_tarelka();
        System.out.println("---------------------------------");
        plate.add_food_in_tarelka(20);
        System.out.println("---------------------------------");

        /*
         Создать массив котов и тарелку с едой, попросить всех котов покушать из
этой тарелки и потом вывести информацию о сытости котов в консоль.

         */
        Cats [] cats = new Cats[5];
        for (int i = 0; i < cats.length ; i++)
        {
            System.out.println("---------------------------------");
            System.out.println("Кот :" +  (i+1));
            cats[i]  = new Cats();
            cats[i].eat(plate);
            plate.ino_food_in_tarelka();
            cats[i].print_info_animal();
            System.out.println("---------------------------------");

        }

        ///задание 6
        System.out.println("---------------------------------");
        Payment.Credit_cart credit_cart = new Payment.Credit_cart();
        Payment.Shopping_car shopping_car = new Payment.Shopping_car();
        Payment payment = new Payment();
        payment.buy(credit_cart,shopping_car);
        credit_cart.print_ino();
        shopping_car.info_shop_car();


        System.out.println("---------------------------------");
        /// задание 7
        Park.Atraction atraction = new Park.Atraction();
        atraction.atraction_info();
        System.out.println("Первоначальный класс");
        System.out.println("---------------------------------");
        atraction.zapoln_info_about_attraction();
        System.out.println("---------------------------------");
        System.out.println("Показать класс после изменения");
        atraction.atraction_info();













    }

}
