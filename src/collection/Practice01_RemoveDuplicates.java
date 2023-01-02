package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice01_RemoveDuplicates {
    public static void main(String[] args) {





    }

     public static Integer[] removeDuplicates(Integer[] arr){
         LinkedHashSet<Integer> hs = new LinkedHashSet<>(Arrays.asList(arr));
         return hs.toArray(new Integer[0]);

         //return new LinkedHashSet<>(Arrays.asList(arr)).toArray(new Integer[0]);





//        ArrayList<Integer> uniques = new ArrayList<>();
//        for (Integer i : arr) {
//            if(!uniques.contains(i)) uniques.add(i);
//        }
//
//        return uniques.toArray(new Integer[0]);
        }
    }

