//Java Program to find the maximum and minimum occurring character in a string
import java.util.*;
public class program2  
{
   public static void main(String[] args) 
   {    
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
      int[] l=new int[str.length()];    
      char minchar=str.charAt(0), maxchar=str.charAt(0);    
      int i, j, min, max;            
      char str2[]=str.toCharArray();    
      for(i=0;i<str2.length;i++) 
	  {    
          l[i]=1;    
          for(j=i+1;j<str2.length;j++) 
		  {    
              if(str2[i]==str2[j] && str2[i]!=' ' && str2[i]!='0') 
			  {    
                  l[i]++;    
                      
                  str2[j]='0';    
              }    
          }    
      }    
      min=max=l[0];    
      for(i=0;i<l.length;i++) 
	  {    
          if(min>l[i] && l[i]!='0') 
		  {    
              min=l[i];    
              minchar=str2[i];    
          }    
          if(max<l[i]) 
		  {    
              max=l[i];    
              maxchar=str2[i];    
          }    
      }             
      System.out.println("Minimum occurring character: " + minchar);    
      System.out.println("Maximum occurring character: " + maxchar);    
  }  
}
