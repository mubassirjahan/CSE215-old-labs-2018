
package instrument;


 class Wind implements instrument {
    
   
    @Override
    public void play(){
    
    System.out.println("Warface");
            
    } 
    
    @Override
    public String what(){
    
        String s = "adib";
        
        System.out.println("Warface");
        
        return s;
    }
    
    @Override
    public void adjust(){
        
     System.out.println("Play");
    }
    
}
