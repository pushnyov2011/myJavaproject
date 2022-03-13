package Homework4;

public class Dogs extends Animal {
    //бег: кот 200 м., собака 500 м.;
    private int ograich_dogs_run = 500;
    private int oggani_dogs_swim = 10;
    // плавание: кот не умеет плавать, собака 10 м.).



    public Dogs() {

        this.setName("Собака для теста");
        this.setOgran_dist_run(ograich_dogs_run);
        this.setOrgran_dist_swim(oggani_dogs_swim);


    }
    public Dogs (String dog_name)
    {
        this.setName(dog_name);
        this.setOgran_dist_run(ograich_dogs_run);
        this.setOrgran_dist_swim(oggani_dogs_swim);
    }



     public static void main(String[] args) {
        Dogs dogs = new Dogs();
        dogs.run(200);
        dogs.swim(5);


    }
}
