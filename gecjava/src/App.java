import gec_java.src.student.Student;

public class App {
    public static void main(String[] args) throws Exception {
        


        Student std1 = new Student(12,"Lakshmi");
        System.out.println("the student details are \n");
        System.out.println("Id:"+ std1.stdID);
        System.out.println("Name:"+ std1.stdName);

    }
}
