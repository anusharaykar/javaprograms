
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
public class HashMappro1 {
	String state,capital;
	Map<String,String> dict= new HashMap<String,String>();
	void set(String state,String capital)
	{
		dict.put(state, capital);
	}
	void get()
	{
		System.out.println("State \t Capital");
		for(Map.Entry<String, String> word : dict.entrySet())
		{
			System.out.println(word.getKey()+"\t"+word.getValue());
			
		}
			
	}
	void sort()
	{
		
		List<Entry<String,String>> list = new LinkedList<Entry<String,String>>(dict.entrySet());
		Collections.sort(list, new Comparator<Entry<String,String>>(){
			 public int compare(Entry<String,String> ol, Entry<String,String> ol2)   
			 {
				 return ol.getValue().compareTo(ol2.getValue());
			 }
			
		});
		for(Entry<String,String> item:list)
		{
			System.out.println(item);
		}
		
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMappro1 obj= new HashMappro1();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("MENU");
			System.out.println("1.Adding Element");
			System.out.println("2.Sorting");
			System.out.println("3.Display");
			System.out.println("Enter your choice");
			int ch= sc.nextInt();
			switch(ch)
			{
					case 1:System.out.println("Enter the state name");
							String state=sc.next();
							System.out.println("Enter the capital name");
							String capital=sc.next();
							obj.set(state,capital);
							break;
					case 2:obj.sort();
							break;
					case 3:obj.get();
							break;
						
			}
		
		
		}

	}

}
