package view;

import java.util.Vector;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import models.Order;

//Page For Customer to See their Order
public class ViewOrders {
	
	public class ViewOrdersVar{
		public Vector<Order> foodOrderList;
		
		Scene scene;
		
		BorderPane bp;
		
		Label titleLbl;
		
		GridPane gp;
		
		public Button btnFinishBook, btnCancelBook;
		
		ScrollPane sp;
		
		VBox vb;
		HBox hb;
		
		public Alert successAlert;
		
		public TableView <Order> orderListTable;
		
		TableColumn<Order, Integer> OrderIDCol;
		TableColumn<Order, String> FoodNameCol;
		TableColumn<Order, Float> PriceIDCol;
		TableColumn<Order, Integer> QuantityIDCol;
	}
	
	
	private void initialize (ViewOrdersVar components) {
		components.titleLbl = new Label ("View Order");
		
		initialize(components);
		getData(components);
		
		components.sp = new ScrollPane();
		components.sp.setContent(components.orderListTable);
		components.sp.setFitToWidth(true);
		
		components.bp = new BorderPane();
		components.bp.setCenter(components.titleLbl);
		components.bp.setBottom(components.bp);
		
		components.scene = new Scene(components.bp);
		
	}
	
	private void setStyle(ViewOrdersVar components) {
		//Binding
		//
	}
	
	private void getData(ViewOrdersVar components) {
////		OrderController oc = OrderController.getInstance();
////		Vector<Order> OrderList = oc.getAllOrderData();
//		
//		for(Order order : OrderList) {
//			components.orderListTable.getItems().add(order);
//		}
	}
	
	private void initializeTable(ViewOrdersVar components) {
		components.orderListTable = new TableView<Order>();
		
		components.OrderIDCol = new TableColumn<>("Order ID");
		components.FoodNameCol = new TableColumn<>("Food Name");
		components.PriceIDCol = new TableColumn<>("Price ID");
		components.QuantityIDCol = new TableColumn<>("Quantity");
		
		components.orderListTable.getColumns().add(components.OrderIDCol);
		components.orderListTable.getColumns().add(components.FoodNameCol);
		components.orderListTable.getColumns().add(components.PriceIDCol);
		components.orderListTable.getColumns().add(components.QuantityIDCol);
		
		components.OrderIDCol.setCellValueFactory(new PropertyValueFactory<>("OrderID"));
		components.OrderIDCol.setCellValueFactory(new PropertyValueFactory<>("FoodName"));
		components.OrderIDCol.setCellValueFactory(new PropertyValueFactory<>("PriceID"));
		components.OrderIDCol.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
		
	}
	
	public Scene initializePage(String role) {
		ViewOrdersVar components = new ViewOrdersVar();
		initialize(components);
		setStyle(components);
		
//		components.bp.setTop(CustomerController.getInstance().menuCustomer.menuBar);
//		
//		OrderController oc = OrderController.getInstance();
//		oc.addViewOrderHandler(Components);
		
		return components.scene;
	}
	
}
