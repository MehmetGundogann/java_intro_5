package homeworks;

import java.util.ArrayList;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("\n=======Task 1=======\n");

        int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        ArrayList<Integer> firstNumDup = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !firstNumDup.contains(numbers[i])) {
                    firstNumDup.add(numbers[i]);
                }
            }
        }
        if (firstNumDup.isEmpty()) System.out.println("there is no duplicates");
        else System.out.println(firstNumDup.get(0));

        System.out.println("\n=======Task 2=======\n");

        String[] words = {"a", "b", "B", "XYZ", "123"};
        ArrayList<String> firstStrDup = new ArrayList<>();

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j]) && !firstStrDup.contains(words[i])) {
                    firstStrDup.add(words[i]);
                }
            }
        }
        if (firstStrDup.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(firstStrDup.get(0));

        System.out.println("\n=======Task 3=======\n");

        int[] numbers1 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        ArrayList<Integer> numDups = new ArrayList<>();

        for (int i = 0; i < numbers1.length - 1; i++) {
            for (int j = i + 1; j < numbers1.length; j++) {
                if (numbers1[i] == numbers1[j] && !numDups.contains(numbers1[i])) {
                    numDups.add(numbers1[i]);
                }
            }
        }
        if (numDups.isEmpty()) System.out.println("There is no duplicates");
        else System.out.println(numDups);

        System.out.println("\n========Task 4=======\n");

        String[] randomWords = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        ArrayList<String> findDups = new ArrayList<>();

        for (int i = 0; i < randomWords.length - 1; i++) {
            for (int j = i + 1; j < randomWords.length; j++) {
                if (randomWords[i].equalsIgnoreCase(randomWords[j]) && !findDups.contains(randomWords[i])) {
                    findDups.add(randomWords[i]);
                    break;
                }
            }
        }
        if (findDups.isEmpty()) System.out.println("There is no duplicates");
        else  for (String element : findDups) System.out.println(element);

        System.out.println("\n=======Task 5=======\n");

        String[] elements = {"abc", "foo", "bar"};
        ArrayList<String> reversed = new ArrayList<>();

        for (int i = elements.length - 1; i >= 0; i--) {
            reversed.add(elements[i]);
        }
        System.out.println(reversed);

        System.out.println("\n------------Task 6------------\n");

        String str = "Java is fun";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        String[] reserve2 = reverse.split(" ");
        String reverseAgain = "";
        for (int i = reserve2.length - 1; i >= 0; i--) {
            reverseAgain += reserve2[i] + " ";
        }
        System.out.println(reverseAgain.trim());

    }
}

