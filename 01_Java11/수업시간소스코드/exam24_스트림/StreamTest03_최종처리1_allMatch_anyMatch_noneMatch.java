package exam24_스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;


public class StreamTest03_최종처리1_allMatch_anyMatch_noneMatch {

	public static void main(String[] args) {

         List<Integer> list = Arrays.asList(2,4,6);
         
         //1. allMatch(Predicat):
         // 모든 값이 짝수값이냐?
         boolean result = list.stream().allMatch(t-> t%2==0);
         System.out.println("모든 값이 짝수값이냐?: " + result);
         
         //2. anyMatch(Predicate)
         // 3의 배수가 하나라도 있냐?
         boolean result2 = list.stream().anyMatch(t->t%3==0);
         System.out.println(" 3의 배수가 하나라도 있냐?: " + result2);
         
         //3. noneMatch(Predicate)
         // 모든값이 10보다 작냐? 모든 값이 3의 배수가 아니냐?
         boolean result3 = list.stream().noneMatch(t->t%3==0);
         System.out.println(" 모든 값이 3의 배수가 아니냐?: " + result3);
	}
}






