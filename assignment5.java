import java.util.*;
public class username {
	public static final int USERNAME_LENGTH = 8;
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the USERNAME");
		str=sc.nextLine();
		if(is_valid_username(str))
		{
			System.out.print("Username valid");
		}
		else
		{
			System.out.print("Username invalid");

		}

	}
    public static boolean is_valid_username(String un) {
        if (un.length() < USERNAME_LENGTH) return false;
        int len=un.length();
        if(un.charAt(len-4)=='_') {
        	if(un.charAt(len-3)=='j') {
        		if(un.charAt(len-2)=='o') {
        			if(un.charAt(len-1)=='b') {
        				return true;
        	        	
        			
        		}
        		
        	}
        	
        	}
            	
        }
        return false;
    }


}
