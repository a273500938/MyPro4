package cn.sxt.oo2;

import java.time.Period;

public class Override {

    public static void main(String[] args) {
        Horse h= new Horse();
        h.run();
    }


}

class Vehicle extends Object{
    public void run(){
        System.out.println("run");
    }

    public void stop(){
        System.out.println("Stop");
    }
    public Person whoIsPsg(){
        return new Person();
    }
}

class Horse extends Vehicle{

    public void run(){
        System.out.println("Horse is running");
    }

    public Student whoIsPsg(){
        return new Student();
    }
}

