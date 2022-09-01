
public class ReservationSystem {
	private String name;
	private Double rate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return " [ Hotel name=" + name + ", Rate of the Hole =" + rate + "]";
	}
	
	
	
}
