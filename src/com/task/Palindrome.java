package com.task;



public class Palindrome {
	
	public static void main(String[] args) {
		
		
		int num =363;
		int reverse=0;
		int temp=num;
		while(num>0) {
			
			reverse=(reverse*10)+num%10;
			num=num/10;
			
		}
		if(temp==reverse) {
			System.out.println("is Palindrome");
		}else {
			System.out.println("is not palindrome");
		}
		
//		 int sum=0,temp;    
//		  int n=454;//It is the number variable to be checked for palindrome  
//		  
//		  temp=n;    
//		  while(n>0){    
//		    //getting remainder  
//		   sum=(sum*10)+n%10;    
//		   n=n/10;    
//		  }    
//		  if(temp==sum)    
//		   System.out.println("palindrome number ");    
//		  else {   
//		   System.out.println("not palindrome");    
//		}  
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
