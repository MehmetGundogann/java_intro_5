package denemeler;

public class S {
    public static void main(String[] args) {

         int num = 10;

        System.out.println(getFibo(num));


    } public static  int getFibo( int number){
        int n1 =0, n2 =0, n3 =1;

        for(int i = 1; i < number; i++){
            System.out.println(n3 +  " ");

            n1=n2;
            n2=n3;
            n3=n1+n3;

            for (int j = 0; j < 4; j++) {

            }

        } return n3;

     }

}



