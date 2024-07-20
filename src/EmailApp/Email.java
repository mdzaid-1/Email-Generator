package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int defaultPasswordLength=8;

    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email created: " + this.firstName+" " + this.lastName);
        this.department=setDepartment();
        email=firstName.toLowerCase()+"_"+lastName.toLowerCase()+this.department+"@company.ac.in";
        System.out.println(email);

        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your Password id: " +this.password);
        changePassword();

    }

    private String setDepartment(){
        System.out.print("Department codes:\n1 for sales\n2 for Development\n3 for Accounting\n4 for none\nEnter the Department: ");
        Scanner sc=new Scanner(System.in);
        int depChoice=sc.nextInt();
        if(depChoice==1)return  "1sales";
        else if(depChoice==2)return "2dev";
        else if (depChoice==3)return "3acc";
        else if(depChoice==4) return "4";
        else {
            System.out.println("Select your department from given codes");
            return setDepartment();
        }
    }
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$&!";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            int random=(int) (Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(random);
        }
        return new String(password);
    }
    public void changePassword() {
        System.out.println("Do you want to change your password:\n0 for NO\n1 for Yes");
        Scanner sc = new Scanner(System.in);
        int flag=sc.nextInt();
        if(flag==0) System.out.println("Thank You");
        else if (flag==1) {
            System.out.print("Enter your Password: ");
            String password= sc.next();
            System.out.println(email);
            System.out.println("Your new password is: "+password);
        }else System.out.println("Input is Invalid");
    }
}
