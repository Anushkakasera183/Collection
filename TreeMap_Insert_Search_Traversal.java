// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        TreeMap<Integer, String> t= new TreeMap<Integer, String>();
        System.out.println("\nTreeMap successfully created ");
        t.put(1,"ANUSHKA");
        t.put(2,"Babita");
        t.put(3,"Ravikant");
        System.out.println("\nElement successfuly added in tree map ");
        int key =2;
        if (t.containsKey(key)){
            System.out.println("\n key successfully found"+" "+key);
        }
        else{
            System.out.println("\nkey not present -->"+ " "+key);
        }
        String value="anushka";
        if(t.containsValue(value)){
            System.out.println("\nvalue successfully found"+" "+value);
        }
        else{
            System.out.println("\nvalue not present -->"+ " "+value);
        }
        System.out.println("\n Displaying the TreeMap:");
        System.out.println("TreeMap: " + t);
        System.out.println("\n Traversing the TreeMap:");
        for( Map.Entry<Integer, String> h: t.entrySet()){
            System.out.println(h.getKey()+" "+h.getValue() );
        }
        
    }
}


/*
TreeMap successfully created Element successfuly added in tree map 
key successfully found 2
value not present --> anushka

 Displaying the TreeMap:
TreeMap: {1=ANUSHKA, 2=Babita, 3=Ravikant}
Traversing the TreeMap:
1 ANUSHKA
2 Babita
3 Ravikant
*/
