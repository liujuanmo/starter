import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {
    public static void main(String args[]) throws FileNotFoundException {


        File inputfile = new File("C:\\Users\\86158\\IdeaProjects\\a12\\src\\Alice in Wonderland.txt "); // specify the path of your file -  Note that C:\\ is used instead of C:\ to specify path
        // Create a scanner
        Scanner scan = new Scanner(inputfile);
        // scan lines from the file
        String Line1 =scan.nextLine();
        System.out.println(Line1);
        String Line2 =scan.nextLine();
        System.out.println(Line2);
        String Line3 =scan.nextLine();
        System.out.println(Line3);


    }
}

