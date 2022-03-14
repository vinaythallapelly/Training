import java.util.HashMap;
import java.util.Map;

public class HashMapEx
{
    public static void main(String[]args)
    {
        Map<Integer,Book> hm=new HashMap<Integer,Book>();
        Book b1=new Book(101,"ABC","DEF","GHI",10);
        Book b2=new Book(102,"ABC2","DEF2","GHI2",15);
        Book b3=new Book(103,"ABC3","DEF3","GHI3",20);
        hm.put(1,b1);
        hm.put(2,b2);
        hm.put(3,b3);

        for(Map.Entry<Integer, Book> entry:hm.entrySet())
        {
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }


    }
}

