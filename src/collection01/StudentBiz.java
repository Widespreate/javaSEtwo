package collection01;

public class StudentBiz {
    Student[] students = new Student[30];

    //将学生对象放入第一个为Null的地方
    public boolean addStudent(Student student) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("数组已满！增加失效！");
            return false;
        } else {
            students[index] = student;
            return true;
        }
    }


    public void showStudent() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println("姓名：" + students[i].getName() + "\t年龄:" + students[i].getAge());
            }
        }
    }

    public void count() {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count+=1;
            }
        }
        System.out.println(count);
    }
}

