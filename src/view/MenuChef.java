package view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuChef {
	
	public MenuBar menuBar;
	Menu menuFood, menuOrders;
	public MenuItem menuViewFoodMenuItems, menuViewOrderStatusItem;
	
	public void initialize() {
		menuBar = new MenuBar();
		
		menuFood = new Menu("Food");
		
		menuOrders = new Menu("Orders");
		
		menuBar.getMenus().addAll(menuFood,menuOrders);
		
		
		menuViewFoodMenuItems = new MenuItem("View Food Item");
		menuViewOrderStatusItem = new MenuItem("View Orders Items");
		
		menuFood.getItems().addAll(menuViewFoodMenuItems);
		menuOrders.getItems().addAll(menuViewOrderStatusItem);
		
	}
}
