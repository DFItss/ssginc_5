package workshop06;

public class L5 extends Car implements Temp {

	public L5() {}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public int getTempGage() {
		// 5 주행 시 엔진 온도 1증가
		return getDistance() / 5;
	}

	@Override
	public void go(int distance) {
       // 8주행 시 현재 주유량 1 감소
		int size = getOilSize() - (distance/8);
		setOilSize(size);
		setDistance(distance);
	}

	@Override
	public void setOil(int oilSize) {
		//현재 oilSize + oilSize 지정
		int size = getOilSize() + oilSize;
		setOilSize(size);
	}

}
