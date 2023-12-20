package DataAccessObject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import database.Connect;
import models.Food;

public class Fooddao {
	public static volatile Fooddao instance = null;
	
	private Fooddao(){
		
	}
	
	public static Fooddao getInstance() {
		if(instance == null) {
			synchronized (Fooddao.class) {
				if(instance == null) {
					 instance = new Fooddao();
				}
			}
		}
		
		return instance;
	}
		
	//Obtain All FoodDAta
	public Vector<Food> getAllFoodData(){
		
		Vector<Food> FoodList = new Vector<>();
		
		Connect con = Connect.getInstance();
		String query = "SELECT * FROM `FoodName`";
		
		ResultSet rs = con.executeQuery(query);
		
		try {
			while(rs.next()) {
				String FoodName = rs.getString(1);
				
				
				FoodList.add(new Food(FoodName));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return FoodList;

	}
	
	//Update Food Status by id
	public void updateFoodStatus(int OrderID, String status) {
		Connect con = Connect.getInstance();
		
		String query = "SELECT * FROM `OrderID` WHERE `OrderID` = ? ";
		PreparedStatement ps = con.prepareStatement(query);
		
		try {
			ps.setInt(1, OrderID);
			ps.setString(2,status);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//Delete Food Order Data
	public void deleteFoodOrder(int OrderID) {
		Connect con = Connect.getInstance();
		
		String query = "DELETE FROM `Order` WHERE `OrderID` = ? ";
		
		PreparedStatement ps = con.prepareStatement(query);
		
		try {
			ps.setInt(1, OrderID);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
