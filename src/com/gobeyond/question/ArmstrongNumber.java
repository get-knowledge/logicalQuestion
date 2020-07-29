package com.gobeyond.question;

public class ArmstrongNumber {
	
	
	public static void checkArmstrong(int num) {
		
		int sum=0;
		int rem;
		int temp = num;
		
		while(num>0) {
			
			rem = num%10;
			 sum = sum +(rem*rem*rem);
			 
			 num = num/10;
			
		}
		if(sum == temp) {
			
			System.out.println("Number is Armstrong Number :::"+sum);
			
		}else {
			System.out.println("Number is Not Armstrong Number :::"+sum);
		}
		
		
	}

	
	public static void main(String a[]) {
		
		checkArmstrong(151);
		
		
	}
	
}
