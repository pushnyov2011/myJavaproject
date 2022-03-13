package Homework4;

public class Cats extends Animal {
    //бег: кот 200 м., собака 500 м.;
    private int ograich_cats_run = 200;
   private int oggani_cats_swim = 0;
    // плавание: кот не умеет плавать, собака 10 м.).
    public Cats() {

        this.setName("Кот для теста");
        this.setOgran_dist_run(ograich_cats_run);
        this.setOrgran_dist_swim(oggani_cats_swim);


    }
    public Cats (String cot_name)
    {
        this.setName(cot_name);
        this.setOgran_dist_run(ograich_cats_run);
        this.setOrgran_dist_swim(ograich_cats_run);
    }

    @Override
    public void swim(int dist)
    {
        swim(0);
        System.out.println("Коты не умеют плавать");
    }

    public static void main(String[] args) {
        Cats cat = new Cats();
        cat.run(200);
       // cat.swim(0);
    }



    }
