package entities;

public class OutsourcedEmployee extends Employee{
	private Double addtionalCharge;

	public OutsourcedEmployee(Double addtionalCahrge) {
		super();
		this.addtionalCharge = addtionalCahrge;
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addtionalCahrge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = addtionalCahrge;
	}

	public Double getAddtionalCahrge() {
		return addtionalCharge;
	}

	public void setAddtionalCahrge(Double addtionalCahrge) {
		this.addtionalCharge = addtionalCahrge;
	}
	
	@Override
	public double payment() {
		return super.payment()+(this.addtionalCharge*0.10);
	}
	

}
