import java.util.Scanner;

public class PrintGrades
{
    public static void main(String[] args) {

        String letterGrade;
        String newScore;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Enter an exam score: ");
            int examScore = keyboard.nextInt();
            keyboard.nextLine();

            if ((examScore >= 97) && (examScore <= 100)) {
                letterGrade = "A+";
            } else if ((examScore >= 94) && (examScore <= 96)) {
                letterGrade = "A";
            } else if ((examScore >= 90) && (examScore <= 93)) {
                letterGrade = "A-";
            } else if ((examScore >= 87) && (examScore <= 89)) {
                letterGrade = "B+";
            } else if ((examScore >= 84) && (examScore <= 86)) {
                letterGrade = "B";
            } else if ((examScore >= 80) && (examScore <= 83)) {
                letterGrade = "B-";
            } else if ((examScore >= 77) && (examScore <= 79)) {
                letterGrade = "C+";
            } else if ((examScore >= 74) && (examScore <= 76)) {
                letterGrade = "C";
            } else if ((examScore >= 70) && (examScore <= 73)) {
                letterGrade = "C-";
            } else {
                letterGrade = "D";
            }

            if (letterGrade != "D") {
                System.out.println("Good job. Your grade is " + letterGrade + ".");
            } else {
                System.out.println("Go back to school.  Your grade is " + letterGrade + ".");
            }

            System.out.println("Do you want to enter another score (y/n)?");
            newScore = keyboard.nextLine();

        } while(newScore.equalsIgnoreCase("y"));
    }
}

