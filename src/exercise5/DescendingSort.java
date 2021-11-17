package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) 
        {
            numbers[index] = input.nextInt();
        }

        for (int index = 0; index < numbers.length; index++) 
        {
          int minIndex = index;
          for (int i = index + 1; i < numbers.length; i++) 
          {
            if (numbers[minIndex] < numbers[i]) 
            {
              minIndex = i;

            }
          }
        int t = numbers[index];
        numbers[index] = numbers[minIndex];
        numbers[minIndex] = t;
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}