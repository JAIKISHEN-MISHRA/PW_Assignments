import java.util.Scanner;
public class Q1String {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=ob.nextLine();
        System.out.println("Your name is "+name);
        ob.close();
    }
}
