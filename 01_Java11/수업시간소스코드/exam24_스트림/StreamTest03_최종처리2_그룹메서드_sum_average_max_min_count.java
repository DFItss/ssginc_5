package exam24_스트림;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;


public class StreamTest03_최종처리2_그룹메서드_sum_average_max_min_count {

	public static void main(String[] args) {

         IntStream s =  Arrays.stream(new int[] {1,2,3,4,5,6});
         // 1. 총합: sum()
         int sum = s.sum();
         System.out.println("1. sum:" + sum);
        
         //정수형 배열
         int [] arr = new int[] {1,2,3,4,5,6};
         
         int sum2 = Arrays.stream(arr).sum(); // *******
         System.out.println("1. sum2:" + sum2);
         
         //2. 평균: average():OptionalDouble
         OptionalDouble avg =  Arrays.stream(arr).average();
         double avg2 = avg.getAsDouble();
         System.out.println("2. average1:" + avg2); // 3.5
         
         double avg3 = Arrays.stream(arr).average().getAsDouble();
         System.out.println("2. average2:" + avg3); // 3.5
         
       //3. 최대: max():OptionalInt
         int max = Arrays.stream(arr).max().getAsInt();
         System.out.println("3. max:" + max); // 
         
       //4. 최소: min():OptionalInt
         int min = Arrays.stream(arr).min().getAsInt();
         System.out.println("4. min:" + min); // 
         
       // 5. 갯수: count()
         long count = Arrays.stream(arr).count();
         System.out.println("5. count:" + count); // 
	
	   //  중간처리+그룹함수
        // 문제1: 짝수만 총합 출력하시오
         int yyy = Arrays.stream(arr)
        		         .filter(t->t%2==0)
        		         .sum(); 
         System.out.println("6. 짝수값의 총합:" + yyy); 
	
	}
}






