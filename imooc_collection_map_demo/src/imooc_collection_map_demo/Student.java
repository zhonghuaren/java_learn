package imooc_collection_map_demo;
import java.util.Set;
import java.util.HashSet;

public class Student {
	public String id;
	public String name;
	public Set courses;
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.courses = new HashSet();
	}
}
