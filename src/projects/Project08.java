package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {

            int[] array = {4};

        System.out.println(findClosestDistance(array));

        System.out.println("\n=-==-==-==-==-==-==-==-==-==-=Task-2=-==-==-==-==-==-==-==-==-==-=\n");

                 int[] numbers = {2};

                System.out.println(findSingleNumber(numbers));

        System.out.println("\n=-==-==-==-==-==-==-==-==-==-=Task-3=-==-==-==-==-==-==-==-==-==-=\n");

                String str = "Hello";

                System.out.println(findFirstUniqueCharacter(str));

        System.out.println("\n=-==-==-==-==-==-==-==-==-==-=Task-4=-==-==-==-==-==-==-==-==-==-=\n");

                 int[] nums4 = {2, 4};

                System.out.println(findMissingNumber(nums4));
    }

    public static int findClosestDistance(int[] array) {

        int minDistance = Integer.MAX_VALUE;
        if (array.length < 1) {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length - 1; j++) {
                    if (Math.abs(array[i] - array[j]) < minDistance) minDistance = Math.abs(array[i] - array[j]);
                }
            }
            return minDistance;
        }
        return -1;
    }

    public static int findSingleNumber(int[] arr) {
        int singleNumber = 0;
        ArrayList<Integer> hasDuplicate = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) hasDuplicate.add(arr[i]);
            }
            if (!hasDuplicate.contains(arr[i])) singleNumber = arr[i];
        }
        return singleNumber;
    }

    public static char findFirstUniqueCharacter(String str) {

        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique)
                return str.charAt(i);
        }
        return ' ';
    }

    public static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);
        int missingNumber = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) missingNumber = arr[i] + 1;
        }
        return missingNumber;
    }
}