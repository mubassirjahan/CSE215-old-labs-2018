package student;


public class Student {
   
    private String name;
    private int id;
    
    
       String getName(){
    
           return name;
       }
    
       void setName(String name){
           this.name=name;
       }
       
       public static void main(String[] args) {
        
        Student s = new Student();   
            
        System.out.println(s.getName());
       
         s.setName("Mad Max");
         System.out.println(s.getName());
       
       
       
       
       
       }
    
}
