package exam12_상속후_4_이클립스;

public class Employee {
   // 공통적인 속성
	String name;
	int salary;
	
	//생성자
	public Employee() {
		super();
	}
	
	 public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	//공통적인 기능
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getEmployee() {
		return name+"\t"+salary;
	}
  
	
	
	
}
