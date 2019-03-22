package com.sesung.array2;

import java.util.Scanner;

public class Array2_test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//총 심판 5명
		//점수  = int
		//평균을 구하는데,최고점과 최저점은 제외한다.
		int [] points = new int [5];
		for(int i=0;i<points.length;i++) {
			System.out.println(1+i+" 번 점수 입력");
			points[i]=sc.nextInt();
		}//for end
		//평균. 최저점과 최대점을 제외한 평균
		int mini=points[0];
		int max=points[0];		
		int pTotal=0;		

		for(int i =1;i<points.length;i++) {
			if(max<points[i]) {
				max=points[i];
			}//if
		}//for
		for(int i =1;i<points.length;i++) {
			if(mini>points[i]) {
				mini=points[i];
			}//if
		}//for
//
//			System.out.println(max);
//			System.out.println(mini);

		for(int i=0;i<points.length;i++) {
			pTotal=pTotal+points[i];

		}
		double avg = (double)(pTotal-mini-max)/(points.length-2);
		
		System.out.println("평균은 "+avg+" 점 입니다.");

	}

}
