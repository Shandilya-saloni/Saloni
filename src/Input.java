

/*//Accept two integers from user and print them
import java.util.Scanner;  //java me util nam ka package he waha pr Scanner nam ki class rkhi hui he or 1 package he java.lang jaha package ki sari chize import hui he to agr use use krte to import use nhi krna pdta

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //this is not a method (camel case pr parenthesis ka combination hi method hota he islie)
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " = " + (a+b));
    }
}*/
//Accept name and age from user
 import  java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your name ");
        String name = sc.nextLine();
        System.out.println("Your age");
        int age = sc.nextInt();
        System.out.println("Hello" + name + ". You are " + age + "years. ");

    }
}   //5,7,8,9 question no


