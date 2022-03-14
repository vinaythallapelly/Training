import java.util.*;

public class Collections
{
    public static void main(String[]args)
    {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for(int i=list.size()-1;i>=0;i--)

        {
           list.add(i);
        }
        System.out.println(list.size());
        System.out.println(list);
    }
}
