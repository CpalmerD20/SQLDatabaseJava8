package entity;

public class Restaurants {
	private int restaId;
	
	private String restaName;
	private String visitDate;
	private int restaScore;
	private String restaCity;
	
	public Restaurants (int restaId, String restaName, String restaCity, 
			String visitDate, int restaScore) {
		this.restaId = restaId;
		this.restaCity = restaCity;
		this.restaName = restaName;
		this.visitDate = visitDate;
		this.restaScore = restaScore;
	}
	
	public int getRestaId() {
		return restaId;
	}
	public void setRestaId(int restaId) {
		this.restaId = restaId;
	}
	public String getRestaName() {
		return restaName;
	}
	public void setRestaName(String restaName) {
		this.restaName = restaName;
	}
	public String getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}
	public int getRestaScore() {
		return restaScore;
	}
	public void setRestaScore(int restaScore) {
		this.restaScore = restaScore;
	}
	public String getRestaCity() {
		return restaCity;
	}
	public void setRestaCity(String restaCity) {
		this.restaCity = restaCity;
	}
	
	
}
