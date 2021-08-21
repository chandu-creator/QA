package Inheritance;

public class ThisClass {
    // instance variable 
    int a = 10; 
  
    // static variable 
    static int b = 20; 
    
    void GFG() 
    { 
        // referring current class(i.e, class ThisClass)  
        // instance variable(i.e, a) 
        this.a = 100; 
  
        System.out.println(a); 
  
        // referring current class(i.e, class ThisClass)  
        // static variable(i.e, b) 
        this.b = 600; 
  
        System.out.println(b); 
  
        // referring current class(i.e, class ThisClass)  
        // instance variable(i.e, a) again 
        this.a = 9000; 
  
        System.out.println(a); 
    } 
  
    void KGF() {
    	String C ="chandu";
    System.out.println(C);
    }
    void KFC() {
    	this.a=20;
    	this.KGF();
    	System.out.println(a);
    	
    
    	
    }
    
    public static void main(String[] args) 
    { 
  
        new ThisClass().GFG();
        ThisClass obj = new ThisClass();
        obj.KFC();
        
    } 
} 
