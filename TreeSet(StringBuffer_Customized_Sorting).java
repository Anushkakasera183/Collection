// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        TreeSet t= new TreeSet(new myComparator());
        t.add("A");
        t.add("ANUSHKA");
        t.add("Anushka");
        t.add("anushka");
        t.add("a");
        t.add("Z");
        System.out.println(t);
    }
}
class myComparator implements Comparator {
    public int compare (Object obj1 , Object obj2 ){
        String s1= obj1.toString();
        String s2= obj2.toString();
        return s1.compareTo(s2);
    }
}

//output [A, ANUSHKA, Anushka, Z, a, anushka]
// ascii value for A-Z is 65-90 and a-z is 97-122
