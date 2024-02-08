import java.util.HashMap;
import java.util.Map;

public class hashMapFunction {
    public static void main(String[] args) {
        HashMap<Integer,String>hashmap=new HashMap<>();
        //...functionality of put() function .....//
        hashmap.put(1,"priya");
        hashmap.put(3,"Asha");
        hashmap.put(5,"Karan");
        hashmap.put(8,"Astha");
        System.out.println("Hashmap of the the given data is:"+hashmap);
        //....functionality of get() function.//
        String result=hashmap.get(3);
        System.out.println("Value for the given key is:"+result);
        //...functionality of contsniskey() function...//
        System.out.println(hashmap.containsKey(2));
        //....functionality of remove() function...//
        hashmap.remove(1);
        System.out.println("updated hashmap:"+hashmap);
        //.....iteration using the for loop...//
        for(Map.Entry<Integer,String>e:hashmap.entrySet()){
            System.out.println("Hashmap is: ");
            System.out.println(+e.getKey()+":"+e.getValue());
        }
    }
}
