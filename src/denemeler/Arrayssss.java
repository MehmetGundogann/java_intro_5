package denemeler;

import utilities.ScannerHelper;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayssss {
    public static void main(String[] args) {

//        String[] cartoonCats = {"Garfield", "Tom", "Sylvester", "Azrael"};
//
//            Arrays.sort(cartoonCats);
//        System.out.println(Arrays.toString(cartoonCats));
//        System.out.println(Arrays.binarySearch(cartoonCats, "Garfield") >= 0 && Arrays.binarySearch(cartoonCats, "Felix") >= 0);


        //Reversing words in  a string place stays same words reverse
//
//        String str= "Java is fun";
//        String strReversed = "";
//
//
//        String[] strArr = str.split("[ ]+");// [Java, is, fun
//
//        for (String s : strArr){
////            StringBuilder sb = new StringBuilder(s);
////            strReversed += sb.reverse() + " ";
//
//            strReversed += new StringBuilder(s).reverse() + " ";
//
//        }
//
//        System.out.println(strReversed.substring(0,strReversed.length()-1));
//
//        String[] arr = {"abc", "foo", "bar"};
//
//        ArrayList<String> list = new ArrayList<>();
//
//
//        for (int i = arr.length-1; i >= 0 ; i--) {
//            list.add((arr[i]));
//        }
//        System.out.println(list);
//        }

        // String[] stringArr = {"a" , "xyz", "B", "B","b", "b" ,"a"};

//         ArrayList<String> container = new ArrayList<>();

        String[] my_array = {"a", "abd", "jude", "abd", "oiu", "gzw", "a"};

        boolean firstDup = false;


        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = i + 1; j < my_array.length; j++) {
                if ((my_array[i].equals(my_array[j]))  && !firstDup ) {
                    firstDup = true;
                    System.out.println("Duplicate Element is : " + my_array[j]);
                    break;

                }

            }
        }System.out.println("there is no dup");

    }
}












    

 