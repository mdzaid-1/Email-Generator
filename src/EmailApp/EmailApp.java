package EmailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        String firstName= sc.next();
        System.out.print("Enter your Last Name: ");
        String lastName= sc.next();
        new Email(firstName, lastName);
    }
}
