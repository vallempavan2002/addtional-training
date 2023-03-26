//import java.nio.file.ProviderMismatchException;

// marks addition 

import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class hashmap
{
    public static void main(String[] args) {
        HashMap<String,Integer> m=new HashMap<>();
        m.put("a",1);
        m.put("b",2);
        m.put("c",3);
        m.remove("b");
        System.out.println(m);

        Set<String>a=m.keySet();
        System.out.println(a);
        Set<Integer>b=m.keySet();
        System.out.println(b);

        
        
    }
}