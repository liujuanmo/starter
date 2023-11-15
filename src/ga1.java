import java.util.Scanner;
class ga1 {
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    //Write your code here
    //You can import the scanner class as discussed in the videos

    Scanner input= new Scanner(System.in);
    System.out.println("Ententer the value of a");
    a=input.nextInt();
    System.out.println("Ententer the value of b");
    b=input.nextInt();
    System.out.println("Ententer the value of c");
    c=input.nextInt();
     System.out.println(a*b+c);
  }
}
