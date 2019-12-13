package day37_Inhertance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int questions;
		int missed;
		
		System.out.print("How many questions are on the final exam?");
		questions=sc.nextInt();
		
		System.out.print("How many questions did the student miss?");
		missed=sc.nextInt();
		
		FinalExam exam = new FinalExam(questions, missed);
		
		System.out.println("The grade for the exam is " + exam.getGrade());
		
		
		

	}

}