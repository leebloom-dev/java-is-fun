package practice;

import java.util.Scanner;

public class Palindrome {

    /* FIELDS */
    private String name;
    private String palindromeName = "";
    private String[] myArray;

    /* CONSTRUCTORS */
    public Palindrome() {
    }

    /* METHODS */
    public void setName() {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a name: ");
        this.name = input.next();
        input.close();
    }

    public void setArray() {
        for (int i = 0; i < name.length(); i++) {
            this.myArray = name.split("");
        }
    }

    public void buildReversedName() {
        for (int i = myArray.length - 1; i >= 0; i--) {
            this.palindromeName = palindromeName.concat(myArray[i]);
        }
    }

    public String isPalindrome() {
        setName();
        setArray();
        buildReversedName();

        System.out.println("Is palindrome?");
        if (name.equals(palindromeName)) {
            return "true";
        } else {
            return "false";
        }
    }

}
