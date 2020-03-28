package com.interv;

public class NumberReverse {
public static void main(String[] args) {
	int n = 189012;
	int i=0, rev =0;
	int dup=n;
	
	while (dup>0) {
		i=dup%10;
		rev=(rev*10)+i;
		dup=dup/10;
		}
	System.out.println(rev);
}
}
