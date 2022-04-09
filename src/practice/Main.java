package practice;

public class Main {

    public static void main(String[] args) {

        // TODO: 1. Create a string
        // TODO: 2. Create an array of strings
        // TODO: 3. Find the length of a string
        // TODO: 4. Concatenate Strings
        // TODO: 5. Create an algorithm to prove string is palindrome

        YokohamaHighSchool yokohamaHighSchool = new YokohamaHighSchool();

        // Part 1
//        yokohamaHighSchool.setStudent("Yamato");
//        String studentName = yokohamaHighSchool.getStudent();
//        System.out.println(studentName);

        // Part 2
//        yokohamaHighSchool.createRoster();
//        yokohamaHighSchool.displayClassRoster();

        // Part 3
//        String firstName = "Orochimaru";
//        System.out.println(firstName.length());

        // Part 4
//        String productName = "Wings Of Fire ";
//        String productCost = "$4.99";
//        System.out.println(productName.concat(productCost));

        // Part 5
        Palindrome palindrome = new Palindrome();
        String answer = palindrome.isPalindrome();
        System.out.println(answer);
    }

}