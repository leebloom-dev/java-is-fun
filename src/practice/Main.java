package practice;

public class Main {

    private static void myStaticInHouseMessage() {
        System.out.println("This static method came from class Main.");
    }

    public static void main(String[] args) {

        // Static method from class Utilities
        Utilities.myStaticMethod();

        // Static method from class Main
        myStaticInHouseMessage();

    }

}