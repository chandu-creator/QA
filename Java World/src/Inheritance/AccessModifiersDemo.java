package Inheritance;

import OopsConcepts.ReturnTypeDemo;

public class AccessModifiersDemo {
	
	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.increaseSpeed();
		c1.speed = 10;//No Access modifier
		c1.setPrivateSpeed(10);//Private can access in other class only with the help of setters and getters
		c1.publicSpeed = 100;//Anywhere in java world with importing the package and class
		c1.protectedSpeed = 100;
		c1.decreaseSpeed();
		
		ReturnTypeDemo obj=new ReturnTypeDemo();
		System.out.println(obj.exams(92));
		
	}

	

}
