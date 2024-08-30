


C:\Users\V.THARUN KUMAR\Pictures\Screenshots\Screenshot 2024-08-30 111314.png


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects:");
        int noofSubjects = scanner.nextInt();

        double[] grades = new double[noofSubjects];
        double total = 0;

        // Input grades for each subject
        for (int i = 0; i < noofSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i];
        }

       // find the average marks 
        double avg = total / noofSubjects;

       // find letter marks  and GPA
        String letterGrade = getLetterGrade(avg);
        double gpa = getGPA(avg);

       // show results
        System.out.println("\nSummary:");
        System.out.println("Average marks : " + avg);
        System.out.println("Letter marks : " + letterGrade);
        System.out.println("GPA: " + gpa);

        scanner.close();
    }

    // Method to determine letter grade based on average
    private static String getLetterGrade(double avg) {
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to determine GPA based on average
    private static double getGPA(double avg) {
        if (avg >= 90) {
            return 4.0;
        } else if (avg >= 80) {
            return 3.0;
        } else if (avg >= 70) {
            return 2.0;
        } else if (avg >= 60) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}
