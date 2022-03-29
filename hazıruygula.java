package stack;


import java.util.Stack;

public class hazýruygula {

	public static void main(String[] args) {
		
		
	Stack<Character> hazir=new Stack<>();
  String ifade="()[";
 
	  
  
  for(int i=0;i<ifade.length();i++)
  {
	  char c= ifade.charAt(i);
			  
	  if(c=='(' || c=='[' ) {
		System.out.println("==" +hazir.push(c));  
		  
	  }
	
		
	   if(c==')' || c==']')  {
		   if(hazir.empty()) {
			  System.out.println("false");
			  break;
		   }
		  
		   
		    char last=hazir.peek();
		    System.out.println("*** " +last);
		if(c==')' && last=='('|| c==']' && last=='[')
		System.out.println( hazir.pop()); 
		else {
			System.out.println("false5");
			break;
		}
		   
		  
	   }
	 
  }
  
  if(hazir.empty()) {
	  System.out.println("true");
  }else
	  System.out.println("falsen");
  
  }
  
	}
	

	


