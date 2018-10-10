import java.util.ArrayList;
import java.util.Date;

public class GenZ
{

    public static void main(String[] args)
    { 
                
                  System.out.println("one day i will learn");
                  Comparable<Date> d =  new Date();
                  System.out.println(d.compareTo(new Date(2008,1,1)));
                
                  ArrayList<? extends Number> nlist = new ArrayList<>();
                  ArrayList<? super Integer> xnlist = new ArrayList<>();
                  ArrayList<Integer> list = new ArrayList<>();
                  nlist = list;
                  list.add(d);
                  list.add(new Integer(4));
                  list.add(new Integer(44));
                  list.add(new Integer(44));
                  list.add(new String("a"));
                  Integer sum = 0;
                  
                  for (Number o: nlist)
                  {
                      System.out.println(o);
                      sum += (Integer)o;
                      
                  }
                  System.out.println(sum);
     }
    
    

}
