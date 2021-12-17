package lesson2;

public class MyArraysSizeExeption extends IndexOutOfBoundsException{
    private String s = "Длина массива не соответствует заданному значению";





    public String getS() {
        return s;
    }

    public void info (){
        System.out.println(s);

    }
}
