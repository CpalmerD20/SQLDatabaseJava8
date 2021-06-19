package entity;

public class Dishes {

	private int dishId;
	private String dishName;
	private String orderDate;
	private String dishComment;
	private double dishPrice;
	private int dishScore;
	
	public Dishes (int dishId, String dishName, String orderDate, 
			String dishComment, double dishPrice, int dishScore) {
		this.dishId = dishId;
		this.dishName = dishName;
		this.orderDate = orderDate;
		this.dishComment = dishComment;
		this.dishPrice = dishPrice;
		this.dishScore = dishScore;
	}
	
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getDishComment() {
		return dishComment;
	}
	public void setDishComment(String dishComment) {
		this.dishComment = dishComment;
	}
	public double getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(double dishPrice) {
		this.dishPrice = dishPrice;
	}
	public int getDishScore() {
		return dishScore;
	}
	public void setDishScore(int dishScore) {
		this.dishScore = dishScore;
	}
}
