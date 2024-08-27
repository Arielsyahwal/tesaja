package minggu3array;

import java.util.ArrayList;

public class Example5 {

// Example Array List
    public static void main(String [] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Suzuki");
        cars.add("Honda");

        ArrayList<Integer> year = new ArrayList<Integer>();
        year.add(2021);
        year.add(2022);
        year.add(2023);
        
        System.out.println("Arraylist : " + cars);
        System.out.println("before edit cars : " + cars.get(0));

        cars.set(0, "Hyundai");
        System.out.println("after edit : " + cars);

        System.out.println("cars: " + cars.get(0));
        cars.remove(2);
        System.out.println("After Remove Arraylist : " + cars);

        System.out.println("Arraylist : " + year);
        System.out.println("year : " + year.get(1));
        
    }
}
