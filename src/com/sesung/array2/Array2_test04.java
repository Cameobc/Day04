package com.sesung.array2;

import java.util.Arrays;

public class Array2_test04 {

	public static void main(String[] args) {
		//배열은 같은 데이터타입을 묶는다.
		int [] num1 = {1,2,3};  //a
		int [] num2 = {4,5,6};  //b
		int [][] nums = new int[2][3];   //이차원 배열  int[]을 담을 공간 2개를 만들겠다. int[]에 들어간 int[]이 3개짜리다.각 칸마다 int [] 타입을 넣을 수 있다.
		nums[0] = num1;
		nums[1] = num2;
		
		System.out.println(nums[0][1]);   //nums의 0번 인덱스의 1번을 출력함
		System.out.println(nums[1][0]);
		
		for(int i =0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.println(nums[i][j]);
			}
		}
		
		//{ {1,2,3}, {4,5,6} }
		
		
//		int a =10;
//		int b =20;
//		int [] ab = new int [2];
//		ab[0] = a;
//		ab[1] =b;
		
	}

}
