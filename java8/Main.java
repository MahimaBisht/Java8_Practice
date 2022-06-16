package java8;

import java.util.List;
import java.util.stream.Collectors;

//not required for now
abstract interface MethodReferences {

	abstract void methodName();
	default void methodList() {
		System.out.println("This is method list");
	}
}

//This comment is added to test git merge command

class Main{
	public static void main(String[] args) {
		//creating list
//		List<String> listOfStr = new ArrayList<String>();
//		//inserting items into list
//		listOfStr.addAll(Arrays.asList("this","is","string","list"));
//		//defining abstract method into anonymous class
//		Consumer<String> obj = System.out::println;
//		//using method definition
//		listOfStr.forEach(obj);
		
		TryMethodReference tryMethod = new TryMethodReference();
			tryMethod.numbers.stream().map(x->x+",").forEach(System.out::print);
			tryMethod.numbers.stream().forEach(System.out::print);
			tryMethod.numbers.stream().filter(x->x%2==0).forEach(System.out::print);
			List<Integer> even = tryMethod.numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
	}
}