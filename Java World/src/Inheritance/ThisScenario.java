package Inheritance;

public class ThisScenario {

	int first = 22; 
    int second = 33; 
  
    void garcia(int a, int b) 
    { 
        a = this.first; 
        b = this.second; 
        System.out.println(first); 
        System.out.println(second); 
        System.out.println(a); 
        System.out.println(b); 
    } 
  
    void louis(int m, int n) 
    { 
        this.first = m; 
        this.second = n; 
        System.out.println(first); 
        System.out.println(second); 
        System.out.println(m); 
        System.out.println(n); 
    } 
  
    public static void main(String[] args) 
    { 
        new ThisScenario().garcia(100, 200); 
        new ThisScenario().louis(1, 2); 
    } 
} 
