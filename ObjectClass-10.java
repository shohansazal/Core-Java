package com.shohan;

public class ObjectClass {
    //Object :
//    ----------------
    //--It can be physical or logical (tangible and intangible).
    //--Object is an entity which has state and behavior.
    //--Object is an instance of a class.

//    An object has three characteristics :
    //state  : represents data (value) of an object.
    //behavior  : represents the behavior (functionality) of an object such as deposit, withdraw etc.
    //identity  : Object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. But, it is used internally by the JVM to identify each object uniquely.

//    For Example:
//    --------------------
//    Pen is an object. Its name is Reynolds, color is white etc. known as its state. It is used to write, so writing is its behavior.
    
    //Class :
//    ---------------
    //A class is a group of objects which have common properties.
//    A class in Java can contain:
//    ---------------------------------------
    //fields
    //methods
    //constructors
    //blocks
    //nested class and interface
    /* 
    class <class_name>{  
        field;  
        method; }
     */
    
//    Method :
//    ------------------
    //In java, a method is like function i.e. used to expose behavior of an object.
//    Advantage of Method :
    //--Code Reusability
    //--Code Optimization
    
//new keyword :
//    ---------------------
    //The new keyword is used to allocate memory at run time
    
//    Object and Class Example: main within class :
//    ------------------------------------------------------------
        /*
            class Student{  
         int id;//field or data member or instance variable  
         String name;  

         public static void main(String args[]){  
          Student s1=new Student();//creating an object of Student  
          System.out.println(s1.id);//accessing member through reference variable  
          System.out.println(s1.name);  }  }  
         */
    
//3 Ways to initialize object :
//---------------------------------
        //By reference variable
        //By method
        //By constructor
}
