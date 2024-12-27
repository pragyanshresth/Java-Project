package org.example.assignment;

import java.util.Scanner;

public class ConsoleBasedNumberAnalyzerTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Choose an option: ");
            System.out.println("1. Check if a number is positive, negative or zero");
            System.out.println("2. Determine if a number is even or not");
            System.out.println("3. Display numbers from 1 to the given number");
            System.out.println("4. Display the Fibonacci series up to the given number");
            System.out.println("5. Exit the application");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter a number: ");
                    int num1 = scanner.nextInt();
                    if (num1 > 0){
                        System.out.println("The number is positive");
                    }
                    else if (num1 < 0) {
                        System.out.println("The number is negative");
                    }
                    else {
                        System.out.println("The number is zero");
                    }
                    break;

                case 2:
                    System.out.println("Enter a number: ");
                    int num2 = scanner.nextInt();
                    if(num2%2==0){
                        System.out.println("The number is even.");
                    }
                    else{
                        System.out.println("The number is odd");
                    }
                    break;

                case 3:
                    System.out.println("Enter a number: ");
                    int num3 = scanner.nextInt();
                    for(int i=0 ; i<=num3; i++){
                        System.out.println(i);
                    }
                    break;

                case 4:
                    System.out.println("Enter a number to which you want fibonacci series: ");
                    int limit = scanner.nextInt();
                    int first = 0, second = 1;
                    System.out.println("Fibonacci series up to" + limit + ":");
                    System.out.println(first + " \n" + second + " ");
                    int next  = first + second;
                    while (next <= limit){
                        System.out.println(next + " ");
                        first = second;
                        second = next;
                        next = first + second;
                    }
                    break;

                case 5:
                    System.out.println("Exiting the application.");
                    break;
            }
        }while(choice != 5);
    }
}
