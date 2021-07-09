package exam;
import java.util.*;


public class map1 {

 public static HashMap<Integer, Integer> method(int[] array) {
   HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

   for (int n: array) {
     map.put( n, n*n);
   }
   return map;
 }

 public static void main(String[] args) {
   int array[] = new int[]{1,2,3,4,5,6,7,8,9};
   HashMap<Integer, Integer> map = method(array);

   Iterator<Integer> it = map.keySet().iterator();
   while(it.hasNext()){
   Integer key = it.next();
     System.out.println(key + " : " + map.get(key));
   }
 }
}

