package Homework5;

public abstract class Fruct {
    //. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    private String name;
    private double weigh_fruct;
    private String type_fruct; // для второго задания

    public String getType_fruct() {
        return type_fruct;
    }

    public void setType_fruct(String type_fruct) {
        this.type_fruct = type_fruct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeigh_fruct() {
        return weigh_fruct;
    }

    public void setWeigh_fruct(double weigh_fruct) {
        if (weigh_fruct > 0) {
            this.weigh_fruct = weigh_fruct;
        }
        else  this.weigh_fruct = weigh_fruct * -1;
    }
/*
    public Fruct(String name, double weigh_fruct)
    {
        this.setName(name);
        this.setWeigh_fruct(weigh_fruct);
    }
    */
    public void print_info_about_fruct()
    {
        System.out.println("Инфо об Фркуте");
        System.out.println("Название: "+ getName());
        System.out.println("Вес " + getWeigh_fruct() );
    }

    }


