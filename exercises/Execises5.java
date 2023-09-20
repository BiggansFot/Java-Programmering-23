package exercises;

import java.util.Scanner;


public class Execises5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char myChar;
        System.out.println("Write any letter.");
        myChar = scanner.next().charAt(0);

        if (Character.isLetter(myChar) == false && Character.) {
            System.out.println("You did not write a letter.");
        } else if (myChar == 'A' || myChar == 'a' || myChar == 'E' || myChar == 'e' || myChar == 'I' || myChar == 'i' || myChar == 'O' || myChar == 'o' || myChar == 'U' || myChar =='u' || myChar == 'Y' || myChar == 'y'){
            System.out.println(myChar + " is a wowel.");
        } else {
            System.out.println(myChar + " is a consonant.");
        }
        
    }

    
}
