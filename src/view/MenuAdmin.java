package view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuAdmin {
	public MenuBar menuBar;
	Menu menuFood, menuUser;
	public MenuItem menuAllViewFoodMenuItems, menuUserItem;
	
	public void initialize() {
		menuBar = new MenuBar();
		
		menuFood = new Menu("Food");
		
		menuUser = new Menu("Users");
		
		menuBar.getMenus().addAll(menuFood,menuUser);
		
		
		menuAllViewFoodMenuItems = new MenuItem("View All Food Item");
		menuUserItem = new MenuItem("View Receipt Items");
		
		menuFood.getItems().addAll(menuAllViewFoodMenuItems);
		menuUser.getItems().addAll(menuUserItem);
		
	}
}
