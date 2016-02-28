package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //String abc = "abcdefghijklmnopqrstuvwxyz";

        Random r = new Random();
        int rl = r.nextInt(27);

        System.out.println("Введите букву латинского алфавита:");
        for (int i = 0; i < abc.length; i++) {

            Scanner sc = new Scanner(System.in);
            String inputLt = sc.nextLine();
            char inLetter = inputLt.charAt(0);
            for (int j = 0; j < abc.length; j++) {
                if (inLetter == abc[j]) {
                    rl = j;
                }
            }
            if (rl == i) {
                System.out.println("Угадали!!!");
            } else if (rl<i) {
                System.out.println("Не угадали. Буква дальше по алфавиту");
            } else {
                System.out.println("Не угадали. Буква ближе по алфавиту");
            }
        }


    }
}
