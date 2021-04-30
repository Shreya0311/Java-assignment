import java.util.Scanner;
public class consonants {
		public static void main(String[] args) {
			String str;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the word");
			str=sc.nextLine();
			StringBuffer buf = new StringBuffer(str);

			int s=str.length();
			int i;
			for(i=0;i<s;i++) {
				char ch=str.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					System.out.print(ch);

				}
				else {
		            ch = (char)(ch + 1);
				System.out.print(ch);
				}

			}
		}
	}
