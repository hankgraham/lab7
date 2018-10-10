import java.util.ArrayList;
import java.util.Date;

public class GenZ
{

    public static void main(String[] args)
    { 
                
                  System.out.println("one day i will learn");
                  Comparable<Date> d =  new Date();
                  System.out.println(d.compareTo(new Date(2008,1,1)));
                
                  ArrayList<Integer> list = new ArrayList<>();
                  list.add(d);
                  list.add(new Integer(4));
                  list.add(new Integer(44));
                  list.add(new Integer(44));
                  list.add(new String("a"));
                  Integer sum = 0;
                  
                  for (Number o: list)
                  {
                      System.out.println(o);
                      sum += (Integer)o;
                      
                  }
                  System.out.println(sum);
     }
    
    

}
