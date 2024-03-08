import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Grade Calculator ");
        System.out.println("Name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the marks in each subject");
        String subj[] = {"English", "Physics", "Chemistry", "Maths", "Biology"};
        int totalMarks = 0;
        for (int i = 0; i < subj.length; i++) {
            System.out.println(subj[i]);
            int marks = sc.nextInt();
            if(marks>100){
                System.out.println("Error! Marks obtained out of 100 must be entered.");
                System.out.println(" Enter again:");
                marks=sc.nextInt();
            }
            totalMarks += marks;
        }
        System.out.println(name + ", your result is as follows:");
        System.out.println("Total Marks Obtained: " + totalMarks);
        int avgPercentage = (totalMarks / subj.length);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        String grade;
        if (avgPercentage >= 85) {
            grade = "A+";
        } else if (avgPercentage >= 75) {
            grade = "A";
        } else if (avgPercentage >= 65) {
            grade = "B+";
        } else if (avgPercentage >= 60) {
            grade = "B";
        } else if (avgPercentage >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("Grade: " + grade);

        sc.close();
    }
}
