package math_random;

import java.util.Random;

public class Mathe {
    public static void main(String[] args) {
        String[] items = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        int randomIndex = (int) (Math.random() * items.length);
        String randomItem = items[randomIndex];
        System.out.println("Randomly selected item: " + randomItem);
    }
}