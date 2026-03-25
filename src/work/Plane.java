package work;

abstract public class Plane {
	private String planeName;
	private int fulSize;
	
	public Plane() {};
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFulSize() {
		return fulSize;
	}
	public void setFulSize(int fulSize) {
		this.fulSize = fulSize;
	}
	public Plane( String planeName, int fulSize) {
		this.planeName = planeName;
		this.fulSize = fulSize;
	}
	
	abstract public void flight(int distance);
	
	 public void refuel(int fuel) {
			setFulSize(getFulSize() + fuel);
	}
}


