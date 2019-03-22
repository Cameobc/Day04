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
		int [] numbers = null; // 학생번호저장  선언부
		String [] names = null; //학생이름저장
		int [] kors = null; // 국어점수
		int [] math = null;//수학점수
		int [] eng = null;//영어점수

		while(true) {
			System.out.println("1.학생등록");
			System.out.println("2.전체정보 조회");
			System.out.println("3.학생정보 검색");
			System.out.println("4.프로그램 종료");
			int select = sc.nextInt();
			
			
			if(select==1) {
				System.out.println("학생 수를 입력하세요.");
				int count = sc.nextInt();
				
				names= new String [count];   //배열 생성 길이가 count인 배열을 생성한 것이다.  생성부
				numbers = new int[count];
				kors = new int[count];
				math = new int[count];
				eng = new int[count];
				
				
				for(int i=0;i<names.length;i++) {
					System.out.println(i+1+"학생 번호를 입력하세요.");
					numbers[i] = sc.nextInt();
					
					System.out.println("학생의 이름을 입력하세요.");
					names[i]=sc.next(); 
			
					System.out.println("학생의 국어 점수를 입력하세요.");
					kors[i] = sc.nextInt();
			
					System.out.println("학생의 영어 점수를 입력하세요.");
					eng[i]=sc.nextInt();
		
					System.out.println("학생의 수학 점수를 입력하세요.");					
					eng[i]=sc.nextInt();
			}//for end



		}if(select==2) {
			for(int i=0;i<names.length;i++) {
			System.out.println("학생 번호 : "+numbers[i]+" 학생 이름 : "+names[i]+" 국어 점수 : "+kors[i]+" 영어 점수 : "+eng[i]+" 수학 점수 :"+math[i]);
			}
			
		}if(select==3) {
			for(int i=0;i<names.length;i++) {
				System.out.println("검색할 학생의 번호를 입력하세요.");
				for(int j=0;j<names.length;j++) {
					numbers[j] = sc.nextInt();
					System.out.println("학생 번호 : "+numbers[j]+" 학생 이름 : "+names[j]+" 국어 점수 : "+kors[j]+" 영어 점수 : "+eng[j]+" 수학 점수 :"+math[j]);
				}				
				break;
				
			}
			
		}if(select==4) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}

	}//while end
}

}
