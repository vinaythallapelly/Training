import java.util.*;
public class RCollections
{
    public static void main(String[]args)
    {
        List <String> list =new ArrayList<String>();
        list.add("harish");
        list.add("vinay");
        list.add("rudra");
        list.add("mahesh");
        list.add("naresh");
        list.add(0,"mani");
        list.set(0,"ravi");
        System.out.println(list.size());
        System.out.println(list);
        for(String x:list)
        {
            System.out.println(x);
        }
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i));
        }
    }
}
