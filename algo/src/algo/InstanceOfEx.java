package algo;

class Person_1 {}
class Student_1 extends Person_1 {}
class Researcher extends Person_1 {}
class Professor extends Researcher {}

public class InstanceOfEx {
    static void print(Person_1 p) {
        if (p instanceof Person_1)
            System.out.print("Person_1 ");
        if (p instanceof Student_1)
            System.out.print("Student_1 ");
        if (p instanceof Researcher)
            System.out.print("Researcher ");
        if (p instanceof Professor)
            System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student_1()->\t");
        print(new Student_1());
        System.out.print("new Researcher()->\t");
        print(new Researcher());
        System.out.print("new Professor()->\t");
        print(new Professor());
    }
}

