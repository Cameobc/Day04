package com.sesung.array;

import java.util.Scanner;

public class ArrayTest_06 {

	public static void main(String[] args) {
		//1.학생등록
		// 학생수를 입력
			//학생 수 만큼
		// 학생번호를 입력하세요
		// 학생의 이름을 입력하세요.
		// 학생의 국어 점수
		// 학생의 수학 점수
		// 학생의 영어 점수
	//2.전체정보 조회
		// 번호, 이름, 국어, 수학, 영어
	//3.학생정보 검색
		//검색할 학생의 번호를 입력
		//그 학생의 정보만 출력
	//4.프로그램 종료
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.학생등록");
			System.out.println("2.전체정보 조회");
			System.out.println("3.학생정보 검색");
			System.out.println("4.프로그램 종료");
			int select = sc.nextInt();
			if(select==1) {
				System.out.println("학생 수를 입력하세요.");
				int count = sc.nextInt();
				
				
				
			}//if select 1

		}//while end
	}

}
