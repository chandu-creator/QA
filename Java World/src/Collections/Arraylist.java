package Collections;

import java.util.*;

public class Arraylist {
	public static void main(String args[]){  

		  ArrayList<String> list=new ArrayList<String>();   //Creating arraylist  

		  list.add("Pune");//Adding object in arraylist  
		  list.add("Mumbai");  
		  list.add("Nagpur");  
		  list.add("Kolhapur");

		  //Remove
		  list.remove(2);

		  //To reset value 
		  list.set(2, "Bangalore");

		  //To get the Index of an Item
		  System.out.println(list.indexOf("Pune")); 

		  ArrayList<String> list_1=new ArrayList<String>();   //Creating arraylist 

		  list_1.add("Chennai");      //Adding object in arraylist  
		  list_1.add("Jaipur");  

		  //Example of addAll()
		  list.addAll(list_1);

		  //Example of removeAll()
		  list.removeAll(list_1);                                               

		  //Traversing list through Iterator  
		  Iterator<String> itr=list.iterator();  

		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  //Traversing through for-each Iterator
		  for(String obj:list)  
		     System.out.println(obj);  
		  }  

}
