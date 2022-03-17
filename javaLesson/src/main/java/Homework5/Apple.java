package Homework5;

public class Apple  extends Fruct
{
    //вес яблока – 1.0f
private  final  double weight = 1;
    public Apple() {
        setName("Тестовое яблоко");
        setWeigh_fruct(weight);
        setType_fruct("Яблоко");
    }

    public Apple (String name)
    {
        setName(name);
        setWeigh_fruct(weight);
        setType_fruct("Яблоко");

    }
}
