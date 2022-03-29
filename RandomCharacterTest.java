package T9.Q1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static T9.Q1.RandomCharacter.r;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class RandomCharacterTest {
    static RandomCharacter randomCharacter;

    @BeforeEach
    public void setUp(){
        randomCharacter = new RandomCharacter();
    }

    @Test
    void getRandomLowerCaseLetter(){
        System.out.println("Check its lowercase letter");
        char lowerChar = randomCharacter.getRandomLowerCaseLetter();
        System.out.println("Lowercase letter: "+ lowerChar);
        assertTrue(Character.isLowerCase(lowerChar));
    }

    @Test
    void getRandomUpperCaseLetter(){
        System.out.println("Check its uppercase letter");
        char upperChar = randomCharacter.getRandomUpperCaseLetter();
        System.out.println("Uppercase letter: "+ upperChar);
        assertTrue(Character.isUpperCase(upperChar));
    }
    @Test
    void getRandomDigitCharacter(){
        System.out.println("Check its number between 0-9");
        int num = randomCharacter.getRandomDigitCharacter();
        System.out.println("Number: "+ num);
        assertTrue(num >= 0 && num<10);
    }
    @Test
    void getRandomCharacter(){
        String chart = randomCharacter.getRandomCharacter();
        String check = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        Boolean flag = false;
        System.out.println("Check if its character");
        System.out.println("Character: "+ chart);
        if(check.contains(chart)){
            flag = true;
        }
        assertTrue(flag);
    }



    @Test
    void CheckPrimeNum(){
        Boolean flag = true;
        int number = (r.nextInt(2000000));
        //if number <=1 means it's not a prime number
        System.out.println("check is prime number");
        if(number <= 1){
            flag = false;
        }
        for (int i = 2; i<= number/2; i++) {
            if ((number % i) == 0) {
                flag = false;
            }
        }
        System.out.println("number: "+number);
        assertTrue(flag);
    }


}
