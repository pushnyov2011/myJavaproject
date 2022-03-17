package Homework5;
// Orange extends Fruit;
public class Orange extends Fruct
{
    //апельсина – 1.5f
    private  final  double weight = 1.2;
    public Orange() {
        setName("Тестовый апельсин");
        setWeigh_fruct(weight);
        setType_fruct("Апельсин");
    }

    public Orange (String name)
    {
        setName(name);
        setWeigh_fruct(weight);
        setType_fruct("Апельсин");


    }
}
