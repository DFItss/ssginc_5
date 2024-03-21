package workshop06;

public abstract class Car {

	private String name;
	private String engine;
	private int oilTank;
	private int oilSize;
	private int distance;
	
	public Car() {}

	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	//추상메서드: 2가지 메서드를 하위 클래스에서 강제
	public abstract void go(int distance); // 주행
	public abstract void setOil(int oilSize); // 주유

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getOilTank() {
		return oilTank;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + ", oilTank=" + oilTank + ", oilSize=" + oilSize
				+ ", distance=" + distance + "]";
	}
}





