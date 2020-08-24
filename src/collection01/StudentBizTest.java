package collection01;

public class StudentBizTest {
    public static void main(String[] args) {
        StudentBiz stuBiz= new StudentBiz();
        Student student = new Student() ;
        student.setName("张三");
        student.setAge(23);
        Student student0 = new Student() ;
        student0.setName("李四");
        student0.setAge(24);
        Student student1 = new Student() ;
        student1.setName("王五");
        student1.setAge(23);
        stuBiz.addStudent(student);
        stuBiz.addStudent(student0);
        stuBiz.addStudent(student1);
        stuBiz.showStudent();
stuBiz.count();


    }
}
