package Homework4;

import java.security.PublicKey;

public class Payment {
    // Создать класс Payment с внутренним классом, с помощью объектов которого
    //можно сформировать покупку из нескольких товаров

     public static class Credit_cart  // внутрений класс
    {
        public String type; // тип виза / мастиер хз какой

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
        public int money_on_Card ;

        public int getMoney_on_Card() {
            return money_on_Card;
        }
        public void setMoney_on_Card(int money_on_Card) {
            if (money_on_Card >0) {
            this.money_on_Card = money_on_Card;}
            else  {this.money_on_Card = money_on_Card *-1;}
        }

        public Credit_cart(String type, int money_on_Card) {
            this.type = type;
            this.money_on_Card =money_on_Card;
        }
        public Credit_cart()
        {
            this.type = "visa";
            this.money_on_Card = 1000;

        }
        public void print_ino ()
        {
            System.out.println("Тип какрты; " + getType() );
            System.out.println("Остаток на карте ; " + getMoney_on_Card() + " рублей" );
        }

        public  void  oplata_with_credit_card (int  oplata)
        {
            if (oplata <= getMoney_on_Card()){
            setMoney_on_Card(getMoney_on_Card()-oplata);
            System.out.println("Оплата прошла успешнеа");}
            else System.out.println("недостатончо средств, жди зп");


        }}

        public static class Shopping_car // Вунтрений класс
        {
            private int count_ite_in_SC;// количество товаров лежащих в корзине
            private int amount;// общая сумма ;

            public int getCount_ite_in_SC() {
                return count_ite_in_SC;
            }

            public void setCount_ite_in_SC(int count_ite_in_SC) {

                this.count_ite_in_SC = count_ite_in_SC;
            }

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            public Shopping_car(int count_ite_in_SC, int amount) {
                this.count_ite_in_SC = count_ite_in_SC;
                this.amount = amount;
            }

            public Shopping_car() {
                this.count_ite_in_SC = 2;
                this.amount = 500;
            }

            public void info_shop_car() {
                System.out.println("В корзине " + getCount_ite_in_SC() + " количество товаров ");
                System.out.println("Общая сумма покупки составляет: " + getAmount() + "р");


            }


            // Credit_cart credit_cart = new Credit_cart()
            //  Shopping_car shopping_car = new Shopping_car();
        }

        public void buy( Credit_cart credit_cart, Shopping_car shopping_car)
        {
            int then_money = credit_cart.getMoney_on_Card();
            credit_cart.print_ino();
            System.out.println("-----------------");
            shopping_car.info_shop_car();
            System.out.println("-----------------");
            credit_cart.oplata_with_credit_card(shopping_car.getAmount());
            int now_money = credit_cart.getMoney_on_Card();
            if (then_money > now_money) // простой сброс корзины, можно доработать и больше проверок добавить
            {
                shopping_car.setAmount(0);
                shopping_car.setCount_ite_in_SC(0);
            }
        }




}





