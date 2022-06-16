package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class Arrayoperations {

	public static void main(String[] args) {
		
		int[] sampleArr = new int[] {-1,-1,-1,-2,-5,0};
		int tempEven=sampleArr[0],tempOdd=sampleArr[0],even,odd;
		Arrays.sort(sampleArr);
		System.out.println(Arrays.toString(sampleArr));
		
		//sum of largest even and largest odd number in an array
		
		for(int i=0;i<sampleArr.length;i++) {
			if(sampleArr[i]%2==0) {
				even=sampleArr[i];
				if(even>tempEven)
					tempEven=even;
			}
			else if(sampleArr[i]%2!=0) {
				odd=sampleArr[i];
				if(odd>tempOdd)
					tempOdd=odd;
			}
		}
		System.out.println(tempEven+tempOdd);
		
		// char to array
		
		String str = "Mahima";
		char[] chr = str.toCharArray();
		System.out.println(Arrays.toString(chr));
		
		//string word count -split and join methods
		System.out.println(String.join(" ","mahima", "bisht"));
		
		//sort array in reverse order
		
		
		//sort string in reverse order
		StringBuilder str3 = new StringBuilder("bishtmahima");
		System.out.println(str3.reverse());
		
		
		//array to list
		List<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(100,320,3,9,50));
		System.out.println(arrlist.toString());
//		System.out.println((new int[] {arrlist.toArray()}).toString());
		
		// list to array
		
		
		//iterate list
		Iterator itr = arrlist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//tree set
		
		
		//iterate hashmap
		
		
		//arraylist
		
		
		//vector - optional
		
		
		//
		
	}
}