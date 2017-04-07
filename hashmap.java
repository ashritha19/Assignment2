import java.util.*;  
class Hashmap{  
 public static void main(String args[]){  
  HashMap<Integer,String> hmap=new HashMap<Integer,String>();  
  hmap.put(100,"Amit");  
  hmap.put(101,"Vijay");  
  hmap.put(102,"Rahul");  
  for(Map.Entry m:hmap.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  
