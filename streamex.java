import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Gatherer.Integrator;

class streamex
{
    public static void main(String[] args) 
    {
        List<Integer> l1=new ArrayList<Integer>();

        l1.add(1);
        l1.add(2);
        l1.add(8);
        l1.add(3);
        l1.add(4);
        l1.add(0);


        // For each 

        l1.forEach((n)->{
            n+=1;
            System.out.println(n);
        }); 

        // Stream <Integer> s1=l1.stream();
        // Stream <Integer> s2=s1.filter((n)-> n%2==0);
        // Stream <Integer> s3=s2.map((n)->n+1); 
        // int i4=s3.reduce(0,(c,e)-> {
        //     return c+e;
        // });

        Stream<Integer> s1=l1.stream();
        Stream<Integer> s2=s1.filter((n)->n%2==0);
        Stream<Integer> s3=s2.map((n)->n*2);
        int i4=s3.reduce(0,(c,n)-> c+n);

        System.out.println("Final op from stream : "+ i4);


    }
}