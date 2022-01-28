package lessonnnn;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork {




    public static void main(String[] args) {

        Box<Fruits> box = new Box<Fruits>();
        Box<Apple> box1 = new Box<Apple>();
        box.addFruits(4, new Apple(1.0f));
        box1.addFruits(4, new Apple(1.5f));
        System.out.println(box1.getWeight());
        System.out.println(box.getWeight());
        box.Compare(box1);
        box.boxIntoBox(box1);



      String [] ddd = {"Яблоко","Апельсин"};
        Integer [] ggg = {1, 2, 4, 6};

        oneToOther(ddd,0,1);
        oneToOther(ggg, 1, 3);

        arrToArrList(ggg);





    }
    public static<T> void oneToOther(Object [] objects, int x, int y){

        if ((x < objects.length)&&(y<objects.length)&&(x>=0)&&(y>=0)){

        Object f = objects [x];
        Object r = objects [y];

        objects [x] = r;
        objects [y] = f;

        System.out.println(Arrays.toString(objects));
        }else{
            System.out.println("Введите корректные значения х и y");
        }



    }

    public static void arrToArrList (Object [] objects){

        ArrayList<?> newList = new ArrayList<>(Arrays.asList(objects));
        System.out.println(newList.getClass());

    }


}

    

   