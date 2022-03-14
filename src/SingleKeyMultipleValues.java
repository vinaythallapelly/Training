import java.util.*;
public class SingleKeyMultipleValues
{
    public static void main(String[]args)
    {
        Map<Integer,List<String>> map=new HashMap<>();
        List<String> list =new ArrayList<>();
        list.add("harish");
        list.add("mech");
        List<String> list1 =new ArrayList<>();
        list1.add("vinay");
        list1.add("eee");
        List<String> list2 =new ArrayList<>();
        list2.add("rudra");
        list2.add("mech");
        map.put(101,list);
        map.put(102,list1);
        map.put(103,list2);
        for(Map.Entry entry: map.entrySet())
        {

            System.out.println("Key:"+entry.getKey()+"Values:"+entry.getValue());

        }

    }

}
