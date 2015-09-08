package classwork;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo implements Comparator<T> {

	

	@Override
	public int compare(T o1, T o2) {
		int result = o1.compareToIgnoreCase( o2 );
		 return result;
	}
	
	public static void main(String[] args)
	{ 
		String strArr[] = new String[] {
				"joanna", "Jasmine", "joey", "Jerry", "juno"
		};
		
		Arrays.sort(strArr, new SortDemo());
		for (String str : strArr) {
			System.out.println(str);
		}
		
		
	}

}
