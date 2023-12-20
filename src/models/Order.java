package models;

public class Order {
	private Integer OrderID,AmountID;
	
	public Order(Integer orderID, Integer amountID) {
		super();
		OrderID = orderID;
		AmountID = amountID;
	}

	public Integer getOrderID() {
		return OrderID;
	}

	public void setOrderID(Integer orderID) {
		OrderID = orderID;
	}

	public Integer getAmountID() {
		return AmountID;
	}

	public void setAmountID(Integer amountID) {
		AmountID = amountID;
	}

	


	
	
}
