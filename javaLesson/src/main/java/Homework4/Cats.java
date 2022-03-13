package Homework4;

public class Cats extends Animal {
    //бег: кот 200 м., собака 500 м.;
    private final int ograich_cats_run = 200;
   private final int oggani_cats_swim = 0;
    // плавание: кот не умеет плавать, собака 10 м.).
    //4. * Добавить подсчет созданных котов, собак и животных.
    private  static int countCats; //static  Если поле объявлено static, существует ровно одно воплощение поля, независимо от того, сколько экземпляров (возможно, ноль) класса в конечном итоге может быть создано

    public static int getCountCats() {
        return countCats;
    }

    public static void setCountCats(int countCats) {
        Cats.countCats = countCats;
    }

    public Cats() {

        this.setName("Кот для теста");
        this.setOgran_dist_run(ograich_cats_run);
        this.setOrgran_dist_swim(oggani_cats_swim);
        this.setCountCats(getCountCats()+1);
        this.setAnimal_count(getAnimal_count()+1);


    }
    public Cats (String cot_name)
    {
        this.setName(cot_name);
        this.setOgran_dist_run(ograich_cats_run);
        this.setOrgran_dist_swim(ograich_cats_run);
        this.setCountCats(getCountCats()+1);
        this.setAnimal_count(getAnimal_count()+1);

    }

    @Override // переопределил метод плавать для котов
    public void swim(int dist)
    {
        dist = 0;
        super.swim(dist);
        System.out.println("Коты не умеют плавать");
    }

    public static void main(String[] args) {
        Cats cat = new Cats();
        Cats cat2 = new Cats();
        Cats cat3 = new Cats();
        cat.run(200);
        cat.swim(0);
        cat.print_count_cats();


    }

    public void print_count_cats()
    {
        System.out.println("Количество созданных котов: " + getCountCats() );
    }



    }
