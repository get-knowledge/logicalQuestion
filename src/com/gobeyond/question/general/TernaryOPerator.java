package com.gobeyond.question.general;

//ternary operator to avoid NullPointerException. 
public class TernaryOPerator {

	public static void main(String[] args) {
		
		// Initializing String variable with null value
		String str = null;
		String message = (str == null) ? "" : str.substring(0, 5);
		System.out.println(message);

		// Initializing String variable with null value
		str = "Geeksforgeeks";
		message = (str == null) ? "" : str.substring(0, 5);
		System.out.println(message);
		
		
		// null can be assigned to String
	    String str1 = null; 
	    
	    // you can assign null to Integer also
	    Integer itr = null; 
	    
	    // null can also be assigned to Double
	    Double dbl = null; 
	        
	    // null can be type cast to String
	    String myStr = (String) null; 
	    
	    // it can also be type casted to Integer
	    Integer myItr = (Integer) null; 
	    
	    // yes it's possible, no error
	    Double myDbl = (Double) null; 

	    
	    TernaryOPerator obj= null; 
        obj.staticMethod(); 
        obj.nonStaticMethod();  
	    
	}

	
	 private static void staticMethod() 
	    { 
	        //Can be called by null reference 
	        System.out.println("static method, can be called by null reference"); 
	          
	    } 
	          
	    private void nonStaticMethod() 
	    { 
	        //Can not be called by null reference 
	        System.out.print(" Non-static method- "); 
	        System.out.println("cannot be called by null reference"); 
	          
	    } 
}
