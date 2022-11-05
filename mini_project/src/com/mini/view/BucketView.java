package com.mini.view;

import java.util.Scanner;

public class BucketView {
	
	public void bucketMainView() {
		//private Controller ct = new Controller();
		Scanner sc = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println(" ========= 장바구니 메뉴 ======== ");
			System.out.println("1. 장바구니 가격조회");
			System.out.println("2. 상품 삭제");
			System.out.println("3. 상품 추가");
			System.out.println("0. 프로그램 종료하기");
			System.out.println(" ============================= ");
			
			System.out.println();
			System.out.print("메뉴를 입력하세요 : ");
			menu = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(menu) {
			case 1: 
				System.out.println();
				break;
			case 2: 
				//selectProduct();
				break;
			case 3: 
				//addProduct();
				break;
			case 0: 
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break;
				//return;
			default: 
				System.out.println("다시 입력해주세요\n");
				break;
			}
		} while(menu != 0);
	}
}
