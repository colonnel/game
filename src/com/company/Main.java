package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        char[] abc = createArrAbc();
        int rl = rightLetter(abc);
        int indUserLetter = userLetter(abc);
        equalLetters(abc, indUserLetter,rl);


    }

    //create Arr
    private static char[] createArrAbc() {
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        return abc;
    }

//    private static int lengthAbc(char[] abc) {
//        int x = abc.length;
//        return x;
//    }

    //input correct letter
    private static int rightLetter(char[] abc) {

        Random r = new Random();
        int rl = r.nextInt(abc.length);
        return rl;
    }

    //getting letter from user
    private static int userLetter(char[] abc) {
        System.out.println("Введите букву латинского алфавита:");
        Scanner sc = new Scanner(System.in);
        String inputLt = sc.next();
        char inLetter = inputLt.charAt(0);
        int indUserLetter = -1;
        for (int i = 0; i < abc.length; i++) {
            if (inLetter == i) {
                indUserLetter = i;
            }
        }
        return indUserLetter;
    }

    //equal letters
    private static void equalLetters(char[] abc, int indUserLetter, int rl) {
        if (rl==-1) {
            System.out.println("Incorrect letter");
        } else if (indUserLetter == rl) {
            System.out.println("Вы победили!!!");
        } else if (indUserLetter < rl) {
            System.out.println("Буква дальше по алфавиту");
        } else if (indUserLetter > rl) {
            System.out.println("Буква ближе по алфавиту");
        }

//    System.out.println("Введите букву латинского алфавита:");
//    for(
//    int i = 0;
//    i<abc.length;i++)
//
//    {
//
//        Scanner sc = new Scanner(System.in);
//        String inputLt = sc.next();
//        char inLetter = inputLt.charAt(0);
//        for (int j = 0; j < abc.length; j++) {
//            if (inLetter == abc[j]) {
//                rl = j;
//            }
//        }
//        if (rl == i) {
//            System.out.println("Угадали!!!");
//        } else if (rl < i) {
//            System.out.println("Не угадали. Буква дальше по алфавиту");
//        } else {
//            System.out.println("Не угадали. Буква ближе по алфавиту");
//        }
//    }


    }
}
