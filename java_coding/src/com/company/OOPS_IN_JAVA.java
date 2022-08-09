package com.company;

import java.util.Random;
import java.util.Scanner;

class Employee1{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and My Name is " + name);
    }
}

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

class cellphone{

    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void call(){
        System.out.println("calling papa...");
    }
}

class square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
}

class  TommyVecetti{

    public void hit(){
        System.out.println("hitting to enemy");
    }
    public void run(){
        System.out.println("running away from enemy");
    }
    public void fire(){
        System.out.println("firing on enemy");
    }
}

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}

class cylinder {
    public int radius;
    public int height;
    // using constructor
    public cylinder(int height , int radius) {
        this.height = height;
        this.radius = radius;
    }
   // using getters and setters
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2 * 3.14 * radius  * height + 2 * 3.14 * radius * radius ;
    }
    public double volume(){
         return  3.14 * radius * radius * height;
    }
}

class rectangle{
    private int length;
    private int breadth;

    public rectangle(int length , int  breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public rectangle(){
        this.length = 4;
        this.breadth = 5;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

//inheritance
class BASE{
    int a;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        System.out.println("setting the vlaue of a in base class ");
        this.a = a;
    }
}
class DERIVED extends BASE{
    int b;
    public int getB() {
        return b;
    }
    public void setB(int b) {
        System.out.println("setting the vlaue of b in derived class ");
        this.b = b;
    }
}


//constructor nd overloded constructor with inheritance.
class base{
    int a;
    base(){
        System.out.println("i am a constructor of base class");
    }
    base(int x){
        System.out.println("i am an overloded constructor of base class with the value: " + x);
    }
}
class derived extends base{
     derived(){
         System.out.println("i am a constructor of derived class: ");
     }
    derived(int x , int y){
         super(x);
        System.out.println("i am an overloded constructor of derived class with the value: " + y);
    }
}
class childofderived extends derived{
      childofderived(){
          System.out.println("i am a constructor of child of derived class ");
      }
    childofderived(int x, int y, int z){
          super(x,y);
        System.out.println("i am an overloded constructor of child of derived class with the value: " + z);
    }
}

//METHOD OVERRIDING
class A{
    public int a;
    public int meth(){
        return 5;
    }
    public void meth2(){
        System.out.println("i am method 2 in class A");
    }
}
class B extends A{
    @Override //here we override the meth2 and this @ is only a indication of overriding.
    public void meth2(){
        System.out.println("i am method 2 in class B");
    }
    public void meth3(){
        System.out.println("i am method 3 in class B");
    }
}

//DYNAMIC METHOD DISPATCH
class phone{
    void showTime(){
        System.out.println("time is 8 am.");
    }
    void on(){
        System.out.println("Turning on phone...");
    }
}
class smartPhone extends phone{
    void music(){
        System.out.println("Playing music...");
    }
    void on(){
        System.out.println("Turning on Smart Phone...");
    }
}

//ONLINE LIBRARY
class library{

     String[]  books;
     int no_of_books;
    library(){
        this.books = new String[100];
        this.no_of_books=0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }
    void showAvailableBook(){
        System.out.println("Available books are :");
        for (String book: this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }

}


class circle{
   public int radius;
    circle(){
        System.out.println("i am non parameterized constructor ");
    }
    circle(int r ){
        System.out.println("i am parameterized constructor ");
        this.radius=r;
    }
   public double area(){
       return Math.PI * this.radius * this.radius ;
   }
}
class Cylinder extends circle{
    public int height;
    Cylinder(int r , int h){
        super(r); // if we didnt use these then defualt constructor will run.
        System.out.println("i am parameterized constructor of cylinder");
        this.height = h;
    }
    public double volume(){
        return Math.PI * this.radius * this.radius * height;
    }

}



public class OOPS_IN_JAVA {
    public static void main(String[] args) {
        // first custom
        /*
    System.out.println("These is our first custom class :");
    Employee1 pavan = new Employee1();   // Instantiating a new object
    Employee1 pp = new Employee1();   // Instantiating a new object

   //Setting the attributes.
    pavan.id = 21;
    pavan.name  = "pavan_Pabitwar";
    pp.id = 63;
    pp.name = "pavan";
    //Printing the attributes.
    pavan.printDetails();
    pp.printDetails();
    //System.out.println(pavan.id);
    //System.out.println(pavan.name);
    }
}
        //Q1) Create a class Employee with following properties and methods:
       /*
        Employee pavan = new Employee();

        pavan.setName("pavan");
        pavan.salary = 40;
        System.out.println(pavan.getSalary());
        System.out.println(pavan.getName());

        */

        //Q2) Create a class cellphone with methods to print "ringing..."  , "vibrating..." etc.
       /*
        cellphone realme = new cellphone();
        realme.ring();
        realme.vibrate();
        realme.call();
       */

        //Q3) create a class square with a method to intializing its side , calculating area , perimeter. etc
       /*
     square sq = new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
      */

        //Q5) create a class TommyVecetti for Rockstar Games capable of hitting(print hitting...) , firing etc.
        /*
        TommyVecetti player = new TommyVecetti();
        player.hit();
        player.run();
        player.fire();
         */


        //Q) Create a class Game, which allows a user to play "Guess the Number"
        //   game once. Game should have the following methods:
         /*
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
            code :-
                Game g = new Game();
                boolean b= false;
                while(!b){
                    g.takeUserInput();
                    b = g.isCorrectNumber();
                }
         */

 // Practice set for access modifier and constructor

        // Q1) Create a class cylinder and use getters and setters to set its radius aGGGGGGGnd height.    Q2) using constructor   Q3) also find the volume nd surface area.
         /*
      cylinder mycylinder = new cylinder(10,20);

       // mycylinder.setRadius(20);
       // mycylinder.setHeight(10);

        System.out.println(mycylinder.getHeight());
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
    */

        //Q4) overload a constructor used to intialize a rectangle of length 4 and breadth 5 for using custom parameter.
         /*
       rectangle rec = new rectangle(40,50);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
        */


// INHERITANCE
         /*
       BASE B = new BASE();
       B.setA(40);
       System.out.println(B.getA());

        DERIVED D = new DERIVED();
        D.setB(30);
        System.out.println(D.getB());
        D.setA(40);
        System.out.println(D.getA());
       */

// CONSTRUCTOR AND OVERLODED CONSTRUCTOR WITH INHERITANCE.
        /*
      //  base b = new base();
      //  base b = new base(1);
      //  derived d = new derived();
      //  derived d = new derived(1,2);
      //  childofderived cd = new childofderived();
        childofderived cd = new childofderived(4,5,6);
       */

//METHOD OVERRIDING
        /*
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
         */

//DYNAMIC METHOD DISPATCH
        /*
       // smartPhone phn = new smartPhone(); // allowed
       // smartPhone phn = new phone(); // not allowed
       // phn.music();

        phone ph = new smartPhone(); // allowed
        ph.on();
        ph.showTime();
      // ph.music(); // not allowed
         */

// Q) CREATE A ONLINE LIBRARY
        /*
        // You have to create a library using java class "library"
        // Methods: addBook , issueBook , returnBook , showAvailableBook .
        //Properties: Array to store the available Books.
        // Array to store the issued book

        library centralLibrary = new library();
        centralLibrary.addBook("c++");
        centralLibrary.addBook("java");
        centralLibrary.addBook("python");
        centralLibrary.showAvailableBook();

        centralLibrary.issueBook("c++");
        centralLibrary.showAvailableBook();

        centralLibrary.returnBook("c++");
        centralLibrary.showAvailableBook();
         */

// Practice set for inheritance.
     // Q1) create a class circle and use inhertance to write another class cylinder from it.
       /*
        // circle cyc = new circle(4);
        Cylinder cy = new Cylinder(8 , 4);
       // System.out.println(cy.area());
      //  System.out.println(cy.volume());
        */


    }
}

