package lesson2;

import com.sun.jdi.IntegerType;

import java.text.NumberFormat;

public class Lesson__2 {

    final static int SIZE_ARRAY = 4;
    public static void main(String[] args) {



        String[][] numbers = {
                {"2", "5", "3d", "4"},
                {"1", "2", "3", "6"},
                {"2", "4", "4", "5"},
                {"1", "6", "7", "8"}
        };
        try{
            System.out.println(sumOfNumbers(numbers));
        }catch (MyArraysSizeExeption e){
            e.info();
        }catch (MyArrayDataExeption e){
            e.info(e.getI(),e.getJ());



        }






    }
    public static int  sumOfNumbers(String [][] s) throws MyArraysSizeExeption, MyArrayDataExeption {

        int sumFinal = 0;

        for (int i = 0; i < s.length; i++) {
                if (!(s.length==SIZE_ARRAY)|!(s [i].length==SIZE_ARRAY)) {
                      throw new MyArraysSizeExeption () ;}
            for (int j = 0; j <s [i].length ; j++) {
                try{
                sumFinal+= Integer.parseInt(s[i][j]);}
                catch (NumberFormatException e){
                   throw new MyArrayDataExeption(i,j);

                }
                }



            }return sumFinal;

        }









    }




