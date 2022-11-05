package com.mini.view;

public class PurchaseView {

	public void categoryList() {
		
		System.out.println("올리브영 화장품 카테고리");
		System.out.println(" 1. 마스크팩");
		System.out.println(" 2. 클렌징");
		System.out.println(" 3. 향수");
		System.out.println(" 4. 바디케어");
		System.out.println(" 5. 스킨케어");
		System.out.println(" 6. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print("원하시는 화장품 카테고리를 눌러주세요."); //누를 시 제품별 메소드로 이동
	}

	
	public void maskPack() {
		
		System.out.println("마스크팩 리스트\n");
		System.out.printf( " 1. %s : %s \t %s : %,5d원\n","상품명","시트팩","가격",10000);
		System.out.printf( " 2. %s : %s \t\t %s : %,5d원\n","상품명","코팩","가격",5000);
		System.out.printf( " 3. %s : %s \t %s : %,5d원 \t\t 이벤트할인 : 5%% \n","상품명","워시오프팩","가격",20000);
		
		System.out.println();
		System.out.println("원하시는 메뉴를 선택해 주세요. (1.구매하기 / 2.장바구니 추가 / 3.이전 메뉴로)");
		//잘못 누를 시 잘못됐다고 알려줌
		//구매를 누를 시 해당 항목 구매완료 됐습니다. -> 다른 항목도 구매하시겠습니까? 
		//장바구니 누를 시 장바구니에 추가됐습니다. -> 장바구니로 이동하시겠습니까?
	}
	
	
	public void cleansingFoam() {
		
		System.out.println("클렌징 리스트\n");
		System.out.printf( " 1. %s : %s \t %s : %,5d원\t\t 이벤트할인 : 10%% \n","상품명","클렌징 폼","가격",15000);
		System.out.printf( " 2. %s : %s \t %s : %,5d원\n","상품명","클렌징 젤","가격",12000);
		System.out.printf( " 3. %s : %s \t %s : %,5d원 \n","상품명","클렌징 오일","가격",13000);
		
		System.out.println();
		System.out.println("원하시는 메뉴를 선택해 주세요. (1.구매하기 / 2.장바구니 추가 / 3.이전 메뉴로)");
		
	}
	
	
	public void perfume() {
		
		System.out.println("향수 리스트\n");
		System.out.printf( " 1. %s : %-3s \t %s : %,5d원\n","상품명","랑방","가격",45000);
		System.out.printf( " 2. %s : %-3s \t %s : %,5d원\n","상품명","코치","가격",58000);
		System.out.printf( " 3. %s : %-3s \t %s : %,5d원 \t\t 이벤트할인 : 60%% \n","상품명","지미추","가격",73000);
		
		System.out.println();
		System.out.println("원하시는 메뉴를 선택해 주세요. (1.구매하기 / 2.장바구니 추가 / 3.이전 메뉴로)");
		
	}
	
	
	public void bodyCare() {
		
		System.out.println("바디케어 리스트\n");
		System.out.printf( " 1. %s : %-5s \t %s : %,5d원\n","상품명","바디워시","가격",10000);
		System.out.printf( " 2. %s : %-5s \t %s : %,5d원\n","상품명","바디로션","가격",15000);
		System.out.printf( " 3. %s : %-5s \t %s : %,5d원 \t\t 이벤트할인 : 10%% \n","상품명","바디미스트","가격",10000);
		
		System.out.println();
		System.out.println("원하시는 메뉴를 선택해 주세요. (1.구매하기 / 2.장바구니 추가 / 3.이전 메뉴로)");
		
	}
	
	
	public void skinCare() {
		
		System.out.println("스킨케어 리스트\n");
		System.out.printf( " 1. %s : %-3s \t %s : %,5d원\n","상품명","에센스","가격",18000);
		System.out.printf( " 2. %s : %-3s \t %s : %,5d원\n","상품명","크림","가격",23000);
		System.out.printf( " 3. %s : %-3s \t %s : %,5d원 \t\t 이벤트할인 : 20%% \n","상품명","토너","가격",20000);
		
		System.out.println();
		System.out.println("원하시는 메뉴를 선택해 주세요. (1.구매하기 / 2.장바구니 추가 / 3.이전 메뉴로)");
		
	}

}
