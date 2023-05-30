
package student.pkg1;


public class Student1 {

    private String name;
    private int id;
    
    
       String getName(){
    
           return name;
       }
    
       void setName(String name){
           this.name=name;
       }
       
       int getId(){
           return id;
       }
       
       void setId(int id){
       
           this.id=id;
       
       }
       
    public static void main(String[] args) {
      
         Student1 s = new Student1();   
            
        System.out.println(s.getName());
       
         s.setName("Mad Max");
         System.out.println(s.getName());
        
         System.out.println(s.getId());
          s.setId(20);
         System.out.println(s.getId());

         
    }
    
}
