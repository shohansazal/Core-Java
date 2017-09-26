package com.shohan;

public class Constructor {
//    Constructor :
//    -------------------------
        //--Constructor is a special type of method that is used to initialize the object.
        //--Java constructor is invoked at the time of object creation.
  
//Rules for creating java constructor :
//    -----------------------------------------------
        //--Constructor name must be same as its class name
        //-- Constructor must have no explicit return type
    
//Types of constructors :
//    -----------------------------
        //--Default constructor (no-arg constructor)
        //--Parameterized constructor
    
    //Default constructor :
//    ------------------------------
        //--A constructor that have no parameter is known as default constructor.
        //--<class_name>(){}  
    
//----------------Rule: If there is no constructor in a class, compiler automatically creates a default constructor.

//purpose of default constructor :
//    -----------------------------------------
        //--Default constructor provides the default values to the object like 0, null etc. depending on the type.
    
//parameterized constructor :
//    -----------------------------------
        //--A constructor that have parameters is known as parameterized constructor.
    
//purpose of parameterized constructor :
//    -----------------------------------------
        //--Parameterized constructor is used to provide different values to the distinct objects..
    
    /*
    class Student4{  
    int id;  
    String name;  
      
    Student4(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student4 s1 = new Student4(111,"Karan");  
    Student4 s2 = new Student4(222,"Aryan");  
    s1.display();  
    s2.display();  
   }  }  
    */
}
