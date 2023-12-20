package models;

public class TransactionDetail {
	private Integer TransactionID, TransactionDetailID;
	private String FoodName, CustomerName;
	public TransactionDetail(Integer transactionID, Integer transactionDetailID, String foodName, String customerName) {
		super();
		TransactionID = transactionID;
		TransactionDetailID = transactionDetailID;
		FoodName = foodName;
		CustomerName = customerName;
	}
	public Integer getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(Integer transactionID) {
		TransactionID = transactionID;
	}
	public Integer getTransactionDetailID() {
		return TransactionDetailID;
	}
	public void setTransactionDetailID(Integer transactionDetailID) {
		TransactionDetailID = transactionDetailID;
	}
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	
	
}
