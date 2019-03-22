package com.sesung.array2;

import java.util.Arrays;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class Array2_test03 {

	public static void main(String[] args) {
		int [] points = {3,5,1,9,2};
		int temp =0;

//		for(int i =0;i<points.length;i++) {
//			for(int j=i+1;j<points.length;j++) {
//				if(points[i]>points[j]) {
//					temp=points[j];
//					points[j]=points[i];
//					points[i]=temp;
//				}
//			}
//		}
//		
		Arrays.sort(points);
		for(int i =0;i<points.length;i++) {
			System.out.println(points[i]);
		}

	}

}
