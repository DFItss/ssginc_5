package exam12_상속후_4_이클립스;

public class Manager extends Employee {

	String depart; // Manager 에서만 추가된 속성
	
	public Manager() {
		super();
	}
	public Manager(String name, int salary) {
		super(name, salary);
	}
	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String getEmployee() {
		return super.getEmployee() +"\t"+ depart;
	}
	
	
}
