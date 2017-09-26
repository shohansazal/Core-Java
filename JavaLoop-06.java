package com.shohan;

public class JavaLoop {
//Java For Loop:
//    Three types of for loop in java-:

// Simple For Loop
//---------------------
    /*
    for(initialization;condition;incr/decr){  
            //code to be executed  }  
     */
//    -----------------------------------------------------
    /*  
    public class ForExample {  
public static void main(String[] args) {  
  for(int i=1;i<=10;i++){  
     System.out.println(i);  
 }  }  }  
     */
//For-each or Enhanced For Loop
//--------------------------------------
    /*
    for(Type var:array){  
//code to be executed }  
     */
//-----------------------------------
    /*
    public class ForEachExample {  
public static void main(String[] args) {  
    int arr[]={12,23,44,56,78};  
    for(int i:arr){  
        System.out.println(i);  
    }  }  } 
     */
//Labeled For Loop
//------------------------
    /*
    labelname:  
for(initialization;condition;incr/decr){  
//code to be executed  } 
     */
//-------------------------------------------
    /*
    public class LabeledForExample {  
public static void main(String[] args) {  
    aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break aa;  
                    }  
                    System.out.println(i+" "+j);  
                }   }  }  }
     */
//-----------------------------------------------
    /*
    public class LabeledForExample {  
public static void main(String[] args) {  
    aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break bb;  
                    }  
                    System.out.println(i+" "+j);  
                }  }  }  }
     */
    
    //Infinitive For Loop
//    -------------------------------
    /*
    for(;;){  
//code to be executed  }
     */
//    --------------------------------------
    /*
    public class ForExample {  
public static void main(String[] args) {  
    for(;;){  
        System.out.println("infinitive loop");  
    }  }  }  
*/
    
    
//    While Loop:
//    -------------------
    /*
   while(condition){  
//code to be executed  
}  
    */
//    ---------------------------
    /*
    public class WhileExample {  
public static void main(String[] args) {  
    int i=1;  
    while(i<=10){  
        System.out.println(i);  
    i++;  
    }  }  } 
*/
    
//    do-while Loop:
//    --------------------
    /*
    do{  
//code to be executed  
}while(condition);  
*/
//    -------------------------
    /*
    public class DoWhileExample {  
public static void main(String[] args) {  
    int i=1;  
    do{  
        System.out.println(i);  
    i++;  
    }while(i<=10);  
}  }  
    */
}
