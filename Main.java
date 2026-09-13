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
    }
}