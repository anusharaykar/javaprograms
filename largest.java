import java.util.*;
 public class largest
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size for an array");
	int n=s.nextInt();
	if(n<3)
	{
		System.out.println("no of elements should be more than 2");
	}
	else{
		
	int large=0,secondlarge=0;
	System.out.println("enter "+n+" numbers");
	
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		
		arr[i]=s.nextInt();
	    
	} 
	Arrays.sort(arr);
	large=arr[n-1];
	
	for(int i=n-2;i<n;i--)
	{
	   if(large>arr[i])
	   {
		    secondlarge=arr[i];
		    break;
	    }
		
	 }
	
	System.out.println("largest element in an array:"+large);
	System.out.println("second largest element in an array:"+secondlarge);
 }
}
	
	
 }

