package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name=scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age=scanner.nextInt();
        // Prompt the user to enter their exam score
        System.out.print("Enter your score: ");
        int score=scanner.nextInt();
        // Determine the grade
        String grade;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Score: "+score);
        if(score>=90){
            System.out.println("Grade: A");
        }
        else if(score>80){
            System.out.println("Grade: B");
        }
        else if(score>70){
            System.out.println("Grade: C");
        }
        else if(score>60)
        {
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }

        // Print the student's details
        
        


       
    }
}
