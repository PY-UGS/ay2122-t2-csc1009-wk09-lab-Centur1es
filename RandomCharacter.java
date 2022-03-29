package T9.Q1;

import java.util.Random;
import java.util.Scanner;


public class RandomCharacter {


    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);

    public char getRandomLowerCaseLetter(){
        char c = (char)(r.nextInt(26) + 'a');
        return c;
    }

    public char getRandomUpperCaseLetter(){
        char c = (char)(r.nextInt(26) + 'A');
        return c;
    }
    public int getRandomDigitCharacter(){
        int num = (r.nextInt(10));
        return num;
    }



    public String getRandomCharacter() {
        int choice = r.nextInt(0,3);
        if(choice ==0) {
            return String.valueOf(getRandomLowerCaseLetter());
        }
        if(choice ==1) {
            return String.valueOf(getRandomUpperCaseLetter());
        }if(choice == 2) {
            return String.valueOf(getRandomDigitCharacter());
        }else{
            return "invalid choice";
        }
    }


}
