
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScanText1 {
    public static void main(String args[]) throws FileNotFoundException {

        //creating File instance to reference text file in Java
        File inputfile = new File("C:\\Users\\86158\\IdeaProjects\\a12\\src\\Alice in Wonderland.txt"); // specify the path of the file

        Scanner scan = new Scanner(inputfile);

        //Reading each line of file using Scanner class
        int wordNumber = 1;  // keep track of line number

        while(scan.hasNextLine()==true){

            String word = scan.next();
            System.out.println("word " + wordNumber + " :" + word);
            wordNumber++;
        }
    }
}
