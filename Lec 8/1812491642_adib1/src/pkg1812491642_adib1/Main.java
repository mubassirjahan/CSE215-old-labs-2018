package pkg1812491642_adib1;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
           
        Scanner input = new Scanner(System.in);
        
        
        
        int a[][]=new int [3][5];
        
        for(int i=0; i<3; i++)
        {
        for(int j=0; j<5; j++){
            
          if((i==j) || (i+j)==4)
              System.out.print("v");
            else
              System.out.print(" ");
        }
       
        
       System.out.println("");
        }
    
        
        
        
        
        
}
}