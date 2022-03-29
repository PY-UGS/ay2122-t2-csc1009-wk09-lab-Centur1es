package T9.Q1;

import java.util.ArrayList;

public class Main {
    static int MAX = 15;
    public static void main(String[] args) {
        RandomCharacter rm = new RandomCharacter();
        System.out.println("get random lowercase character");
        String lowerString = "";
        for (int i =0;i<MAX;i++){
            lowerString +=rm.getRandomLowerCaseLetter()+" ";
        }
        System.out.println(lowerString);

        System.out.println("\nget random Uppercase character");
        String upperString = "";
        for (int i =0;i<MAX;i++){
            upperString +=rm.getRandomUpperCaseLetter()+" ";
        }
        System.out.println(upperString);

        System.out.println("\nget random character");
        String charString = "";
        for (int i =0;i<MAX;i++){
            charString +=rm.getRandomCharacter()+" ";
        }
        System.out.println(charString);

        System.out.println("\nget random integer between 0-9");
        String intString = "";
        for (int i =0;i<MAX;i++){
            intString +=rm.getRandomDigitCharacter()+" ";
        }
        System.out.println(intString);





    }
}
