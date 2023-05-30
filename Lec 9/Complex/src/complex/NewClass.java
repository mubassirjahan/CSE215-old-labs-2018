
package complex;


public class NewClass {
    
     public static void main(String[] args) {
        
       Complex.Complex c1 = new Complex.Complex( 5.5, 4.5);
	Complex.Complex c2 = new Complex.Complex(1, 3);
        Complex.Complex temp = sum(c1, c2);
         System.out.printf("Sum is: "+ temp.a+" + "+ temp.b +"i");
  
        
        
        
        
        
        
    }
    

}
