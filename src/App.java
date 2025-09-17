
/**
 *  Write a Java program that reads an unspecified number of integers from the user 
 *  until the user enters -1. For each number, indicate whether it is odd or even. 
 *  After the user enters -1, print the count of even and odd numbers entered.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int odds = 0;
        int evens = 0;
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }else if (num < 0) {
                sum = sum + 1;
            }else if ((num % 2) == 0) {
                System.out.println("Number " + num + " is even.");
                evens +=1;
            }else if ((num % 2) != 0) {
                System.out.println("Number " + num + " is odd");
                odds += 1;
            }
        }
        System.out.println("Number of negative numbers: " + sum);
        System.out.println("Amount of even numbers: " + evens);
        System.out.println("Amount of odd numbers: " + odds);
    }
}

