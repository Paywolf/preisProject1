import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! What's your name?");
        String nameInput = scanner.nextLine();
        String fileName = nameInput+".txt";
        Scanner reader = new Scanner(new File(fileName));
        System.out.println("Your name is "+nameInput+" and the file name is "+fileName);
        String all_grades = Files.readString(Paths.get(fileName));
        String[] grade_list = all_grades.split( "\r\n");
        var numberOfGrades = grade_list.length;
        System.out.println("You have collected "+numberOfGrades+" grades.");
        //System.out.println(all_grades);
        int runningCount = 0;
        int total = 0;
        for (String name : grade_list) {
            runningCount = runningCount + 1;
            total = grade_list[runningCount] + grade_list[runningCount];

//        String fileContents = "";
//        while(reader.hasNextLine()); {
//            fileContents = fileContents.concat(scanner.next() + "\n");
//        }
//        Integer.parseInt(fileContents);
//        System.out.println(fileContents);

 //       System.out.println("Your total grade is "+ totalnum );
//        for (String name : grade_list) {
//            int runningCount = 0;
//            runningCount = runningCount + 1;
//            if (name.equals("fgdzyjsyt")) { // equals vs ==, == not same place in memory
//                System.out.println(name);
//
//            }


    }

}
