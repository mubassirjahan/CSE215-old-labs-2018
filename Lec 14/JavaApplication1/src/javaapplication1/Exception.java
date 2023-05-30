package javaapplication1;
import java.io.*;

public class Exception {

   
    public static void main(String[] args) {
      
        int b=10;
        int c=0;
     
        try {
     
    int a[] = new int[2];
    
    
    System.out.println("Access element three = " +a[3]);
        }
    
     catch(ArrayIndexOutOfBoundsException e){
     
     System.out.println("Exception thrown = "+e);
     }
    
     try{
     int d=b/c;
     }
     catch(ArithmeticException f){
    
     System.out.println("Exception thrown = "+f);
    }
        
     finally{
        
        System.out.println(" No solution");
        }
     
     System.out.println(" Out of block ");
     
     
     
    }
    
}
