
import java.util.*;

class employee
{
	int empid,age;
	String name,address;
	
	public employee(int empid, int age, String name, String address)
	{
		this.empid=empid;
		this.age=age;
		this.name=name;
		this.address=address;
	}
}

class employeeex
{
	public static void main(String[] args)
	{
		LinkedList<employee> ll=new LinkedList<employee>();
		
		
		//creating employees
		
		employee e1=new employee(101, 24, "Sam", "Blore");
		employee e2=new employee(102, 36, "Ria", "Blore");
		employee e3=new employee(103, 20, "Bhanu", "Blore");
		employee e4=new employee(104, 67, "Sara", "Blore");
		employee e5=new employee(105, 44, "Vatsala", "Blore");
		
		
		//adding employees to list
		 
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		ll.add(e4);
		ll.add(e5);
		Scanner sc=new Scanner(System.in);
		for(;;){
			System.out.println("1.print the data");
			System.out.println("2.remove the data");
			System.out.println("3.add the data");
			System.out.println("4.check the indexvalue");
			System.out.println("5.check if list contains or not");
			System.out.println("6.clear the data");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
	switch(ch) {
	case 1:System.out.println("ORIGINAL DATA");
		System.out.println("EMPID \t AGE \t NAME \t ADDRESS");
		for(employee e:ll)
			System.out.println(e.empid+"\t"+e.age+"\t"+e.name+"\t"+e.address);
		System.out.println("--------------------------------");
		break;
		
	
	case 2:System.out.println("enter index value to remove");
	int n=sc.nextInt();
	ll.remove(n);
	for(employee e:ll)
		System.out.println(e.empid+"\t"+e.age+"\t"+e.name+"\t"+e.address);
	System.out.println("--------------------------------");
	//ll.remove(e5);
	System.out.println("removed 5th employee");
	ll.remove(e5);
	
for(employee e:ll)
		System.out.println(e.empid+"\t"+e.age+"\t"+e.name+"\t"+e.address);	
System.out.println("--------------------------------");
System.out.println("removing data from the beginning and end");
//
ll.removeFirst();
ll.removeLast();
for(employee e:ll)
	System.out.println(e.empid+"\t"+e.age+"\t"+e.name+"\t"+e.address);

	break;
	case 3:System.out.println("adding data at the beginning and end");
	employee e0=new employee(100, 24, "Ramya", "Blore");
employee e6=new employee(106, 44, "Andriya", "Blore");
//	
ll.addFirst(e0);
ll.addLast(e6);
for(employee e:ll)
System.out.println(e.empid+"\t"+e.age+"\t"+e.name+"\t"+e.address);
System.out.println("--------------------------------");
	
	
	break;
	case 4:
		System.out.println("checking the index value of object-e2");
		
		
		
		System.out.println(ll.indexOf(e2));
		break;
	case 5:
		System.out.println("checking  the presence of a data-e4");
		
		System.out.println(ll.contains(e4));
		break;
	case 6:
		System.out.println("clearing the list");
		
		ll.clear();
		for(employee e:ll)
			System.out.println(e.empid+"\t"+e.age+"\t"+e.name+"\t"+e.address);
	System.out.println("--------------------------------");
		break;
		default:System.out.println("invalid");
		
	}
		
	}
}
}
