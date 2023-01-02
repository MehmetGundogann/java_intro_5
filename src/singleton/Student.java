package singleton;

public class Student {
    private static Student student;
    private Student(){}


    public static Student getStudent(){
        if(student == null) student = new Student();
        return student;
}


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
