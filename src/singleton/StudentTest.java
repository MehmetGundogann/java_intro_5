package singleton;

import static singleton.Student.getStudent;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = getStudent();
        Student s2 = getStudent();
        Student s3 = getStudent();
        Student s4 = getStudent();


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);



    }

}
