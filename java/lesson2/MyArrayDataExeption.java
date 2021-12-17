package lesson2;

public class MyArrayDataExeption extends Exception{
    private int i;
    private int j;

    MyArrayDataExeption(int i, int j){
        this.i = i;
        this.j = j;


    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void info(int i, int j){
        System.out.print("Неверное значение данных в ячейке: " + "i" +i+ "  " +"j"+ j );
    }
}
