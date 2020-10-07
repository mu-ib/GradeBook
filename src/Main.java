/**
 * @author Muhammad Ibrahim
 * Grade Book Lab
 * 7 October 2020
 * EXTRA: Instead of just making 2 gradebooks, allow the user to create multiple gradebooks with
 *        different names associated with the gradebooks
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("How many students would you like to create Grade Books for?");
        int numOfGradeBooks = s.nextInt();
        GradeBook[] gradeBooks = new GradeBook[numOfGradeBooks];
        System.out.println("Please print the name of the student(s)");

        //for loop to create gradebooks based on the user's choice
        for(int i = 0; i < gradeBooks.length; i++){
            System.out.println("Student " + (i+1) + ":    ");
            gradeBooks[i] = new GradeBook(s.next());
        }

        //for loop to set the course names and instructor names for each person
        for(int i = 0; i < gradeBooks.length; i++){
            //set course name
            System.out.println("\nWhat is the name of " + gradeBooks[i].name + "'s course?    ");
            gradeBooks[i].setCourseName(s.next());
            //set instructor name
            System.out.println("What is the name of " + gradeBooks[i].name + "'s instructor?    ");
            gradeBooks[i].setInstructorName(s.next());
            //welcome message
            System.out.println(gradeBooks[i].toString());
        }
    }
}
