package exception1;

 class MyException extends Exception {
   
    int a;
    
    MyException(int b){
    a=b;
    }
    
    public String toString(){
    
    return ("Exception Number = "+a);
    }
    
}
