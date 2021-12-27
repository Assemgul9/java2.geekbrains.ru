package lesson3;
import java.util.*;
public class HomeWork3 {
    public static void main(String[] args) {

        List<String>fruits= new ArrayList<>();
        fruits.add(0, "Яблоко");
        fruits.add(1,"Груша");
        fruits.add(2,"Манго");
        fruits.add(3, "Слива");
        fruits.add(4,"Банан");
        fruits.add(5, "Апельсин");
        fruits.add(6, "Мандарин");
        fruits.add(7, "Слива");
        fruits.add(8, "Яблоко");
        fruits.add(9, "Манго");
        fruits.add(10, "Слива");
        fruits.add(11, "Апельсин");
        fruits.add(12, "Груша");
        fruits.add(13, "Апельсин");
        fruits.add(14, "Апельсин");
        fruits.add(15,"Манго");

        Map<String, Integer>map;
        map = new HashMap<>();
        for (String x: fruits){

            map.put(x, map.getOrDefault(x,0)+1);

        }
        System.out.println(map);


        PhoneBook ph = new PhoneBook();
        ph.add("Семнов", "870544652578");
        ph.add("Семнов", "8964521185");
        System.out.println(ph.get("Семнов"));
    }

}
