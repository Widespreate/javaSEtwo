package collection03;

import java.util.Comparator;

public class MyComparatorWithId implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
       return s1.getId() - s2.getId();
    }
}
