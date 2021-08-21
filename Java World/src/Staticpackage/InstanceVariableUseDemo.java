package Staticpackage;

public class InstanceVariableUseDemo {

	int count=0;//will get memory each time when the instance is created  
	  
	InstanceVariableUseDemo(){  
	count++;//incrementing value  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	//Creating objects  
		InstanceVariableUseDemo c1=new InstanceVariableUseDemo();  
		InstanceVariableUseDemo c2=new InstanceVariableUseDemo();  
		InstanceVariableUseDemo c3=new InstanceVariableUseDemo();  
	}  
	}  