package com.sesung.array2;

import java.util.Scanner;

public class Array2_test_01 {

	public static void main(String[] args) {
		//데이터타입
		//primitive type 
		//int double char boolean long
		//reference type
		
		int a =10;
		Scanner sc = new Scanner(System.in);
		int [] ar = new int [3];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		
		int [] ar2 = new int[2];
		ar2[0]=1;
		ar2[1]=2;
		double b=2.0;
		//ar[0]=(int)b;
		//ar=ar2;
		System.out.println(ar[0]);
		ar[1]=200;
		System.out.println(ar2[1]);
		ar=new int [2];
		System.out.println(ar[0]);
	}

}
