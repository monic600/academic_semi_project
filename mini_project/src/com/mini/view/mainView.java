package com.mini.view;

public class mainView {
	private int flag;
	LoginView login = new LoginView();
	OliveMenu oMenu = new OliveMenu();
	
	public void mainViews() {
		int loginFlag = login.loginMain();
		
		if(loginFlag == 0) {
			return;
		}
		
		do {
			
			flag = oMenu.OliveMainMenu();
			
		}while(flag != 0);
		
	}
}
