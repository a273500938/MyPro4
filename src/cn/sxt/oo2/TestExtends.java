package cn.sxt.oo2;

public class TestExtends {

    public static void main(String[] args) {
        Student stu=new Student();
        stu.name="夏成豪";
        stu.age=20;
        stu.rest();
        stu.study();


        System.out.println(stu.age);

        Student stu2=new Student();
        stu2.name="Tom";
        stu2.age=2;
        System.out.println(stu2 instanceof Student);
        System.out.println(stu2 instanceof Person);

        Person stu3=new Person();

        System.out.println(stu3 instanceof Student);


    }

}


class Person{
    String name;
    int age;

    public void rest(){
        System.out.println("休息一下");
    }

}
class Student extends Person {



    public void study(){
    System.out.println("学习两小时");
    }
}




