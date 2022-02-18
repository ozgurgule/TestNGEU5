package day1;

import java.util.Arrays;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        for (int i =0; i<array.length; i++){
            array[i]=random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("***********************");

        int [] numbers = {10, 5, 6,92, 20};
        int max = numbers[0];
        for (int i =1; i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Max: " + max);
    }
}
