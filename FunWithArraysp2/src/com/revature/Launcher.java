package com.revature;

import java.lang.Math;


public class Launcher {
	public static void main(String [] args) 
	{
		int limit = (int)(Math.random()*100);
		int[] arr = new int[limit];
		System.out.println(limit);
		System.out.println("=====================");
		for (int i=0; i < arr.length; i++) {
			int rand = (int)(Math.random()*100);
			arr[i] = rand;
		}
			for (int i=0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
	}

}