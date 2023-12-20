package view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuCashier {
	public MenuBar menuBar;
	Menu menuFood, menuReceipts;
	public MenuItem menuViewFoodMenuItems, menuViewReceiptItem, menuViewOrderItem, menuViewReceiptDetail;
	
	public void initialize() {
		menuBar = new MenuBar();
		
		menuFood = new Menu("Food");
		
		menuReceipts = new Menu("Receipts");
		
		menuBar.getMenus().addAll(menuFood,menuReceipts);
		
		
		menuViewFoodMenuItems = new MenuItem("View Food Item");
		menuViewReceiptItem = new MenuItem("View Receipt Items");
		menuViewOrderItem = new MenuItem("View Ordered Items");
		menuViewReceiptDetail = new MenuItem("View Receipt Detail");
		
		
		menuFood.getItems().addAll(menuViewFoodMenuItems);
		menuReceipts.getItems().addAll(menuViewReceiptItem, menuViewOrderItem, menuViewReceiptDetail);
		
	}
}
