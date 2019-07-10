package cn.sxt.oo2;

import java.util.Objects;

public class TestEquals {
    public static void main(String[] args) {
        Object obj;
        String str;

        User u1= new User(1000,"xch","123");
        User u2= new User(1000,"xch2","123");

        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));

        String str1 = new String("xch");
        String str2 = new String("xch");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));


    }
}

class  User{
    int id;
    String name;
    String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;//强制转型
        return id == user.id;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
