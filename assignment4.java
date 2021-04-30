import java.util.Scanner;
public class positivestring {
	public static void main(String[] args) {
		String str;
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		str=sc.nextLine();
		n= str.length();
		for(i=1;i<n;i++)
		{
			if(str.charAt(i)<str.charAt(i-1)) {
				break;
			}
			
		}
		if(i==n) 
			System.out.println("Positive String");
			
		else
			System.out.println("Not a Positive String");

	}
	}

