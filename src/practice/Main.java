package practice;

public class Main {

    public static void main(String[] args) {
        String lineBreak = "\n---------------------\n";

        // TODO: Display current date and time
        CurrentDataAndTime currentDataAndTime = new CurrentDataAndTime();
        System.out.println("DATE AND TIME:");
        currentDataAndTime.display();
        System.out.println(lineBreak);

        // TODO: Display formatted date and time
        DateFormatting dateFormatting = new DateFormatting();
        System.out.println("FORMATTED DATE AND TIME:");
        dateFormatting.display();

    }

}