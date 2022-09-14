package com.genericMethods;

import java.util.*;

public class Generic {

	public static <T extends Comparable<T>> T Maximum(T x,T y,T z)
	{
		T Max = x;
		if(y.compareTo(Max) > 0)
			Max = y;
		if(z.compareTo(Max) > 0)
			Max = z;
		return Max;
	}
	
	public static <T> void main(String[] args)
	{
		Generic a = new Generic();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Three Numbers to Compare : ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		System.out.println("Enter any Three Float Numbers to Compare : ");
		float f1 = scan.nextFloat();
		float f2 = scan.nextFloat();
		float f3 = scan.nextFloat();
		
		System.out.println("Enter any Three String to Compare : ");
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();
		
		System.out.printf("Maximum number of %d, %d & %d is so Max is :%d\n\n", x,y,z, Maximum(x,y,z));
		System.out.printf("Maximum Float of %.1f, %.1f & %.1f is %.1f\n\n", x,y,z, Maximum(x,y,z));
		System.out.printf("Maximum String %s, %s & %s is %s\n", s1,s2,s3, Maximum(s1,s2,s3));
	}
}
