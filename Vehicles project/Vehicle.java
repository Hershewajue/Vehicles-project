
public class Vehicle {
	// make, model, registrationNumber, annd isHired
	private String make;
	private String model;
	private String regNumber;
	private boolean isHired;

	public Vehicle(String make, String model, String regNumber) {
		this.make = make;
		this.model = model;
		this.regNumber = regNumber;
		this.isHired = false;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public boolean isHired() {
		return isHired;
	}

	public void setHired(boolean isHired) {
		this.isHired = isHired;
	}

	@Override
	public String toString() {
		return "Vehicle [getMake()=" + getMake() + ", getModel()=" + getModel() + ", getRegNumber()=" + getRegNumber()
				+ ", isHired()=" + isHired() + "]";
	}

}
