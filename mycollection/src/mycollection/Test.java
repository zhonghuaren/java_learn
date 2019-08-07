package mycollection;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("hahaha");
		
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();
		String[] strArray = new String[list.size()];
		list.toArray(strArray);
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println();
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("===================");
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "value1");
		map.put("2", "value2");
		map.put("3", "value3");
		
		for (String key : map.keySet()) {
			System.out.println("key : " + key + " value : " + map.get(key));
		}
		System.out.println("===================");
		
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
		}
		System.out.println("===================");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
		}
		System.out.println("===================");
		for (String v : map.values()) {
			System.out.println("value : " + v);
		}
	}
}
