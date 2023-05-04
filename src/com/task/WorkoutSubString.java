package com.task;

public class WorkoutSubString {

	public static void main(String[] args) {
		
		 String s = "suresh kumar";
	     String newstr = "";

	     String[] str = s.split(" "); // splitting sentence into word converted to String array

	    for (String string : str) {     
	      int length = string.length();
	      String firstchar = string.substring(0, 1);
	      
	      String restchar = string.substring(1, length - 1);
	      String lastchar = string.substring(length-1, length);
	      newstr = newstr+firstchar.toUpperCase()+restchar+lastchar.toUpperCase()+" ";
	    } 
	    System.out.println(newstr); 
		
		
		
	}

}
