package cn.sxt.oo2;

public class TestObject {
    public static void main(String[] args) {

        TestObject to = new TestObject();
        System.out.println(to.toString());

        Perdon2 p2 = new Perdon2();
        p2.age=20;
        p2.name="jarry";
        System.out.println(p2.toString());
    }

    public String toString(){
        return "Test Object";
    }
}

class Perdon2{
    String name;
    int age;

    @java.lang.Override
    public String toString(){
        return name+".age;"+age;
    }
}
