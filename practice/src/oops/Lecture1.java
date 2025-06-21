package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lecture1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student boy1 = new Student();
        System.out.println(boy1);

        boy1.roll = 100;
        boy1.name = "kodu";
        boy1.marks = 100f;

        System.out.println(boy1.name);

        Student [] boys = new Student[5];
        System.out.println(boys.length);
        for (int i = 0; i < boys.length; i++) {
            int roll = sc.nextInt();
            String s = sc.next();
            float marks = sc.nextFloat();
            boys[i] = new Student(roll, s, marks);

            System.out.print(boys[i].roll + " ");
            System.out.print(boys[i].name + " ");
            System.out.print(boys[i].marks);

        }
        Student girl = new Student(20, "anjali", 43f);
        girl.greetings();
        boy1.greetings();
        for (Student boy : boys) {
            boy.greetings();
        }


        Student girl2 = new Student();
        int a = 10;
        System.out.println(Integer.toBinaryString(a));


    }


}

class Student {
    int roll;
    String name;
    float marks;

    //functions in constructor
    void greetings() {
        System.out.println("salut" + " " + this.name + " " + this.marks);
    }
    Student (){


    }

    Student (int roll, String name, float marks){
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }
}
