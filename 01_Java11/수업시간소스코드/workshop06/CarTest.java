package workshop06;

public class CarTest {

	public static void main(String[] args) {

		Car [] cars = new Car[2];  // 다형성
		cars[0] = new L3("L3", "1500", 50, 25, 0);
		cars[1] = new L5("L5", "2000", 70, 35, 0);
		// new Car();
//		Car [] cars2 = {new L3("L3", "1500", 50, 25, 0),
//				       new L5("L5", "2000", 70, 35, 0)};
		// 기본출력
		for(int idx=0; idx < cars.length; idx++) {
			//형변환 가능한 타입이 L3 또는 L5. 따라서 타입체크부터 해야 된다.
			if(cars[idx] instanceof L3) {
				L3 car = (L3)cars[idx];
				System.out.printf("%s %s %d %d %d %d \n",car.getName(),
							                       car.getEngine(),
						                           car.getOilTank(),
						                           car.getOilSize(),
						                           car.getDistance(),
						                           car.getTempGage());
			}else {
				L5 car = (L5)cars[idx];
				System.out.printf("%s %s %d %d %d %d \n",car.getName(),
						                           car.getEngine(),
                                                   car.getOilTank(),
                                                   car.getOilSize(),
                                                   car.getDistance(),
                                                   car.getTempGage());
			}
		}//end for
		
		// 25 주유
		for(int idx=0; idx < cars.length; idx++) {
			
			cars[idx].setOil(25); // 25 주유
			
			if(cars[idx] instanceof L3) {
				L3 car = (L3)cars[idx];
				System.out.printf("%s %s %d %d %d %d \n",car.getName(),
							                       car.getEngine(),
						                           car.getOilTank(),
						                           car.getOilSize(),
						                           car.getDistance(),
						                           car.getTempGage());
			}else {
				L5 car = (L5)cars[idx];
				System.out.printf("%s %s %d %d %d %d \n",car.getName(),
						                           car.getEngine(),
                                                   car.getOilTank(),
                                                   car.getOilSize(),
                                                   car.getDistance(),
                                                   car.getTempGage());
			}
		}//end for
		
		// 80 주행
		for(int idx=0; idx < cars.length; idx++) {
			cars[idx].go(80); // 80 주행
			if(cars[idx] instanceof L3) {
				L3 car = (L3)cars[idx];
				System.out.printf("%s %s %d %d %d %d \n",car.getName(),
							                       car.getEngine(),
						                           car.getOilTank(),
						                           car.getOilSize(),
						                           car.getDistance(),
						                           car.getTempGage());
			}else {
				L5 car = (L5)cars[idx];
				System.out.printf("%s %s %d %d %d %d \n",car.getName(),
						                           car.getEngine(),
                                                   car.getOilTank(),
                                                   car.getOilSize(),
                                                   car.getDistance(),
                                                   car.getTempGage());
			}
		}//end for
		
		
		
	}
}
