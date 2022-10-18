package com.company;
// import java.util.*; //Does not require any packages for inplimenting java generics
// we will define generic class here

class Gclass<T>{
    T data;
    // constructor
    public Gclass(T data){
        this.data=data;
    }
    // getData Methord
    public T getData(){
        return data;
    }

}
public class Generic_class {
    public static void main(String[] args) {
        // using generics class with 2 diffeenrt data type
        Gclass<String> strobj = new Gclass<String>("MY Name is pavan");
        Gclass<Integer> intobj = new Gclass<Integer>(801096304);
        //Printing the output
        System.out.println("hii!! " + strobj.getData());
        System.out.println("My phone number is " + intobj.getData()+"0");
    }
}
