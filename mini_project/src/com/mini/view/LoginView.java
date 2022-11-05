package com.mini.view;

import java.util.Scanner;

public class LoginView {
	
	Scanner sc = new Scanner(System.in);

	
	public int loginMain() {
		int num;
		
		/*
		 * flag = 0 : 프로그램 종료
		 * flag = 1 : 로그인 성공
		 */
		int flag = 0;
		
		do{
			System.out.println(" ====== 로그인 화면 메뉴 ======");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("0. 프로그램 종료");
			System.out.println(" ============================ \n");
			
			System.out.print("메뉴를 입력하세요 : ");
			num = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(num) {
			case 1:
				System.out.println(" ===================== ");
				System.out.println(" ****    회원가입   ****");
				System.out.println(" ===================== ");
				System.out.println();
				/*
				 * 회원가입 View 출력
				 * 회원가입 View가 실행되고  정상 생성 후
				 * 텍스트로 회원 정보 모아 놓고 진행 합시다
				 * 텍스트 파일 == DB
				 */
				break;
			case 2:
				/*
				 * 로그인 할 수 있는 함수 실행 
				 */
				
				System.out.println("   ===================== ");
				System.out.println(" ** 로그인에 성공하셨습니다. **");
				System.out.println("   ===================== ");
				System.out.println();
				
				flag = 1;
				break;
			case 0:
				System.out.println(" ================ ");
				System.out.println("프로그램을 종료합니다.");
				System.out.println(" ================ ");
				System.out.println();
				
				flag = 0;
				break;
			}
		}while(num != 0 && num != 2);
		
		return flag;
	}
}
