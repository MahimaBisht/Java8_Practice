package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TryMethodReference{
	List<Integer> numbers;
	
	public TryMethodReference(){
		System.out.println("constructor---");
		numbers = new ArrayList<Integer>();
		numbers.addAll(Arrays.asList(1,2,3,4,5));
	}
}