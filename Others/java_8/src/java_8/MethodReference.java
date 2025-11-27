package java_8;

import java.util.List;

@FunctionalInterface
interface Abc{
	
	void disp();
}

class Demo{
	
	void print() {
		System.out.println("givin implimentation");
	}
	
	static void show() {
		System.out.println("static reference");
	}
}

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		
		Abc a = d::print;
		
		a.disp();
		
		Abc b = Demo::show;
		b.disp();
		
		List<String> cricketers = List.of("Vaibhav","kohli","rohith","surya","jassi");
		
		cricketers.forEach(System.out::println);
		
		//System.out.println(cricketers);
		

	}

}
