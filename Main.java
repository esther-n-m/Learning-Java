public class Main {
    public static void main (String [] args) {
        System.out.println("Esther is my name.");
        System.out.println(12*2);
        //Print a name
        System.out.println("Joe");
        /*
        Adding a multi-line comment
        */

        //Variables
        String myName = "Esie";
        System.out.println(myName);

        int myNum = 123;
        System.out.println(myNum);

        float myFloatNum = 4.55f;
        System.out.println(myFloatNum);

        char myLetter = 'E';
        System.out.println(myLetter);

        boolean myBool = true;
        System.out.println(myBool);

        //Variable + variable
        int x = 5;
        int y = 6;
        int sum = x + y;
        System.out.println(sum);

        //Text + Numbers
        String text = "My age is ";
        int age = 12;
        System.out.println(text + age);

        //Importance of parantheses
        int b = 5;
        int c = 6;
        System.out.println("The sum is: " + b + c);
        System.out.println("The sum is: " + (b + c));

        //Declare variables of same type
        int x1 = 5, y1 = 6, z1 = 50;
        System.out.println(x1 + y1 + z1);

        //same value multiple variables
        int x2, y2, z2;
        x2 = y2 = z2 = 50;
        System.out.println(x2 + y2 + z2);

        //Final variables
        final int myFinalNum = 15;
        System.out.println(myFinalNum);
        //final variables are usually written in uppercase letters
        final int BIRTHYEAR = 2004;
        System.out.println(BIRTHYEAR);

        //float and double suffix
        float myFloatNum1 = 5.99f;
        double myDoubleNum = 9.98d;
        System.out.println(myFloatNum1);
        System.out.println(myDoubleNum);

        //VAR Keyword
        var greeting = "Hello";
        System.out.println(greeting);
        var myNum1 = 5;
        System.out.println(myNum1);

        //type casting
        //widening casting (automatically) - converting a smaller type to a larger type size
        int myInt = 9;
        double myDouble = myInt;   
        System.out.println(myDouble); 
        
        //narrowing casting (manually) - converting a larger type to a smaller size type
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1;
        System.out.println(myInt1);
    }
}