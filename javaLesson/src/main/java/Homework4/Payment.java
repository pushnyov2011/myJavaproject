package Homework4;

import java.security.PublicKey;

public class Payment {
    // Создать класс Payment с внутренним классом, с помощью объектов которого
    //можно сформировать покупку из нескольких товаров

     private class Credit_cart
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
            this.money_on_Card = money_on_Card;
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
            setMoney_on_Card(getMoney_on_Card()-money_on_Card);}
            else System.out.println("недостатончо средств, жди зп");


        }
    }







    }

