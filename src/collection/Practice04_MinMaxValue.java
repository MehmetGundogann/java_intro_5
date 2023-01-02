package collection;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice04_MinMaxValue {
    public static void main(String[] args) {

     }

     public static Integer max(Integer[] arr){
        return new TreeSet<>(Arrays.asList(arr)).pollLast();
     }
             /*
        Find the min from given numbers below

        [10, 100, 123, 507, 25] -> 10
        [12] -> 12
        [] -> null
         */




}
