package Homework7;

public class AppData {
    /*
}
    Для хранения данных использовать класс вида:
    public class AppData {
        private String[] header;
        private int[][] data;
        */
    private  String [] headrer;
    private  int [][] data;

    public String[] getHeadrer()
    {
        return headrer;
    }

    public void setHeadrer(String[] headrer) {
        this.headrer = headrer;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
/*
    public AppData(String[] headrer, int[][] data) {
        this.headrer = headrer;
        this.data = data;
    }
    */


}
