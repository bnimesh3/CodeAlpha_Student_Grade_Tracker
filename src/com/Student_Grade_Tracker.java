package com;

import java.util.Scanner;

public class Student_Grade_Tracker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Students");
		
		int student=sc.nextInt();
		
		 // Create arrays to store student grades
		int[] grades=new int[student];
		
		// Input loop to get grades from the teacher
		for(int i=0;i<student;i++) {
			System.out.print("Enter Grade of Students "+ (i+1) + ": ");
			grades[i]=sc.nextInt();
		}
		
		// Calculate average, highest, and lowest scores
		int sum=0;
		int highest = grades[0];
		int lowest = grades[0];
		
		for(int grade:grades) {
			sum += grade;
			
			if(grade > highest) {
				highest=grade;
			}
			
			if (grade < lowest) {
                lowest = grade;
            }
		}
		
		 // Calculate average
		double average = (double) sum/student;
		
		// Display results
        System.out.println("\nResults:");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        sc.close();
	}
}
