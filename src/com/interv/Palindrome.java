package com.interv;

public class Palindrome {
	public static void main(String[] args) {
		int n = 12321;
		int i=0, rev =0;
		int dup=n;
		
		while (dup>0) {
			i=dup%10;
			rev=(rev*10)+i;
			dup=dup/10;
			}
		if(n==rev){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
	
}
