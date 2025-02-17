import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        
        System.out.print("Enter number of courses: ");
        int courses = scanner.nextInt();
        
        int totalCredits = 0;
        double totalPoints = 0;
        
        for (int i = 0; i < courses; i++) {
            System.out.print("Enter course credit and total marks (out of 100): ");
            int credit = scanner.nextInt();
            double marks = scanner.nextDouble();
            
            double gradePoint;
            if (marks >= 90) gradePoint = 4.0;
            else if (marks >= 80) gradePoint = 3.5;
            else if (marks >= 70) gradePoint = 3.0;
            else if (marks >= 60) gradePoint = 2.5;
            else if (marks >= 50) gradePoint = 2.0;
            else gradePoint = 0.0;
            
            totalCredits += credit;
            totalPoints += gradePoint * credit;
        }
        
        double cgpa = (totalCredits > 0) ? (totalPoints / totalCredits) : 0.0;
        
        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Credit Taken: " + totalCredits);
        System.out.println("CGPA: " + String.format("%.2f", cgpa));
        
        scanner.close();
    }
}
