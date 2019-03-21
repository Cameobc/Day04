package com.sesung.array;

import java.util.Scanner;

public class ArrayTest_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {10,32,15,27,46,52};
		

		//인덱스 입력 받아서 해당 이덱스번호의 값을 출력
		//다른 번호를 입력하면 없는 번호입니다를 출력
		
		System.out.println("번호를 입력해주세요.");
		int index = sc.nextInt();
		if(index>ar.length || index<0) {
			System.out.println("없는 번호 입니다.");
		}else {
			System.out.println(ar[index]);
		}
		
		
	}

}
