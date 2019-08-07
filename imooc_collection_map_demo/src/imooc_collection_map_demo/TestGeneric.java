package imooc_collection_map_demo;
import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	//带有泛型的list类型属性
	public List<Course> courses;
	
	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}
	
	public void testAdd() {
		Course cr1 = new Course("1", "chinese");
		courses.add(cr1);
		Course cr2 = new Course("2", "math");
		courses.add(cr2);
	}
	
	public void testForEach() {
		for(Course cr:courses) {
			System.out.println(cr.id+":"+cr.name);
		}
	}
	
	public void testChild() {
		ChildCourse cr = new ChildCourse();
		cr.id = "3";
		cr.name = "child course";
		courses.add(cr);
	}
	
	public static void main(String[] args) {
		TestGeneric test = new TestGeneric();
		test.testAdd();
		test.testForEach();
		test.testChild();
		test.testForEach();
	}
}
