package Homework_5;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Ex_1 {
    static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<String>();
        Students.add("Elene");
        Students.add("Anano");
        Students.add("Mari");

        System.out.println("MENU");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Search Student");
        System.out.println("4. Sort Students");

        Scanner reader = new Scanner(System.in);
        int choice = reader.nextInt();
        reader.nextLine();


        if(choice == 1){
            System.out.println("Enter the student's name here:");
            String Student = reader.nextLine();

            if(!Student.isEmpty()){
                Students.add(Student);
                System.out.println("Student Added!");
            }
            else{
                System.out.println("Please enter the student's name");
            }

        }
        else if (choice == 2) {
            System.out.println("Enter the student's name here:");
            String Student = reader.nextLine();
            if(!Student.isEmpty()){
                if(Students.remove(Student)){
                    System.out.println("Student Removed!");
                }
                else{
                    System.out.println("Student Not Found!");
                }
            }
            else{
                System.out.println("Please enter the student's name");
            }
        }
        else if (choice == 3) {
            System.out.println("Enter the student's name here: ");
            String Student = reader.nextLine();
            if(!Student.isEmpty()){
                if(Students.contains(Student)){
                    System.out.println("Student is in the list!");
                }
                else{
                    System.out.println("Student is not in the list!");
                }
            }
        }
        else if (choice == 4) {
            Collections.sort(Students);
            for (String student : Students){
                System.out.print(student + " ");
            }
        }
        else{
            System.out.println("Please input the right choice");
        }
    }
}
