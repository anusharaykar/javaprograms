import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Map.Entry;

public class Generic_Class_Map<T1,T2> {
	Map<T1,T2> m = new HashMap<T1,T2>();
	
	public void accepting(T1 t, T2 t2) {
		m.put(t,t2);
	}
	public void display(){
		System.out.println("Map list");
		Set<Map.Entry<T1, T2>> set = m.entrySet();
		for(Entry<T1, T2> s:set) {
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}		
	}
	
	public static void main(String args[]) {
		List l = new ArrayList();
		int a = 10;
		
		Integer a1 = new Integer(10); // al is object
		
		ArrayList<Integer> al = new ArrayList<Integer>();//generic
		al.add(a1);
		
		LinkedList ll = new LinkedList();
		
		Stack s = new Stack();
		
		
		Generic_Class_Map<String, List> gc = new Generic_Class_Map<String, List>();
		Generic_Class_Map<String, Student> gc1 = new Generic_Class_Map<String, Student>();
		Student s1 = new Student();
		ArrayList<Student> al1 = new ArrayList<Student>();
		s1.setAge(10);
		s1.setName("Hello World");
		Student s12 = new Student();
		s1.setAge(10);
		s1.setName("Hello World");
		al1.add(s12);
		al1.add(s12);
		gc.accepting("record1", al1);
		gc.display();
		
	}

}
