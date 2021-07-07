package database;
import java.sql.*;
import java.util.Scanner;

public class studb{
	String Usn,Name,Branch,Addr,phoneno,sem;
	Connection con=null;
	Scanner sc=new Scanner(System.in);
	
	 void connectdb()
	{
		   try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anusha","anusha","anusha"); 					
				
			}
				catch(Exception e) {
					e.printStackTrace();
				} 
	   }	
	
	public void insert() {
		try {
			connectdb();
			System.out.print("Enter Usn : ");
			Usn=sc.next();
			System.out.println("Enter Name : ");
			Name=sc.next();
			System.out.println("Enter Branch : ");
			Branch=sc.next();
			System.out.println("Enter Address : ");
			Addr=sc.next();
			System.out.println("Enter Phone no : ");
			phoneno=sc.next();
			System.out.println("Enter Semester : ");
			sem=sc.next();
			
			PreparedStatement pre = con.prepareStatement("insert into students values(?,?,?,?,?,?)");
			pre.setString(1, Usn);	
			pre.setString(2, Name);
			pre.setString(3, Branch);
			pre.setString(4, Addr);
			pre.setString(5, phoneno);
			pre.setString(6, sem);
			int rs= pre.executeUpdate();
			
			if(rs==1) {
				System.out.println("INSERTED");
				con.close();
			}
			else {
				System.out.println("Failed to INSERTED");
			}
			
										
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void display() {
		try {
			connectdb();
			
			PreparedStatement pre = con.prepareStatement("Select * FROM students");
			ResultSet rs2=pre.executeQuery();
			 
			 if(!rs2.next()) {
				 System.out.println("no data available to display");}
			 else {
			 ResultSet rs1=pre.executeQuery();
			 System.out.print("student usn  |  ");
			 System.out.print("student name  |  ");
			 System.out.print("branch  |  ");
			 System.out.print("phonenumber  |  ");
			 System.out.print("semester |  ");
			 System.out.print("\n");
			 while(rs1.next()) {
				 System.out.print(rs1.getString("USN")+"       |    ");
				 System.out.print(rs1.getString("Name")+"        |   ");
				 System.out.print(rs1.getString("Branch")+"      |  ");
				 System.out.print(rs1.getString("phoneno")+"      |   ");
				 System.out.print(rs1.getString("sem")+"       |     ");
				 System.out.print("\n");
			 }
			 }
		}
		
		catch(Exception e) {
			System.out.println(e);
		
		}
	}
	
	
	public void update() {
		try {
			connectdb();
			int c=0;
			
			String ph;
			System.out.print("Enter Usn to update record");
			String updrec=sc.next();
			PreparedStatement pre1 = con.prepareStatement("Select * FROM students");
			ResultSet rs3=pre1.executeQuery();
			if(!rs3.next()) {
				 System.out.println("no data available to update");}
			else {
				ResultSet rs2=pre1.executeQuery();
			while(rs2.next())
			{
				if(rs2.getString("USN").equalsIgnoreCase(updrec))
				{
			
			System.out.print("Enter phone no to be updated");
			ph=sc.next();      
			
			PreparedStatement pre = con.prepareStatement("update students set phoneno ="+ph+" WHERE Usn="+updrec);
			
			System.out.println("Updated Sucessfully");
			c=1;
			break;
				}
			
			
				//con.close();
			}
			
			}
			if(c==0)
			{
				System.out.println("not valid usn");
			}
		}
		
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public void delete() {
		try {
			connectdb();
			int c=0;
			PreparedStatement pre1 = con.prepareStatement("Select * FROM students");
			ResultSet rs3=pre1.executeQuery();
			if(!rs3.next()) {
				 System.out.println("no data available to delete");}
			else {
				
			System.out.print("Enter Usn for record to be deleted ");
			String delrec=sc.next();
			ResultSet rs2=pre1.executeQuery();
			while(rs2.next())
			{
				if(rs2.getString("USN").equalsIgnoreCase(delrec))
				{
			PreparedStatement pre = con.prepareStatement("delete FROM students WHERE Usn= ? ");
			pre.setString(1, delrec);
			int rs1=pre.executeUpdate();
			
			System.out.println("Deleted Sucessfully");
			c=1;
			break;}
				//con.close();
				
			}
			}
			if(c==0)
			{
				System.out.println("invalid usn");
			}
			
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void search()
	{
		try {
		connectdb();
		int c=0;
		PreparedStatement pre1 = con.prepareStatement("Select * FROM students");
		ResultSet rs3=pre1.executeQuery();
		if(!rs3.next()) {
			 System.out.println("no data available to delete");
			 }
		else {
			
		System.out.print("Enter Usn of record to search ");
		String srec=sc.next();
		PreparedStatement pre2 = con.prepareStatement("Select * FROM students");
		ResultSet rs1=pre2.executeQuery();
		while(rs1.next())
		{
			if(rs1.getString("USN").equalsIgnoreCase(srec))
			{
				
					 System.out.println("USN: "+rs1.getString("USN"));
					 System.out.println("NAME: "+rs1.getString("Name"));
					 System.out.println("BRANCH "+rs1.getString("Branch"));
					 System.out.println("PHONENUMBER: "+rs1.getString("phoneno"));
					 System.out.println("SEMESTER: "+rs1.getString("sem"));
					 //System.out.print("\n");
					 c=1;
					// break;
				
			}
		}
		
	}
		if(c==0)
		{
			System.out.println("USN not found");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void main(String args[]) {
		studb s =new studb();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1. Insert records into table: ");
			System.out.println("2. Display records from table: ");
			System.out.println("3. Update record in table: ");
			System.out.println("4. Delete record from table: ");
			System.out.println("5.search for a record");
			System.out.println("6.exit");
			
			int ch;
			
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:if(ch==1) {
				
				s.insert();
				break;
			
			}
			case 2:if(ch==2) {
				
				s.display();
				break;
			
			}
			case 3:
				s.update();
				break;
			
			case 4: 
				s.delete();
				break;
			
			case 5: s.search();
			break;
			case 6:System.exit(0);
			default:
				System.out.println("invalid choice");
				
			
		}
		
	}
		
	
	
}
}