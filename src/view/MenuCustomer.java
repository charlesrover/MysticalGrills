package view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuCustomer {

	public MenuBar menuBar;
	Menu menuFood, menuTransaction, menuOrder, menuTransactionStatus;
	
	public MenuItem menuViewMenuItemCustomer,  menuViewOrderMenuItems, menuViewTransactionStatusItem;
	
	public void init() {
		menuBar = new MenuBar();
		
		menuFood = new Menu("Food");
		menuTransaction = new Menu ("Order");
		menuTransactionStatus = new Menu("Status");
		
		menuBar.getMenus().addAll(menuFood, menuTransaction, menuOrder);
		
		menuViewMenuItemCustomer = new MenuItem("View All Menu Items");
		menuViewOrderMenuItems = new MenuItem("Order Food");
		menuViewTransactionStatusItem = new MenuItem("Status Order");
		
		menuFood.getItems().addAll(menuViewMenuItemCustomer);
		menuTransaction.getItems().addAll(menuViewMenuItemCustomer);
		menuTransactionStatus.getItems().addAll(menuViewTransactionStatusItem);
	}
}
