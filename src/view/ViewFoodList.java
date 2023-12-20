package view;

import java.util.Vector;

import Controller.FoodController;
import Controller.menuController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import models.Food;
public class ViewFoodList {
	
	public class ViewFoodListVar{
	Scene scene;	
	BorderPane bp;
	VBox vb;
	
	Label titleLbl,foodLbl;
	public TextField foodTf;
	
	ScrollPane sp;
	GridPane gp;
	
	public TableView<Food> foodTable;
	TableColumn<Food, String> FoodCol;
	
	public Alert alert;
	
	public Vector <Food> foodList;
	
	public Button btnOrder;
	}
	private void init (ViewFoodListVar components) 

	{
		components.titleLbl = new Label("View All Food");
		
		initializeTable(components);
		
		components.sp = new ScrollPane();
		components.sp.setContent(components.foodTable);
		components.sp.setFitToWidth(true);
		
		components.btnOrder = new Button ("Submit");
		
		components.vb = new VBox();
		components.vb.getChildren().addAll(components.sp);
		
		components.bp = new BorderPane();
		components.bp.setCenter(components.titleLbl);
		
		components.bp.setBottom(components.vb);

		components.scene = new Scene(components.bp);
	}
	
	
	private void initializeTable(ViewFoodListVar components) {
		components.foodTable = new TableView<>();
	
		components.FoodCol = new TableColumn<>("Food Names");
		
		components.foodTable.getColumns().add(components.FoodCol);
		
		components.FoodCol.setCellValueFactory(new PropertyValueFactory<>("FoodName"));
	}
	
private void setStyle(ViewFoodListVar components) {
		
		
		BorderPane.setAlignment(components.titleLbl, Pos.CENTER);
		BorderPane.setAlignment(components.sp, Pos.CENTER);
		
		BorderPane.setMargin(components.titleLbl, new Insets(20));
		components.sp.setPadding(new Insets(20));
	}
	
	public Scene initializePage(String role) {
	FoodController foodCont = FoodController.getInstance();
	menuController mc = menuController.getInstance();
	
	ViewFoodListVar components = new ViewFoodListVar();
	init(components);
	foodCont.getData(components);
	initializeAlert(components);
	mc.selectMenu(components.bp, role);
	
	return components.scene;
	}
	
	private void initializeAlert(ViewFoodListVar components) {
		components.alert = new Alert(AlertType.ERROR);
		components.alert.setTitle("ERROR");
	}
}
