import java.util.*;

public class example {
 
   public static void removeDuplicates(int[] a)
   {
       LinkedHashSet<Integer> set
           = new LinkedHashSet<Integer>();
 
      for (int i = 0; i < a.length; i++)
           set.add(a[i]);
 
      System.out.print(set);
   }
 
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of array");
       int n=sc.nextInt();
       int a[] = new int[n];

       System.out.println("enter the array");

       for(int i =0;i<n;i++)
    	   a[i]=sc.nextInt();
       System.out.println(" array before");

       for(int i =0;i<n;i++)
           System.out.println(a[i]);

       removeDuplicates(a);
   }
}
