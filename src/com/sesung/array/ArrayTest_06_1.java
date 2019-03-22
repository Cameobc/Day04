package com.sesung.array;

import java.util.Scanner;

public class ArrayTest_06_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numbers = null; // 학생번호저장  선언부
		String [] names = null; //학생이름저장
		int [] kors = null; // 국어점수
		int [] math = null;//수학점수
		int [] eng = null;//영어점수
		int [] totals = null; //총점

		while(true) {
			System.out.println("1.학  생  등  록");
			System.out.println("2.전체정보 조회");
			System.out.println("3.학생정보 검색");
			System.out.println("4.전체 총점순 출력");
			System.out.println("5.프로그램 종료");
			int select = sc.nextInt();

			if(select==1) {
				System.out.println("학생 수를 입력하세요.");
				int count = sc.nextInt();

				names= new String [count];   //배열 생성 길이가 count인 배열을 생성한 것이다.  생성부
				numbers = new int[count];
				kors = new int[count];
				math = new int[count];
				eng = new int[count];
				totals = new int [count];

				for(int i=0;i<names.length;i++) {    //i<count 라고 해도 된다.
					System.out.println(i+1+"학생 번호를 입력하세요.");
					numbers[i] = sc.nextInt();

					System.out.println("학생의 이름을 입력하세요.");
					names[i]=sc.next(); 

					System.out.println("학생의 국어 점수를 입력하세요.");
					kors[i] = sc.nextInt();

					System.out.println("학생의 영어 점수를 입력하세요.");
					eng[i]=sc.nextInt();

					System.out.println("학생의 수학 점수를 입력하세요.");					
					math[i]=sc.nextInt();								
					totals[i] = kors[i] +eng[i]+math[i];
				
				}//for end

			}else if(select==2) {
				for(int i=0;i<names.length;i++) {
					System.out.println("학생 번호 : "+numbers[i]);
					System.out.println(" 학생 이름 : "+names[i]);
					System.out.println(" 국어 점수 : "+kors[i]);
					System.out.println(" 영어 점수 : "+eng[i]);
					System.out.println(" 수학 점수 :"+math[i]);
					System.out.println("==================");
				}

			}else if(select==3) {
				System.out.println("검색할 학생의 번호를 입력하세요.");
				select = sc.nextInt();

				int i=0;
				boolean check = false;

				for(i=0;i<names.length;i++) {
					if(select == numbers[i]) {
						check=!check;
						break;
					}
				}		
				if(check) {
					System.out.println("학생 번호 : "+numbers[i]);
					System.out.println(" 학생 이름 : "+names[i]);
					System.out.println(" 국어 점수 : "+kors[i]);
					System.out.println(" 영어 점수 : "+eng[i]);
					System.out.println(" 수학 점수 :"+math[i]);
				}else {
					System.out.println("학생 정보가 없습니다.");
				}

			}else if(select==4) {		
				int i =0;	
				int temp = 0;
				String stemp = "";

				for(i=0;i<totals.length;i++) {
					for(int j=i+1;j<totals.length;j++) {
						if(totals[i]<totals[j]) {
							temp = totals[i];
							totals[i]=totals[j];
							totals[j]=temp;
							//numbers
							temp = numbers[i];
							numbers[i]=numbers[j];
							numbers[j]=temp;
							//kors
							temp = kors[i];
							kors[i]=kors[j];
							kors[j]=temp;
							//math
							temp = math[i];
							math[i]=math[j];
							math[j]=temp;
							//eng
							temp = eng[i];
							eng[i]=eng[j];
							eng[j]=temp;
							//names
							stemp= names[i];
							names[i]=names[j];
							names[j]=stemp;							
						}
					}				
					System.out.println("학생 번호 : "+numbers[i]);
					System.out.println(" 학생 이름 : "+names[i]);
					System.out.println(" 국어 점수 : "+kors[i]);
					System.out.println(" 영어 점수 : "+eng[i]);
					System.out.println(" 수학 점수 :"+math[i]);
					System.out.println("학생 총점 :" + totals[i]);
				}	

			}else if(select==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못 눌렀습니다.");
			}

		}//while

	}//main
}//end
