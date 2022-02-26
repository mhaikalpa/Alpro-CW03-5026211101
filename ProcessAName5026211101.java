import java.util.Scanner;

public class ProcessAName5026211101 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = scan.nextLine();
        int spacePosition = name.indexOf(" ");
        String last = name.substring( spacePosition+1);
        System.out.println("Your name is: " + last + ", " + name.charAt(0));
        
    }
}
