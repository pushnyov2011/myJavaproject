package Homework7;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Task1 {
    //  Реализовать сохранение данных в csv файл;
    //2. Реализовать загрузку данных из csv файла. Файл читается целиком.

    /*

     */
     /*
}
    Для хранения данных использовать класс вида:
    public class AppData {
        private String[] header;
        private int[][] data;
        *//*
    Структура csv файла:

Строка заголовок с набором столбцов
Набор строк с целочисленными значениями
* Разделитель между столбцами - символ точка с запятой (;)
Value 1;Value 2;Value 3
100;200;123
300;400;500

    Если выполняется save(AppData data), то старые данные в файле полностью
перезаписываются.

*/

    public static void  main(String[] Args) throws FileNotFoundException {
             File file = new  File ("testFile.csv");
           //  Scanner scanner = new Scanner(System.in);
             AppData appData_whrite = new AppData(); // для записи
             String heder [] = {"Value 1", "Value 2", "Value 3" }; // взял с примера
        int mas [][]  = {{1,5,7} , {50,50,6} , {60,5,50}};
        appData_whrite.setData(mas);
        ///  int
             appData_whrite.setHeadrer(heder);


            // int mas [][]  = {{1,5,7} , {50,50,6} , {60,5,50}};
             appData_whrite.setData(mas);
        AppData appData_read = new AppData();

          write_in_file(file,appData_whrite); // запись в файол
          write_of_file(file,appData_read); // запись из файла
        read_file(file); // чтение из айла
          /*
         int i = 0 ;
         int a = 0;
       int [][]mas2 = appData_read.getData();
        StringBuilder stringBuilder = new StringBuilder();
        String str = "";

        try {
       BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
       while ((str = bufferedReader.readLine())!= null)
       {
           String[] row = str.split(";");
           if ( i == 0)
           {
             //  String[] row = str.split(";");
               appData_read.setHeadrer(row); // heder всегда будет первоой стройкой , поэтомы мы записать его стразу в первом шаге, с инто п
               i++;
           }
           else
           {


           */
           //    stringBuilder.append(Arrays.toString(row));
/*
               for (int b = 0 ; b < mas[a].length ;b++)
               { \\\\\\\\\\\\\\\\\\\\Простй спссоб , если размер статичный например 3*3 4*4, можн заадать размернсть руками
                   mas2[a][b] = Integer.parseInt(row[b]);

               }
              / /
 *//*



               }

           }
           // stringBuilder.append(fileInputStream.);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str2 =  stringBuilder.toString();


      //  appData_read.setData(mas2);
        String [] s = appData_read.getHeadrer();
         System.out.println(Arrays.toString(s));
         System.out.println(str2);

         */



    }




    public static void write_in_file (File fl, AppData ap) { //
        /*
        Если выполняется save(AppData data), то старые данные в файле полностью
перезаписываются.
Если правильно понял , то пр перезаиси данные в cvs должны пере зописаться. Перезаписывюттся
         */
        String heder [] = ap.getHeadrer();
        int [][] data = ap.getData();
        PrintWriter pw = null;
try {


     pw = new PrintWriter(fl);

    //////////////////////////////////////////запист хедера
    for (int i = 0; i < heder.length; i++) {
       // if (i != (heder.length - 1)) {
            pw.print(heder[i] + ';');
       // } else pw.print(heder[i]);
    }
    pw.println();
    ///////////////////////////////////////////////////////////
    /////////////////////////////////////////записи даты
    for (int i = 0 ; i < data.length; i++ )
    {
        for ( int j = 0; j <data[i].length ; j++)
        {


          //  if (i != (data.length-1) ){
            pw.print(String.valueOf(data[i][j])+ ';');
        }
    pw.println();}
       // else   pw.println(data[i][j]);

    //////////////////////////////////////////////////////

} catch (FileNotFoundException e) {
    e.printStackTrace();
}
finally {
    pw.close();
}
System.out.println("Запись в Файл завершина");

    }



public static void write_of_file(File file, AppData appData_read)
{
    int i = 0 ;
    int a = 0;
    int [][] mas2 = new int [3][3];
    StringBuilder stringBuilder = new StringBuilder();
    String str = "";
    BufferedReader bufferedReader = null;

    try {
     bufferedReader = new BufferedReader(new FileReader(file));
        while ((str = bufferedReader.readLine())!= null)
        {
            String[] row = str.split(";");
            if ( i == 0)
            {
                //  String[] row = str.split(";");
                appData_read.setHeadrer(row); // heder всегда будет первоой стройкой , поэтомы мы записать его стразу в первом шаге, с инто п
                i++;
            }
            else
            {


               for (int b = 0 ; b < mas2[a].length ;b++)
               {
                   mas2[a][b] = Integer.parseInt(row[b]);


               }

a++;
            }

        }
        // stringBuilder.append(fileInputStream.);

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    finally {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //  String str2 =  stringBuilder.toString();


     appData_read.setData(mas2);
    System.out.println("Запись из файла завершина");



   // String [] s = appData_read.getHeadrer();
    System.out.println(Arrays.toString(appData_read.getHeadrer()));
    System.out.println(Arrays.deepToString(appData_read.getData()));



}

public static void read_file(File file)
{

   // StringBuilder stringBuilder = new StringBuilder();
    String str = "";
    BufferedReader bufferedReader = null;

    try {
        bufferedReader = new BufferedReader(new FileReader(file));
        while ((str = bufferedReader.readLine())!= null)
        {
            String[] row = str.split(";");
            for ( String inex : row)
            {
                System.out.print("  "+ inex);

            }
            System.out.println();
                }

            }
            // stringBuilder.append(fileInputStream.);

         catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}

}
