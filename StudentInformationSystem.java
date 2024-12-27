package org.example.basic;

import java.util.Scanner;

public class StudentInformationSystem {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        System.out.println("Enter Gender:");
        String gender = scanner.next();
        System.out.println("Enter marks in English:");
        double english = scanner.nextDouble();
        System.out.println("Enter marks in Nepali:");
        double nepali = scanner.nextDouble();
        System.out.println("Enter marks in Maths:");
        double maths = scanner.nextDouble();
        scanner.close();
        double Total = english+nepali+maths;
        double Average = Total/3;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Marks in English, Nepali and Maths respectively: " + english + "," + nepali + "," + maths);
        System.out.println("Total marks: " + Total);
        System.out.println("Average marks: " + Average);
        if (Average>40){
            System.out.println("Result: Pass");
        }
        else {
            System.out.println("Result: Fail");
        }
        if(Average>90 && Average<100){
            System.out.println("Grade: A+");
        } else if (Average>80 && Average<90) {
            System.out.println("Grade: A");
        } else if (Average>70 && Average<80) {
            System.out.println("Grade: B+");
        } else if (Average>60 && Average<70) {
            System.out.println("Grade: B");
        } else if (Average>50 && Average<60) {
            System.out.println("Grade: C+");
        } else if (Average>40 && Average<50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
