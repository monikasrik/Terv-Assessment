
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

******************************************************************************/
//Online Learning Portal
import java.util.Scanner;

class Stack {
    Node top;

    Stack() {
        top = null;
    }

    class Node {
        String data;
        Node next;

        Node(String d) {
            data = d;
            next = null;
        }
    }

    public void push(String d) {
        Node newnode = new Node(d);
        if (top == null) {
            top = newnode;
        } else {
            newnode.next = top;
            top = newnode;
        }
    }

    public void display() {
        if (top == null) {
            System.out.println("No one is there");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}

class Basics {
    Scanner sc1 = new Scanner(System.in);

    public void introduction() {
        System.out.println("🌟 Introduction to Java");
        System.out.println("Java is a high-level, object-oriented programming language developed by Sun Microsystems.");
        System.out.println("Platform independent, secure, and widely used for desktop, web, and mobile apps.");
    }

    public void basics() {
        System.out.println("🌱 Java Basics – Definitions and Concepts");
        System.out.println("Class, Object, Method, Variables, Data Types, Conditional Statements, Loops.");
    }

    public void test() {
        System.out.println("------ Basic Level Test --------");

        System.out.println("1. Does every Java program need a main method? (1 for Yes, 0 for No):");
        int t1 = sc1.nextInt();
        System.out.println(t1 == 1 ? "Correct" : "Wrong");

        System.out.println("2. Can a String store numbers like 100 or 50.5? (1 for Yes, 0 for No):");
        int t2 = sc1.nextInt();
        System.out.println(t2 == 1 ? "Wrong" : "Correct");

        System.out.println("3. Does System.out.println() print text? (1 for Yes, 0 for No):");
        int t3 = sc1.nextInt();
        System.out.println(t3 == 1 ? "Correct" : "Wrong");

        System.out.println("4. Is 'int' used for decimal values? (1 for Yes, 0 for No):");
        int t4 = sc1.nextInt();
        System.out.println(t4 == 1 ? "Wrong" : "Correct");

        System.out.println("5. Is JVM used to compile Java code? (1 for Yes, 0 for No):");
        int t5 = sc1.nextInt();
        System.out.println(t5 == 1 ? "Wrong - It's used to run bytecode" : "Correct");
    }
}

class Medium {
    Scanner sc2 = new Scanner(System.in);

    public void topic() {
        System.out.println("🧠 Intermediate Java Topics");
        System.out.println("Arrays – Containers to store multiple values of the same type.");
        System.out.println("Constructors – Special methods used to initialize objects.");
        System.out.println("Inheritance – One class inherits properties from another.");
        System.out.println("Method Overloading – Same method name, different parameters.");
        System.out.println("Access Modifiers – public, private, protected control visibility.");
    }

    public void test() {
        System.out.println("------ Intermediate Level Test --------");

        System.out.println("1. Can an array store multiple values of different types? (1 for Yes, 0 for No):");
        int t1 = sc2.nextInt();
        System.out.println(t1 == 1 ? "Wrong" : "Correct");

        System.out.println("2. Are constructors used to destroy objects? (1 for Yes, 0 for No):");
        int t2 = sc2.nextInt();
        System.out.println(t2 == 1 ? "Wrong" : "Correct");

        System.out.println("3. Can a subclass access private variables of a superclass? (1 for Yes, 0 for No):");
        int t3 = sc2.nextInt();
        System.out.println(t3 == 1 ? "Wrong" : "Correct");

        System.out.println("4. Is method overloading based on method name only? (1 for Yes, 0 for No):");
        int t4 = sc2.nextInt();
        System.out.println(t4 == 1 ? "Wrong - Also depends on parameters" : "Correct");

        System.out.println("5. Does 'protected' allow access within package and subclass? (1 for Yes, 0 for No):");
        int t5 = sc2.nextInt();
        System.out.println(t5 == 1 ? "Correct" : "Wrong");
    }
}

class Advanced {
    Scanner sc3 = new Scanner(System.in);

    public void topic() {
        System.out.println("🚀 Advanced Java Topics");
        System.out.println("Interfaces – A reference type with abstract methods.");
        System.out.println("Multithreading – Running multiple threads simultaneously.");
        System.out.println("Exception Handling – Try, Catch, Finally to handle errors.");
        System.out.println("Collections – Framework for storing and manipulating groups of data.");
        System.out.println("Streams – Functional-style operations for processing collections.");
    }

    public void test() {
        System.out.println("------ Advanced Level Test --------");

        System.out.println("1. Can an interface have method implementations in Java? (1 for Yes, 0 for No):");
        int t1 = sc3.nextInt();
        System.out.println(t1 == 1 ? "Correct - From Java 8, default methods are allowed" : "Wrong");

        System.out.println("2. Are threads used to create GUIs? (1 for Yes, 0 for No):");
        int t2 = sc3.nextInt();
        System.out.println(t2 == 1 ? "Wrong" : "Correct");

        System.out.println("3. Does 'finally' always execute in a try-catch block? (1 for Yes, 0 for No):");
        int t3 = sc3.nextInt();
        System.out.println(t3 == 1 ? "Correct" : "Wrong");

        System.out.println("4. Is ArrayList part of the Java Collection framework? (1 for Yes, 0 for No):");
        int t4 = sc3.nextInt();
        System.out.println(t4 == 1 ? "Correct" : "Wrong");

        System.out.println("5. Are Java Streams used for multithreading? (1 for Yes, 0 for No):");
        int t5 = sc3.nextInt();
        System.out.println(t5 == 1 ? "Wrong - Streams are for data processing" : "Correct");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        Basics b = new Basics();
        Medium m = new Medium();
        Advanced a = new Advanced();

        System.out.println("\t\tWELCOME TO THE ONLINE JAVA LEARNING PLATFORM");

        int password = 12345;
        System.out.print("Are you admin? Enter password or 0 to skip: ");
        int pwdentered = sc.nextInt();
        sc.nextLine(); 

        if (pwdentered == password) {
            System.out.print("Enter how many students you want to enroll: ");
            int count = sc.nextInt();
            sc.nextLine(); 
            for (int i = 1; i <= count; i++) {
                System.out.print("Enter Student " + i + " name: ");
                String sname = sc.nextLine();
                s.push(sname);
            }
            System.out.println("Enrolled Students:");
            s.display();
        } else if (pwdentered == 0) {
            System.out.print("Your Name: ");
            String userName = sc.nextLine();
            System.out.println("Hello " + userName);

            System.out.print("Enter your ID (or press 0 if you don’t have one): ");
            int id = sc.nextInt();

            System.out.println("From which level you want to learn:");
            System.out.println("Press 0 for Basics");
            System.out.println("Press 1 for Intermediate");
            System.out.println("Press 2 for Advanced");
            int klevel = sc.nextInt();

            if (klevel == 0) {
                b.introduction();
                System.out.println("Next: Basics? Press 1 to continue or 0 to stop:");
                int t1 = sc.nextInt();
                if (t1 == 1) {
                    b.basics();
                    System.out.println("Next: Test? Press 1 to continue or 0 to stop:");
                    int t2 = sc.nextInt();
                    if (t2 == 1) {
                        b.test();
                    }
                }
            } else if (klevel == 1) {
                m.topic();
                System.out.println("Next: Test? Press 1 to continue or 0 to stop:");
                int t3 = sc.nextInt();
                if (t3 == 1) {
                    m.test();
                }
            } else if (klevel == 2) {
                a.topic();
                System.out.println("Next: Test? Press 1 to continue or 0 to stop:");
                int t4 = sc.nextInt();
                if (t4 == 1) {
                    a.test();
                }
            } else {
                System.out.println("Invalid level input.");
            }
        } else {
            System.out.println("Incorrect password.");
        }

        sc.close();
    }
}
Main.java
Displaying Main.java.
