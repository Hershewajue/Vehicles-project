
public class Van extends Vehicle {
	private int capacity;
	
	public Van (String make, String model, String regNumber, int capacity) {
		super(make, model, regNumber);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Van [getCapacity()=" + getCapacity() + ", toString()=" + super.toString() + "]";
	}
	
}
