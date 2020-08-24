package collection03;

public class Person implements Comparable {
    private int id ;
    private String name ;
    private int age ;
    private String city ;
    public Person() {
    }

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Person(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
    //重重写比较器的方法


    //返回值  整数1 负数-1 0
    //1代表当前对象大(返回数字表示下标，当前元素下表是0 ，降序3，2，1)
    //-1代表传入参数大跟（返回数字代表下标，当前元素为0，升序1，2，3）
    //0代表一样大
    @Override
    public int compareTo(Object o) {
      Person input =   (Person)o;
      //根据学号 降序  3,2,1
       int result =  this.id > input.id? -1:( this.id   == input.id?0:1);

       //如果学号相同根据姓名升序
        if(result == 0 ){
            //调用String已经重写过的compareTo本身就是升序/如果想要降序在前面加负号
           result =  -this.name.compareTo( input.name) ;
        }
        return result;

    }
}
