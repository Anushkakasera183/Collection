import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    TreeSet t= new TreeSet();
    t.add(0);
    t.add(56);
    t.add(89);
    t.add(8);
    t.add(16);
    t.add(0);
    System.out.println(t);
    }
}
//Output [0, 8, 16, 56, 89]
