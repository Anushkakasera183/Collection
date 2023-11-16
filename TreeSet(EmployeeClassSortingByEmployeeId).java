// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Employee e1 = new Employee("ANUSHKA", 100);
        Employee e2 = new Employee("RAVI", 107);
        Employee e3 = new Employee("HARRY", 1400);
        Employee e4 = new Employee("PRIYANKA", 1000);
        Employee e5 = new Employee("ANUSHKA", 100);
        TreeSet t= new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);
    }
}
class Employee implements Comparable {
    int id ;
    String name ;
    Employee( String name, int id  ){
        this.id =id ;
        this.name=name;
    }
    public String toString(){
        return name+" "+id;
    }
    public int compareTo (Object obj ){
        int id1= this.id;
        Employee e1= (Employee)obj;
        int id2=e1.id;
        if(id1>id2)
        return -1;
        else if (id1<id2)
        return +1;
        else
        return 0;
    }
}

//output [HARRY 1400, PRIYANKA 1000, RAVI 107, ANUSHKA 100]
