package task.pkg3;


public class Task3 {

  
   
    public static void main(String[] args) {
        
        String s = "James Bond 007";
        
        System.out.println("charAt() : "+ s.charAt(3));
        System.out.println("charlength() : "+ s.length()); 
        
        String sf = String.format("My name is %s",s);
        
        System.out.println("String.format() : " + sf);
        
        sf = String.format("Temperature is %.2f :", 4332.366666);
        
        System.out.println(sf);
    
        System.out.println("substring() : "+ s.substring(3,5));  
    
        System.out.println("contains() : "+ s.contains("007"));
    
        System.out.println("isEmpty() : "+ s.isEmpty());
    
        System.out.println("replace() : "+ s.replace("James","Donald"));
     
        System.out.println("toLowercase() : " + s.toLowerCase()); 
        
        System.out.println("toUppercase() : " + s.toUpperCase());
     
        System.out.println("indexof() : " + s.indexOf('J'));
    
        System.out.println("trim() : " + s.trim());
    
        int age = 25;
        System.out.println("String.valueOf() : " + String.valueOf(age));
        
        String str = "Mad Max";
        char[] ch = str.toCharArray();
        
        for(int i=0; i<ch.length; i++ )
        {
        
           System.out.println(ch[i]);
            
        }
    
    
    
    
    }
    
}
