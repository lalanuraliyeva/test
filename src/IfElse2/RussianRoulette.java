package IfElse2;

import java.util.Random;

public class RussianRoulette {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(0,6) + 1;

        if (randomNumber == 4){
            System.out.println("öldün!");
        }

        //Russian Roulette
    }
}
