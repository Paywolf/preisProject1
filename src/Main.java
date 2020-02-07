import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
//  Assumption: All grades whole numbers

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! What's your name?");
        String nameInput = scanner.nextLine();
        String fileName = nameInput+".txt";
//        System.out.println("Your name is "+nameInput+" and the file name is "+fileName); (OPTIONAL)
        String all_grades = Files.readString(Paths.get(fileName));
        String[] grade_list = all_grades.split( "\r\n");
        var numberOfGrades = grade_list.length;
        Integer[] gradeNums = new Integer[grade_list.length];
        int totalScore = 0;
        for(int i = 0; i < grade_list.length; i++){
            gradeNums[i] = Integer.parseInt(grade_list[i]);
//            System.out.println(gradeNums[i]); (OPTIONAL)
            totalScore = totalScore + gradeNums[i];
        }
        int finalScore = totalScore / numberOfGrades;
//        System.out.println("You have collected "+numberOfGrades+" grades."); (OPTIONAL)
//        System.out.println("Your total score is "+totalScore+", your final score is "+finalScore+"."); (OPTIONAL)
        if(finalScore >= 97 && finalScore <= 100){
            System.out.println(nameInput+": Your final score is an A+");
        } else if (finalScore >= 93 && finalScore <= 96) {
            System.out.println(nameInput+": Your final score is an A");

        } else if (finalScore >= 90 && finalScore <= 92) {
            System.out.println(nameInput+": Your final score is an A-");

        } else if (finalScore >= 87 && finalScore <= 89) {
            System.out.println(nameInput+": Your final score is a B+");

        } else if (finalScore >= 83 && finalScore <= 86) {
            System.out.println(nameInput+": Your final score is a B");

        } else if (finalScore >= 80 && finalScore <= 82) {
            System.out.println(nameInput+": Your final score is a B-");

        } else if (finalScore >= 77 && finalScore <= 79) {
            System.out.println(nameInput+": Your final score is a C+");

        } else if (finalScore >= 73 && finalScore <= 76) {
            System.out.println(nameInput+": Your final score is a C");

        } else if (finalScore >= 70 && finalScore <= 72) {
            System.out.println(nameInput+": Your final score is a C-");

        } else if (finalScore >= 67 && finalScore <= 69) {
            System.out.println(nameInput+": Your final score is a D+");

        } else if (finalScore >= 63 && finalScore <= 66) {
            System.out.println(nameInput+": Your final score is a D");

        } else if (finalScore >= 60 && finalScore <= 62) {
            System.out.println(nameInput+": Your final score is a D-");

        } else if (finalScore >= 0 && finalScore <= 59) {
            System.out.println(nameInput+": Your final score is an F");

        }
    }

}
