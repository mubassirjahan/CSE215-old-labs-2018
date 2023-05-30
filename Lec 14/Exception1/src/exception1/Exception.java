package exception1;


public class Exception {
 
    int x=10;
    int y=0;
    
    try{
    int z=x/y;
}
                
 catch(ArithmaticException f) {

   System.out.println("Exception thrown = "+f);
}   
    
    
}
