package Controller;

import java.util.Vector;

import DataAccessObject.Fooddao;
import models.Food;
import view.ViewFoodList;
import view.ViewFoodList.ViewFoodListVar;

public class FoodController {
	public static volatile FoodController instance = null;

	private FoodController() {
		
	}
	
	public static FoodController getInstance() {
		if(instance == null) {
			synchronized (FoodController.class) {
				if(instance == null) {
					 instance = new FoodController();
				}
			}
		}
		
		return instance;
	}
	
	Fooddao fooddao = Fooddao.getInstance();
	
	public Vector<Food> getAllFoodData(){
		return fooddao.getAllFoodData();
	}
	
	
	//refresh
	private void refresh(ViewFoodListVar components ) {
		components.foodTable.getItems().clear();
		components.foodList.clear();
		getData(components);
	}
	
	//Add Data to Db
	public void getData(ViewFoodListVar components) {
		FoodController foodControl = FoodController.getInstance();
		components.foodList = foodControl.getAllFoodData();

		for(Food food : components.foodList) {
			components.foodTable.getItems().add(food);
		}
	}
//	
//	public void addFoodMenuHandler
//	
//}
//	
	
	
}