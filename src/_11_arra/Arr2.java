package _11_arra;

import java.util.Arrays;

public class Arr2 {
    public static void main(String[] args) {
        String[] colors = new String[]{"red", "blue", "white", "orange", "kara"};
        salihCollegeNb(colors); 
        System.out.println("Чейинки: " + Arrays.toString(colors)); // исходный массив уже изменён
    }

    public static void salihCollegeNb(String[] array) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < array[minIndex].length()) {
                minIndex = i;
            } else if (array[i].length() > array[maxIndex].length()) {
                maxIndex = i;
            }
        }

        // меняем местами самое короткое и самое длинное слова
        String temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
    }
}
