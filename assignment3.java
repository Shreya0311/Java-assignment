import java.util.*;
import java.math.*;
public class diffNum {
	public static void main(String[] args) {
	int num,i,len,dif;
	String str;
	char ch,ch1;
	Scanner sc=new Scanner(System.in);
	StringBuffer buf = new StringBuffer();

	System.out.println("Enter the number");
	num=sc.nextInt();
	str=String.valueOf(num);
	len=str.length();
	for(i=1;i<len;i++)
	{
		ch=str.charAt(i-1);
		ch1=str.charAt(i);
		dif=Math.abs(((int)(ch)-(int)(ch1)));
		buf=buf.append(dif);
	}
	System.out.print(buf.append(str.charAt(len-1)));

	
	
	
	}
}
