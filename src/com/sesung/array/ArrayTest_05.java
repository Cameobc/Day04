package com.sesung.array;

import java.util.Scanner;

public class ArrayTest_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생수 입력하세요.	3
		//입력한 수만큼 학생의 이름을 입력하세요.
		//내가 입력한 학생수만큼 이름이 출력
		System.out.println("학생 수를 입력하세요.");
		int count = sc.nextInt();
		String []names = new String[count];
		
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+"  번째 이름 입력");
			names[i]=sc.next();		
		}
		//학생수만큼 국어 점수를 입력
		//iu학생의 국어 점수 입력
		//suzy학생의 국어점수 입력
		//iu : 점수   suzy : 점수

		int []score = new int[names.length];
		
		for(int i=0;i<score.length;i++) {
			System.out.println(names[i]+"학생의 국어점수 입력");
			score[i]=sc.nextInt();
		}
		//학생수만큼 수학 점수를 입력
		//최종 출력문 국어점수 반평균, 수학점수 반평균.
		
		int[]math = new int[names.length];
		for(int i=0;i<math.length;i++) {
			System.out.println(names[i]+"학생의 수학 점수 입력");
			math[i]=sc.nextInt();
		}
		
		int kTotal=0;
		int mTotal=0;
		for(int i=0;i<names.length;i++) {
			kTotal=kTotal+score[i];
			mTotal=mTotal+math[i];			
		}
		
		System.out.println("국어 반평균 : "+kTotal/names.length);
		System.out.println("수학 반평균 : "+mTotal/names.length);
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"의 국어 점수"+score[i]+"점   수학 점수"+math[i]+"점");
			
		}
	}

}
