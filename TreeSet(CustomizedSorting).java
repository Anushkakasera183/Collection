import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    TreeSet t= new TreeSet(new myComparator());
    t.add(0);
    t.add(56);
    t.add(89);
    t.add(8);
    t.add(16);
    t.add(0);
    System.out.println(t);
    }
}
class myComparator implements Comparator {
    public int compare(Object obj1, Object obj2 ){
        Integer i1= (Integer)obj1;
        Integer i2= (Integer)obj2;
        if(i1>i2){
            return (-1);
        }
        else if (i1<i2){
            return( +1);
        }
        else {
            return(0);
        }
    }
}

// output [89, 56, 16, 8, 0]
