package view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuWaitress {
	public MenuBar menuBar;
	Menu menuFood, menuOrders;
	public MenuItem menuViewFoodMenuItems, menuViewPreparedStatusItem, menuViewAllOrderItem;
	
	public void initialize() {
		menuBar = new MenuBar();
		
		menuFood = new Menu("Food");
		
		menuOrders = new Menu("Orders");
		
		menuBar.getMenus().addAll(menuFood,menuOrders);
		
		
		menuViewFoodMenuItems = new MenuItem("View Food Item");
		
		menuViewPreparedStatusItem = new MenuItem("View Prepared Items");
		menuViewAllOrderItem = new MenuItem("View All Order");
		
		menuFood.getItems().addAll(menuViewFoodMenuItems);
		menuOrders.getItems().addAll(menuViewAllOrderItem);
		menuOrders.getItems().addAll(menuViewPreparedStatusItem);
	}
	
}
