package com.sesung.array;

import java.util.Scanner;

public class ArrayTest_02 {

	public static void main(String[] args) {
		//숫자를 입력해서 숫자만큼 배열을 만들 수 있도록.
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요.");
		int count = sc.nextInt();
		int [] ar= new int[count];
		
		//배열 생성시, 이미 데이터가 있는 경우
		int []ars= {10,20,30};
		System.out.println("검색할 번호를 입력하세요.");
		count = sc.nextInt();
		//1입려가면 ar2에서 20번 출력, 0입력하면 10, 2입력하면 30
		System.out.println(ars[count]);
		
		//length - 자기 배열의 크기(칸수) or 사이즈
		System.out.println(ar.length);
		

	}

}
