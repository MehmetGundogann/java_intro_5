package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("----Task01----");
        System.out.println(hasLowerCase("JaVa"));

        System.out.println("----Task02----");
        Integer[] arr = {4,0,2};
        System.out.println(noZero(arr));

        System.out.println("----Task03----");
        int[] array = {1, 2, 3};
        System.out.println(Arrays.deepToString(numberAndSquare(array)));



    }

     public static boolean hasLowerCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))){
                return true;
            }
        }return false;
    }

     public static ArrayList<Integer> noZero(Integer[] num){
        ArrayList<Integer> nums = new ArrayList<>();

        for (Integer i : num) {
            if (i != 0){
                nums.add(i);
            }
        }return nums;
    }

     public static int[][] numberAndSquare(int[] array) {
        int[][] result = new int[array.length][2];
        for (int i = 0; i < array.length; i++) {
            result[i][0] = array[i];
            result[i][1] = array[i] * array[i];
        }
        return result;
    }

     public static boolean containsValue(String[] variable, String value){
        for (String s : variable) {
            if (s.equals(value)){
                return true;
            }
        }return false;
    }

     public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length < 2) {
            return "There is not enough words!";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            if (i == words.length - 1) {
                word = word.toLowerCase();
            } else if (i == 0) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
            }
            sb.append(word);
            sb.append(" ");
        }

        return sb.toString().trim();
    }


    public static String removeStringCharacters(String str){
        String st = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) || Character.isSpaceChar(str.charAt(i))){
                st += str.charAt(i);
            }
        }return st;
    }

     public static String[] removeArraySpecialsDigits(String[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            String element = array[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < element.length(); j++) {
                char ch = element.charAt(j);
                if (Character.isLetter(ch) || Character.isSpaceChar(ch)) {
                    sb.append(ch);
                }
            }
            result[i] = sb.toString();
        }
        return result;
    }


     public static List<String> removeAndReturnCommons(List<String> list1, List<String> list2) {
        List<String> commons = new ArrayList<>();
        for (String element : list1) {
            if (list2.contains(element)) {
                commons.add(element);
                list2.remove(element);
            }
        }
        return commons;
    }

     public static List<String> noXInVariables(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String element : list) {
            if (!"x".equalsIgnoreCase(element)) {
                element = element.replaceAll("(?i)x", "");
                result.add(element);
            }
        }
        return result;
    }
}



