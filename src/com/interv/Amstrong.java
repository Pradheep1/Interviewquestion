package com.interv;

public class Amstrong {
	public static void main(String[] args) {
		int n = 371;
		int i=0, rev =0;
		int dup=n;
		
		while (dup>0) {
			i=dup%10;
			rev=(i*i*i)+rev;
			dup=dup/10;
			}
		if(n==rev){
			System.out.println("Amstrong");
		}
		else{
			System.out.println("Not Amstrong");
		}
	}
}
