
package instrument;


public class Test {

   
    public static void main(String[] args) {
        
        Brass b = new Brass();
        Wind w = new Woodwind();
        Stringd s = new Stringd() {};
        
        b.adjust();
        b.play();
        
        w.adjust();
        w.what();
        w.play();
        
        s.adjust();
        s.play();
        s.what();
    }
    
}
