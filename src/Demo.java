public class Demo {
    public static void main(String[] args) {   //demo,string,system are in pascal case
        int a = 54;
        int b = 12;
        System.out.println("The sum of " + a + " & " + b + "is = " +(a + b) );
    }
}
//Naming convention for Class/Variable/Method name --> Identifiers
//must start with an alphabet or _ or $
//can end with a alphabet or _ or $ or numeric digits
//Spaces are not allowed
//No reserved keywords
//java is case sensitive
//Cases and conventions for clean and readable code.
//  --PascalCase - Class & Interface    //hr case ka pehla word capital
//  --camelCase - variable and method name    // first completely lower case then upper   //This two will be used in java
//  --snake_case - isme underscore use hoti variable ke name ke bich.
//  --kawab-case - not supported in java.
// ---Game of brackets
    //   --()-Methods         - Parenthesis (wherever there is paranthesis it denotes method)
   //   --{} - Scope/body     - Curly       (---------------- curly--------------scope or body)
  //   --[] - Array           - Square      (---------------square---------------array)
//    --<>  - Generics        - Angular     (---------------angular------------generics)

//There are two types of data types:                 07/04/22
// primitive(pre-defined) and non-primitive(user-defined)
/*There are 8 types of primitive data types in java:
   valid or not valid
   int intA=10;
   String $ab1="";
   int_abc001 = 10;
   ****Every integer constant in java is int by default <---most impoooo
   assignment operator right to left chlta he (=)
   byte b = 12; (here firstly value will be seen then container means right to left assignment operator)
   long a = 2147483848 //this will give error bcz it is above the range of int and java will consider it as int.so the solution is:
   long a = 2147483848L; (we can take small l also)
   float f = 3.0F // this is correct (but it is not preferred in java)
   double d = 3.0; (points wali value by default double me hi jati he)
   boolean is a data type that stores decisions (either yes or no)(True or False)
   char ch = 'L'; (whatever value is in single quotes  is considered as character literals)
   char ch = '\' (This is an exception it can't be treated as character literal) */
  /* There are 5 types of literals:           09/04/22
  -> integer literal
   ->floating literal
   ->character literal
   ->string literal
   ->boolean literal
 */