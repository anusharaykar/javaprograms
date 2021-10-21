import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Collections_Examples {
	String s[] = {"C","A","B","E","D"};
	String abd[] = {"Beta","Alpha","Gamma","Pico","Theta"};
	
	void Working_of_ArrayList() {
		ArrayList<String> al = new ArrayList<String>();
		for(String a:s) {
			al.add(a);
		}
		System.out.println("to string:"+al.toString());
		System.out.println("display elements "+al);
		System.out.println(al.addAll(al));
		System.out.println(al.remove(0));
		System.out.println("contains: "+al.contains("A"));
		System.out.println("Iterators list");
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println("elements:"+it.next());
		}
		Collections.sort(al);
		System.out.println("After Sorting \n");
		it = al.iterator();
		while(it.hasNext()) {
			System.out.println("elements:"+it.next());
		}
		
	}
	
	void Working_of_LinkedList() {
		LinkedList<String> ll = new LinkedList<String>();
		for(String a:s) {
			ll.add(a);
		}
		System.out.println("to string:"+ll.toString());
		System.out.println("display elements "+ll);
		System.out.println(ll.addAll(ll));
		System.out.println(ll.remove(0));
		System.out.println("Add First - P");
		ll.addFirst("P");
		System.out.println(ll.toString());
		System.out.println("Add Last - Z");
		ll.addLast("Z");
		System.out.println(ll.toString());
		
		System.out.println("remove First - P");
		ll.removeFirst();
		System.out.println(ll.toString());
		System.out.println("remove Last - Z");
		ll.removeLast();
		System.out.println(ll.toString());
		
		
		System.out.println("Iterators list");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println("elements:"+it.next());
		}
		Collections.sort(ll);
		System.out.println("After Sorting \n");
		it = ll.iterator();
		while(it.hasNext()) {
			System.out.println("elements:"+it.next());
		}
		
	}
	
	void Working_of_HashSet() {
		HashSet<String> hs = new HashSet<String>();
		for(String a:abd) {
			hs.add(a);
		}
		System.out.println("to string:"+hs.toString());
		System.out.println("display elements "+hs);
		System.out.println(hs.addAll(hs));//Duplicate elements
		System.out.println(hs.remove("A"));
		
		System.out.println("Hash Set \n");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println("elements:"+it.next());
		}		
	}
	
	void Working_of_TreeSet() {
		TreeSet<String> ts = new TreeSet<String>();
		for(String a:abd) {
			ts.add(a);
		}
		System.out.println("to string:"+ts.toString());
		System.out.println("display elements "+ts);
		System.out.println(ts);//Duplicate elements
		System.out.println(ts.remove("A"));
		
		System.out.println("Tree Set \n");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println("elements:"+it.next());
		}		
	}
	
	
	
	public static void main(String args[]) {
		Collections_Examples ce = new Collections_Examples();
		ce.Working_of_ArrayList();
		System.out.println("Linked List");
		ce.Working_of_LinkedList();
		System.out.println("Hash Set");
		ce.Working_of_HashSet();
	System.out.println("Tree Set");
		ce.Working_of_TreeSet();
		
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("first element",new Integer(01));
		m.put("second element",new Integer(02));
		m.put("third element",new Integer(03));
		m.put("fourth element",new Integer(04));
		System.out.println("Map list");
		Set<Map.Entry<String, Integer>> set = m.entrySet();
		for(Entry<String, Integer> s:set) {
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
		
		
		Student s = new Student();
		s.age = 20;
		s.name = "xyz";
	}
}
