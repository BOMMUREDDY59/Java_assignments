package Corejava;

 
	

	import java.util.*;

	public class Question5 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 HashSet<String> set=new HashSet<String>();  
			  set.add("vijaya");
			  set.add("bommu");  
			  set.add("seshu");  
			  set.add("sravani");
			  set.add("amulya");
			  set.add("sushmitha");
			  set.add("pranavi");
			  set.add("varalaxmi");
			  set.add("sudhakar");
			  set.add("karthik");
			  
			  //Traversing elements  
			  Iterator<String> itr=set.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  }  
			 }  
			 

		}



