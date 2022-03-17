package Homework5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Box <B extends  Fruct> // для того что бы получить доступ коасам фруктуам и наследникам его
{



    ArrayList<B> box = new ArrayList();
    ///Класс Box, в который можно складывать фрукты. Коробки условно сортируются
    //по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    /*
    Для хранения фруктов внутри коробки можно использовать ArrayList;
     */
    private double weight_box;

    public double getWeight_box() {
        return weight_box;
    }

    public void setWeight_box(double weight_box) {
        this.weight_box = weight_box;
    }

    public ArrayList<B> getBox() {
        return box;
    }

    public Box(B... fruct) // содержит множества фркутов (...) идет как обозначение множества , можно сразу создать объек коробка с моножкствам
            // по умолчанию коробка бедт пуста , дефултной констрок не делал
    {
        this.box = new ArrayList<>(Arrays.asList(fruct));
    }
//  7 Не забываем про метод добавления фрукта в коробку.
    public void add_Fruct_in_box(B fruct) /// Ложим один объект
    {
        box.add(fruct);
        setWeight_box(getWeight(fruct));
    }
    public void  ifo_about_intems_in_box ()
    {
      //  System.out.println("В ящики сейчас : " + box.size() + " Фрукт/ов" );
        if (box.size()> 0)
        {
            System.out.println("В ящике сейчас : " + box.size() + " Фрукт/ов" );
            System.out.println("вес ящика: " + getWeight_box() );

        }
        else System.out.println("Ящик пуст");

    }

    // Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного
    //фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы
    //измерения не важны);
   public double  getWeight(B fruct)
   {
 double weight = fruct.getWeigh_fruct() *box.size();
 return  weight;

   }

   /*
   Внутри класса Box сделать метод compare(), который позволяет сравнить
текущую коробку с той, которую подадут в compare() в качестве параметра.
true – если их массы равны, false в противоположном случае. Можно
сравнивать коробки с яблоками и апельсинами;
    */
    public  void compare(Box box_for_compra)
    {
        System.out.println("вес нашей коробки: " + getWeight_box() );
        System.out.println("вес коробки с которой сравниваем: " + box_for_compra.getWeight_box() );
        boolean com = false;
        if (getWeight_box() == box_for_compra.getWeight_box())
        {
            com = true;
            System.out.println("Вес коробкок одинаковый? "+ com) ;
        }
        else
        {
            com = false;
            System.out.println("Вес коробкок одинаковый? "+ com) ;
        }
    }
    /*
    Написать метод, который позволяет пересыпать фрукты из текущей коробки в
другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с
апельсинами. Соответственно, в текущей коробке фруктов не остается, а в
другую перекидываются объекты, которые были в первой;

     */
    public void replace_another_box(Box<B> another_box) // подойдет коробрка  только с одинаовым типом , если  яблоки, то яблоки , апелиьсин , то апелиьсин
// если добавлять нужна короблка для всех фруктов (яблоки  и апельсины , то нужно менять на (Box another box) , то есть убрать тип B.
    {

        another_box.box.addAll(getBox()); // переносис в воробку 2
        another_box.setWeight_box(getWeight_box());   // вес не копировался, доплнительно нужно добавить перенос веса
        box.clear(); // делаем очистку массива , коробки а
        // вес не копируеются , доплнительно нужно добавить перенос веса


    }

    }

