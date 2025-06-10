import java.util.*;

public class coll {
    public static void main(String[] args) 
    {
        Collection<Integer> mylist = new ArrayList<Integer>();

        mylist.add(1);
        mylist.add(2);

        Iterator<Integer> it =mylist.iterator();

        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        // }

        // for(int a: mylist)
        // {
        //     System.out.println(a);
        // }



        /////
        
        Collection<Integer> myset= new HashSet<Integer> ();
        
        myset.add(3);
        myset.add(4);
        myset.add(1);
        myset.add(2);
        myset.add(1);
        myset.add(2);
       


        Iterator<Integer> it2=myset.iterator();

        while(it2.hasNext())
        {
            System.out.println(it2.next());
        }


        //////////
        
        Map<String, Integer> mymap = new HashMap<String, Integer>();

        mymap.put("Name", 1);
        mymap.put("City", 2);
        mymap.put("Name", 3);
        mymap.put("City", 34);

        for(String s: mymap.keySet())
        {
            System.out.println("Key: " + s + " Value: " + mymap.get(s));
        }


    }
}
