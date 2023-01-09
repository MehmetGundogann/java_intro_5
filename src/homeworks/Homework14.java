package homeworks;

public class Homework14 {
    public static void main(String[] args) {

    }

    //Task1
    public static void fizzBuzz(int num) {

        for (int i = 1; i < num; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0))
                //if (i % 15==0)
                System.out.println("Fizzbuzz");
            else if ((i % 3) == 0)
                System.out.println("Fizz");
            else if ((i % 5) == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);

        }
    }

    //Task2
    public static String fizzBuzz2(int num) {
        if (num % 15 == 0) return ("FizzBuzz");

        else if (num % 3 == 0) return "Fizz";
        else if (num % 5 == 0) return "Buzz";
        else return Integer.toString(num);


    }  //Task 3

    public static int findSumNumbers(String str) {
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) num += Integer.parseInt("" + str.charAt(i));
        }
        return num;
    }

    //Task4
    public static int findBiggestNumber(String str) {
        int max = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num = (num * 10) + Integer.parseInt("" + str.charAt(i));
                max = Math.max(num, max);
            } else {
                num = 0;
            }
        }
        return max;
    }

    //Task5
    public static String countSequenceOfCharacters(String s) {
        if (s.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(count).append(currentChar);
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        result.append(count).append(currentChar);
        return result.toString();
    }
}


