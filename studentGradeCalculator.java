import java.util.Scanner;                                     

public class studentGradeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double avPercentage = (double) totalMarks / numSubjects;
        String grade;
        if (avPercentage >= 90) {
            grade = "A";
        } else if (avPercentage >= 80) {
            grade = "B";
        } else if (avPercentage >= 70) {
            grade = "C";
        } else if (avPercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", avPercentage) + "%");
        System.out.println("Grade: " + grade);
    }
}