package collection03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo09 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person(2,"zs",23,"西安");
        Person p2 = new Person(1,"ls",23,"天津");
        Person p4 = new Person(1,"zf",23,"天津");
        Person p3 = new Person(3,"ww",23,"北京");
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        Collections.sort(persons);
        System.out.println(persons);


        List<Student> students = new ArrayList<>();
        Student s1 = new Student(2,"zs",23,"西安");;
        Student s2 = new Student(1,"ls",23,"天津");
        Student s3 = new Student(3,"ww",23,"北京");

        students.add(s1);
        students.add(s2);
        students.add(s3);

        Collections.sort(students,new MyComparatorWithId());
        System.out.println(students);

    }
}
