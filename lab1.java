import java.io.*;
import java.util.Scanner;

 class student
{
	
	String usn=null;
	String name=null;
	String adr="",email="",branch="";
	
    void read(String usn,String name,String adr,String email,String branch)
	{
		this.usn=usn;
	 this.name=name;
	 this.adr=adr;
	 this.email=email;
	 this.branch=branch;

	}
	void calfees()
	{
		
		double tf=0,ef=0;
		if((this.branch).equals("MCA") || (this.branch).equals("mca") )
		{
		 tf=1897654;
		 ef=45678;
		System.out.println("TOTAL FEES: "+(tf+ef));
	}
	else if((this.branch).equals("MTECH") || (this.branch).equals("mtech") || (this.branch).equals("Mtech")   )
		{
		 tf=18976556;
		 ef=45678;
		 System.out.println("TOTAL FEES: "+(tf+ef));
		
	}
	else if((this.branch).equals("BTECH") || (this.branch).equals("btech") || (this.branch).equals("Btech") )
		{
		 tf=189765412;
		 ef=4567865;
		 System.out.println("TOTAL FEES: "+(tf+ef));
	}
	else
	{
		System.out.println("enter correct branch name");
	}
	}


	void display()
	{
		System.out.println("name is:"+name);
		System.out.println("usn is:"+usn);
		System.out.println("email is:"+email);
		System.out.println("branch:"+branch);
		
		
	}
}
	public class lab1{
	public static void main(String args[])
	{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student usn");
        String usn=sc.nextLine();
        System.out.println("Enter Student name");
        String name=sc.nextLine();
	System.out.println("Enter Student address");
        String adr=sc.nextLine();
	System.out.println("Enter Student email");
        String email=sc.nextLine();
	System.out.println("Enter Student branch(MCA,MTECH OR BTECH?)");
        String branch=sc.nextLine();
      
	student st =new student();
	st.read(usn,name,adr,email,branch);
	System.out.println("---------------------------");
	System.out.println("---------------------------");
	st.display();
	st.calfees();
	
	
}
}

