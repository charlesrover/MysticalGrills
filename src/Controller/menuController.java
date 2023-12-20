package Controller;

import javafx.scene.layout.BorderPane;

public class menuController {
	
	public static volatile menuController instance;
	
	private menuController() {
		
	}
	
	public static menuController getInstance() {
		if(instance == null) {
			synchronized (menuController.class) {
				if(instance == null) {
					 instance = new menuController();
				}
			}
		}

		return instance;
	}
	
	public void selectMenu(BorderPane bp, String role) {
//		if(role.equals("Customer")){
//			bp.setTop(arg0);
//		}
//		else if(role.equals("Cashier")){
//			bp.setTop(arg0);
//		}
//		else if(role.equals("Chef")) {
//			bp.setTop(arg0);
//		}
//		else if(role.equals("Waitress")) {
//			bp.setTop(arg0);
//		}
//		else if(role.equals("Admin")) {
//			bp.setTop(arg0);
//		}
	}

}
