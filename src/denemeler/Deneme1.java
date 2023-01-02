package denemeler;


import utilities.ScannerHelper;

import java.util.Scanner;

public class Deneme1 {

    public static void main(String[] args) {
        String str = "  Java is FUN   ";
        str = str.toLowerCase().trim();

        String word1= str.substring(0,4);
        String word2 = str.substring(5,8);
        String word3 = str.substring(8);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }

    ///Counting letters in a string with loop
    public static int countLetters(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i))) {
                counter++;
            }

        }
        return counter;
    }

    //counting upper case letters in a string

    public static int countUpperCase(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                counter++;
            }

        }
        return counter;
    }

    public static void printStringAttributes(String s) {
        int upperC = 0, lowerC = 0, letterC = 0, digitC = 0, spaceC = 0, specialC = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                letterC++;
                if (Character.isUpperCase(c)) {
                    upperC++;
                } else {
                    lowerC++;
                }
            } else if (Character.isDigit(c)) {
                digitC++;
            } else if (Character.isWhitespace(c)) {
                spaceC++;
            } else {
                specialC++;
            }

        }

        System.out.println(upperC + lowerC + digitC + spaceC + specialC);
    }


    // finding the index of
    public static int findFirstIndexOf(String s, char c) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }

        }
        return -1;
    }

    public static int findTheLastIndexOf(String s, char c) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                return i;
            }

        }
        return -1;
    }

    public static String frontAndBack(String s) {
        String newS = "";
        for (int i = 0; i < s.length() / 2; i++) {

            if (s.endsWith(s.substring(0, i + 1))) {
                newS = s.substring(0, i + 1);
            }
        }
        return newS;
    }

        public static char mostRepeatedChar(String s){
        char mostRepeated = ' ';
        int mostAmount = 0;
            for (int i = 0; i <s.length() ; i++) {

               if( countChar(s, s.charAt(i)) > mostAmount){
                   mostRepeated = s.charAt(i);
                   mostAmount  = countChar(s, s.charAt(i));
               }
            }
            return mostRepeated;
        }




    // counting char in a String
        public static int countChar (String s, char c ){
        int counter = 0;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c) counter++;

            }
            return counter;
        }

}

