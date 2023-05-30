
package method_dispatch;


public class Method_dispatch {

    
    
    public static void main(String[] args) {
      
        Child s = new Child();
        s.show();
        s.display();
        
        Parent c = new Child();
       
        c.show();
    }
    

}