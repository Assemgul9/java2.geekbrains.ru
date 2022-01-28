package lessonnnn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Box <T extends Fruits> {
    private T t;


    private List<T> fruitsBox = new ArrayList<>();


    public Box() {
        this.t = null;

        this.fruitsBox = fruitsBox;

    }


    public float getWeight() {

        float boxWeight = 0;

        for (T t : fruitsBox) {
            float fruitWeight = t.getWeight();
            boxWeight = boxWeight + fruitWeight;
        }



        return boxWeight;

    }


    public void addFruits(int num, T t) {


        for (int i = 0; i < num; i++) {

            fruitsBox.add(t);


        }


    }

    public boolean Compare(Box<?> another) {

        if (Math.abs(this.getWeight() - another.getWeight()) < 0.000000001) {

            System.out.println("Эти коробки равны по весу");
          return true;

        }
        System.out.println("Эти коробки не равны по весу");
        return false;

    }

    public  void boxIntoBox(Box<T> box){

     box.fruitsBox.addAll(this.fruitsBox);
        this.fruitsBox.clear();

    }
}





