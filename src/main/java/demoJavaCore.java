import java.util.Scanner;

public class demoJavaCore implements demoInterface {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int i = sc.nextInt();
//        switch (i) {
//            case 1:
//                System.out.println("1");
//            default:
//                System.out.println("default");
//            case 2:
//                System.out.println("2");
//
//        }
// -------------------------------------------------------------
//        String s = "abc";
//        s = s.concat("def");
//        System.out.println(s);
// -------------------------------------------------------------
//        Integer a = 10, b = 10;
//        System.out.println(a == b);
//
//        Integer c = 1000, d = 1000;
//        System.out.println(c == d);
//
//        Integer e = 10;
//        Integer f = new Integer(10);
//        System.out.println(e == f);
// -----------------------------------------------------
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                if (j == 5) {
//                    break;
//                }
//                System.out.println(i);
//            }
//        }

//        Student s1 = new Student();
//        s1.count++;
//        Student s2 = new Student();
//        s2.count++;
//        Student s3 = new Student();
//        s3.count++;
//
//        System.out.println(s1.count + ", " + s2.count + ", " + s3.count);

//        Cow c1 = new Cow();
//        Cow c2 = new Cow();
//        System.out.println("Total: " + Cow.getCount());

    }

}

class Student {

    static int count = 1;

}

class Cow {

    private String name;

    private static int numOfCows = 0;

    public static int getCount() {
        return numOfCows;
    }

    public Cow() {
        numOfCows++;
        System.out.println("Cow #" + numOfCows + " created");
    }

}

class MyWebsite {

    public static String WEBSITE = "thai.dinhquang.com";

}

class UsingStaticExample {

    private String subject;

    public UsingStaticExample(String subject) {
        this.subject = subject;
    }

    public void print() {
        System.out.println("Subject = " + subject);
        System.out.println("Website = " + MyWebsite.WEBSITE);
    }

    public static void changeWebsite(String website) {
        MyWebsite.WEBSITE = website;
    }

    public static void main(String[] args) {
        UsingStaticExample ex1 = new UsingStaticExample("Core Java");
        ex1.changeWebsite("abc.com");
        ex1.print();
        System.out.println("-------------------------");
        UsingStaticExample.changeWebsite("thai.dinhquang.com");
        ex1.print();
    }

}

class Example {

    static {
        System.out.println("this is static block");
    }

    {
        System.out.println("this is non-static block");
    }

    public Example() {
        System.out.println("this is constructor");
    }

    public static void main(String[] args) {
        Example ex = new Example();
    }

}

class Base {

    static {
        System.out.println("this is base static block");
    }

    {
        System.out.println("this is base non-static block");
    }

    public Base() {
        System.out.println("this is base constructor");
    }

}

class Derived extends Base {

    static {
        System.out.println("this is derived static block");
    }

    {
        System.out.println("this is derived non-static block");
    }

    public Derived() {
        System.out.println("this is derived constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Derived d = new Derived();
    }

}