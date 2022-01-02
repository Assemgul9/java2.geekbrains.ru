package lesson5;

public class Method1 {
    static final int SIZE =  1000000;
    static final int H = SIZE/2;

    public void method1(){

    float [] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
        arr[i] = 1;
    }

    long a = System.currentTimeMillis();


        for (int i = 0; i < SIZE; i++) {

        arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }

    long b = System.currentTimeMillis();
        System.out.println("Время выполения Метода1: "+ (b-a)+"мс");


}


}
