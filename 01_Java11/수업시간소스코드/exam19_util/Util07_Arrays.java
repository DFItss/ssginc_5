package exam19_util;

import java.util.Arrays;
import java.util.List;


public class Util07_Arrays {
	
	public static void main(String[] args) {

	   // 배열관련 유틸리티 java.util.Arrays
		
		
		//1. 오름차순 정렬 ( Arrays.sort() )
		int [] arr = {6,2,1,85,23};
		Arrays.sort(arr); // 내림차순 정렬: sort(배열, Comparator인터페이스구현)
		System.out.println("1. 정렬:" + Arrays.toString(arr) );  // [1, 2, 6, 23, 85]
		
        
		//2. 배열값 출력 ( Arrays.toString() , **************** )
		int [] arr2 = {6,2,1,85,23};
		System.out.println("2. 배열값 문자열로 한꺼번에 출력:" + Arrays.toString(arr) );  // [1, 2, 6, 23, 85]
		
		//3. 여러개의 값들을 --> 컬렉션의 List, **************** )
		List<Integer> list = Arrays.asList(10,20,30);
		System.out.println("3. 여러 값들을 List 컬렉션으로 변경:" + Arrays.asList(10,20,30) );  // [10, 20, 30]
		
		//4. 전체 배열값 채우기
		int [] arr3 = {6,2,1,85,23};
		Arrays.fill(arr3, 100);
		System.out.println("4. 값 채우기:" + Arrays.toString(arr3) );  //[100, 100, 100, 100, 100]
		
		//5. 특정 범위 배열값 채우기
		int [] arr4 = {6,2,1,85,23};
		Arrays.fill(arr4, 0,3,100); // fill(배열, start, end, 변경값)
		System.out.println("5. 특정 범위 배열값 채우기:" + Arrays.toString(arr4) );  //[100, 100, 100, 85, 23]
		
		//6. 배열값 비교
		int [] arr6 = {6,2,1,85,23};
		int [] arr7 = {6,2,1,85,23};
		System.out.println("6. 배열값 비교" + Arrays.equals(arr6, arr7) );  // true
		
		//7. 배열에서 특정값의 위치얻기
		int [] arr8 = {6,2,1,85,23};
		// 만약 값이 존재하지 않으면  -(배열길이)-1  연산된 값을 리턴한다.
		System.out.println("7. 배열에서 특정값의 위치얻기" + Arrays.binarySearch(arr8, 1) );  // 3
	
		
		//8. 배열복사 및 크기변경
		int [] arr9 = {6,2,1};
		int [] arr10 =Arrays.copyOf(arr9, 5);
		System.out.println("8. 배열복사 및 크기변경:" + Arrays.toString(arr10) );  //[100, 100, 100, 85, 23]
		
	}
}







