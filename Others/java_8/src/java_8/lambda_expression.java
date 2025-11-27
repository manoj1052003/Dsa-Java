package java_8;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface FunctionalInt{
	void print();
}

interface Addition{
	void add(int a, int b);
}

interface Substraction{
	int sub(int a, int b);
}

public class lambda_expression {
	
	public static void main(String[] args) {
		//anonymous 
		FunctionalInt fn = new FunctionalInt() {
			
			@Override
			public void print() {
				System.out.println("hi babe");
				
			}
		};
		fn.print();
		
		
		FunctionalInt fi = ()->{
			System.out.println("hello");
		};
		
		fi.print();
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		for(Integer val : list) {
			System.out.println(val);
		}
		
		list.forEach((val)->System.out.println(val));
		
		Addition ad = (x,y) ->{
			System.out.println("addition of two numbers "+(x+y));
		};
		
		ad.add(10, 20);
		
		Substraction sb = (a,b) ->{
			return Math.abs(a-b);
		};
		System.out.println("absolute diff is "+sb.sub(10, 20));
	}
	
	
}
