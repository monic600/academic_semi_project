package com.mini.view;

import java.util.Scanner;

import com.mini.dto.ProductDTO;

public class OliveMenu {
	private Scanner sc = new Scanner(System.in);
	
	BucketView bV = new BucketView();
	
	private int num;
	private int flag; // flag = 0: 프로그램 종
	
	public int OliveMainMenu() {
		do
		{
			System.out.println(" ====== Olive 메인 메뉴 ======");
			System.out.println("1. 물품 구매 ");
			System.out.println("2. 장바구니 조회");
			System.out.println("3. 구매목록 조회");
			System.out.println("4. 탈퇴");
			System.out.println("0. 프로그램 종료");
			System.out.println(" =========================== \n");
			
			System.out.print("메뉴를 입력하세요 : ");
			
			System.out.println();
			num = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch(num) {
			case 1:
				break;
			case 2:
				bV.bucketMainView();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println(" ================ ");
				System.out.println("프로그램을 종료합니다.");
				System.out.println(" ================ ");
				flag = 0;
				break;
			}
			
		}while(num != 0);
		
		return flag;
	}
	
	public void inputProduct(ProductDTO product) {
		
	}
}
