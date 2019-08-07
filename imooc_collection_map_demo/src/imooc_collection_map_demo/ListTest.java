package imooc_collection_map_demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import java.util.Arrays;

public class ListTest {
	public List coursesToSelect;
	
	public ListTest() {
		this.coursesToSelect = new ArrayList();
	}
	
	public void testAdd() {
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程:"+temp.id+":"+temp.name);
		
		Course cr2 =new Course("2","C语言");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程:"+temp2.id+":"+temp2.name);
		
		Course[] course = {new Course("3","离散数学"), new Course("4","汇编语言")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("add course:"+temp3.id+":"+temp3.name+
				";"+temp4.id+":"+temp4.name);
		
		Course[] course2 = {new Course("5","高等数学"), new Course("6","大学英语")};
		coursesToSelect.addAll(2, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("add course:"+temp5.id+":"+temp5.name+
				";"+temp6.id+":"+temp6.name);
	}
	
	public void testGet() {
		int size = coursesToSelect.size();
		System.out.println("有如下课程待选:");
		for(int i = 0; i < size; i++) {
			Course cr = (Course) coursesToSelect.get(i);
			System.out.println("课程:"+ cr.id + ":" + cr.name);
		}
	}
	public void testIterator() {
		Iterator it = coursesToSelect.iterator();
		System.out.println("有如下课程待选(通过迭代器实现):");
		while(it.hasNext()) {
			Course cr = (Course) it.next();
			System.out.println("课程:"+cr.id+":"+cr.name);
		}
	}
	
	public void testForEach() {
		System.out.println("有如下课程待选(通过for each实现):");
		for(Object obj:coursesToSelect) {
			Course cr = (Course) obj;
			System.out.println("课程:"+cr.id+":"+cr.name);
		}
	}
	
	public void testModify() {
		coursesToSelect.set(4, new Course("5", "毛概"));
	}
	
	public void testDelete() {
		Course cr = (Course) coursesToSelect.get(5);
		System.out.println("delete课程:"+cr.id+":"+cr.name);
		//coursesToSelect.remove(5);
		Course[] courses = {(Course) coursesToSelect.get(4), (Course) coursesToSelect.get(5)};
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("delete course 4 5");
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
	  	lt.testIterator();
	  	lt.testModify();
	  	lt.testDelete();
	  	lt.testForEach();
	}
}
