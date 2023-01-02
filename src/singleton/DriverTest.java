package singleton;


import static singleton.Driver.getDriver;

public class DriverTest {
    public static void main(String[] args) {




        Driver d1 = getDriver();
        Driver d2 = getDriver();
        Driver d3 = getDriver();
        Driver d4 = getDriver();



        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }

}
