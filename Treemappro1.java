
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Treemappro1 {
	String state,capital;
	TreeMap<String,String> dict= new TreeMap<String,String>();
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
   void search(String key)
   {
	   if(dict.containsKey(key))
	   {
		   System.out.println("The key is present");
	   }
	   else
	   {
		   System.out.println("The key is not present");
	   }
	   
   }
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treemappro1 obj= new Treemappro1();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("MENU");
			System.out.println("1.Adding Element");
			System.out.println("2.Searching");
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
					case 2: System.out.println("Enter the key to search");
							String key=sc.next();
						obj.search(key);
							break;
					case 3:obj.get();
							break;
						
			}
		
		
		}

	}

}
