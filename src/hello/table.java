package hello;
import java.util.*;
public class table {
public static void main (String args[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number for which you want to print table");
	int a=sc.nextInt();
	System.out.println("enter the limit of the table");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		System.out.println(a+"*"+i+"="+(a*i));
	}
	
	
}
}
