package generic;
import java.util.*;

public class GenericTest {
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		List<Integer> age = new ArrayList<Integer>();
		List<Number> number = new ArrayList<Number>();
		
		name.add("icon");
		age.add(18);
		number.add(314);
		
//		getDate(name);
//		getDate(age);
//		getDate(number);
		
		getUperNumber(age);
		getUperNumber(number);
	}
	
	public static void getDate(List<?> data) {
		System.out.println("data : " + data.get(0));
	}
	
	public static void getUperNumber(List<? extends Number> data) {
		System.out.println("data : " + data.get(0));
	}
}
