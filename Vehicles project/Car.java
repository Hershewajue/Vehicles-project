
public class Car extends Vehicle {
	private int numOfSeats;
	private String engineSize;
	
	public Car (String make, String model, String regNumber, int numOfSeats, String engineSize) {
		super(make, model, regNumber);
		this.numOfSeats = numOfSeats;
		this.engineSize = engineSize;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Car [getNumOfSeats()=" + getNumOfSeats() + ", getEngineSize()=" + getEngineSize() + ", toString()=" + super.toString() + "]";
	}
	
}
