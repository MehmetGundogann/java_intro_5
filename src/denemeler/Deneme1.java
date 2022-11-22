package denemeler;

public class Deneme1 {
    public static void main(String[] args) {
        String str = "abc 123 $#^";

        System.out.println(str.replaceAll("[ $#^\\s]", ""));


    }
}
