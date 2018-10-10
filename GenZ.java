import java.util.ArrayList;
import java.util.Date;

public class GenZ
{

    public static void main(String[] args)
    { 
                
                  System.out.println("one day i will learn");
                  Comparable<Date> d =  new Date();
                  System.out.println(d.compareTo(new Date(2008,1,1)));
                
                  ArrayList list = new ArrayList();
                  list.add(d);
                  list.add(new Integer(4));
                  for (Object o: list)
                  {
                      System.out.println(o);
                  }
     }
    

}
