package Complex;


public class Complex{
   double a, b;
	
   Complex(double a, double b){
	this.a = a;
	this.b = b;
   }
	
   public static Complex sum(Complex c1, Complex c2)
   {
        Complex temp = new Complex(0,0);

        temp.a = c1.a + c2.a;
        temp.b = c1.b + c2.b;
        
       
        return temp;
    }

}
 
        
        
        
        
        
    
    

