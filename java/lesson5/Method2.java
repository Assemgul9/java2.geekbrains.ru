package lesson5;

public class Method2{
    static final int SIZE =  1000000;
    static final int H = SIZE/2;

    public void method2() {

        float[] num = new float[SIZE];
        float[] arr1 = new float[H];
        float[] arr2 = new float[H];
        for (int i = 0; i < SIZE; i++) {
            num[i] = 1;
        }

        long c = System.currentTimeMillis();

        System.arraycopy(num, 0, arr1, 0, H);
        System.arraycopy(num, H - 1, arr2, 0, H);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < H; i++) {
                arr1[i] = (float) (num[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < H; i++) {
                arr2[i] = (float) (num[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        float[] newNum = new float[SIZE];

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.arraycopy(arr1, 0, newNum, 0, H);
        System.arraycopy(arr2, 0, newNum, H - 1, H);

        long d = System.currentTimeMillis();
        System.out.println("Время выполнения Метода2: " +(d - c) + "мс");


    }
}
