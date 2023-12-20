package view;

import Controller.FoodController;
import Controller.menuController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import models.User;

public class CreateOrders {
	public class createOrderVar{
		public User user;
		Scene scene;
		
		BorderPane bp;
		VBox vb;
		
		Label titleLbl, FoodNameLbl,QuantityLbl;
		TextField QuantityTfl;
		public ComboBox<String> FoodNameCB;
		
		public Button btnOrder;
		
		GridPane gp;
		
		public Alert errorAlert, successAlert;
		
	}
	
	private void initialize(createOrderVar components) {
		FoodController fc = FoodController.getInstance();
		
		components.titleLbl = new Label ("Order Foods");
		
		components.FoodNameLbl = new Label ("Food Name");
		components.QuantityLbl = new Label ("Quanity");
		
		components.FoodNameCB = new ComboBox<>();
//		components.FoodNameCB.getItems().addAll((fc.getAllFoodData());
		
		components.btnOrder = new Button ("Order");
		
		components.gp = new GridPane();
//		components.gp.add(components.FoodNameLbl, arg1, arg2);
//		components.gp.add(components.QuantityLbl, arg1, arg2);
		
		components.vb = new VBox();
		components.vb.getChildren().addAll(components.gp, components.btnOrder);
		
		components.bp = new BorderPane();
		components.bp.setCenter(components.titleLbl);
		components.bp.setBottom(components.vb);
		
		components.scene = new Scene(components.bp);
		
	
//		private void setStyle(OrdersVar components) {
//			components.titleLbl.setPadding(new Insets(20));
//			
//			components.gp.setVgap(10);
//			components.gp.setHgap(15);
//			
//			components.vb.setPadding(new Insets(20));
//			components.vb.setSpacing(30);
			
	}
	
	public Scene initializePage(User user) {
		menuController mc = menuController.getInstance();
		FoodController fc = FoodController.getInstance();
		
		createOrderVar components = new createOrderVar();
		initialize(components);
//		setStyle(components);
		initializeAlert(components);
		mc.selectMenu(components.bp, user.getRole());
//		fc.add
	
		return components.scene;
	}
	
	private void initializeAlert (createOrderVar components) {
		components.errorAlert = new Alert(AlertType.ERROR);
		components.errorAlert.setTitle("Error");
		
		components.successAlert = new Alert(AlertType.INFORMATION);
		components.successAlert.setTitle("Order Succesful");
	}
}
