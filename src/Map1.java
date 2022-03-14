import java.util.HashMap;
import java.util.*;

public class Map1
{
    public static void main(String[]args)
    {
        Map<Integer, String> map=new HashMap<Integer,String>();
        map.put(101,"CSE");
        map.put(102,"CSE");
        map.put(103,"ECE");
        Map<Integer,String> map1=new HashMap<Integer,String>();
        map1.put(101,"GOPI");
        map1.put(102,"RAMA");
        map1.put(103,"MAHESH");

        Set <Integer> keys=map.keySet();
        Set <String> values=new HashSet<String>();
        for(Integer key:keys)
        {
            if(map.get(key).equals("CSE"))
            {
                values.add(String.valueOf(key));
            }
        }
    }
}
