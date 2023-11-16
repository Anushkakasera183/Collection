// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        TreeSet t= new TreeSet(new myComparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("ANUSHKA"));
        t.add(new StringBuffer("Anushka"));
        t.add(new StringBuffer("anushka"));
        t.add(new StringBuffer("a"));
        t.add(new StringBuffer("Z"));
      //  t.add(11118);
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
