import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator
public class ConcurrentHashMap
{
   
    public static void main(String[] args)
    {
        ConcurrentHashMap<String,String> Phone = new ConcurrentHashMap<String,String>();
        Phone.put("Apple", "iPhone6");
        Phone.put("HTC", "HTC one");
        Phone.put("Samsung","S6");
        
        Iterator iterator = Phone.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(Phone.get(iterator.next()));
            Phone.put("Sony", "Xperia Z");
        }
        
    }
    
}