package com.sesung.array;

import java.util.Scanner;

public class ArrayTest_01 {

	public static void main(String[] args) {
//		배열 - 여러데이터의 묶음
//		하나의 변수로 여러개의 데이터를 다루고자 할 떄
//		같은 데이터 타입만 묶을 수가 있다.
//		배열 생성시 몇 개를 만들지 미리 생성
		//한 번 만들어진 배열의 크기는 수정이 불가.
		int a = 10;
		int b = 20;
	
		
//		배열 선언
//		모을 데이터 타입 변수명 [];
//		모을 데이터 타입 [] 변수명;
		
		//정수형데이터
		int [] ar = new int [3];  //new~ heap에 만든다
		System.out.println(ar);
		ar[0]='a';
		ar[1]=20; // 인덱스 번호를 사용
		ar[2]=(int)3.2;
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		//문자 5개를 담을 배열을 배열을 선언하고, 각각 문자를 입력하고 출력
		char [] ch =new char [5];  //ch 배열타입
		ch[0]='k'; //ch[0] =  primitive타입
		ch[1]='o';
		ch[2]='r';
		ch[3]='e';
		ch[4]='a';
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println(ch[4]);
		
		int [] num; //변수선언
		num = new int[3];
		System.out.println(num);
		System.out.println(num[0]);
		
		String name ="abc";  //name는 래퍼런스이며 스트링 타입	
		Scanner sc = new Scanner(System.in);  //sc 는 레퍼런스이며 스캐너 타입
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner [] scs = new Scanner[3];
		scs[0]=sc;
		scs[1]=sc2;
		scs[2]=sc3;
		
		

	}

}
