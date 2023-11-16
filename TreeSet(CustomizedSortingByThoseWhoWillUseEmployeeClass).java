// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Default sorting by those who created employee class based on employee id ");
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
        TreeSet t1= new TreeSet(new myComparator ());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println("Customized Sorting by those who are using employee class based on employee name ");
        System.out.println(t1);
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
        return +1;
        else if (id1<id2)
        return -1;
        else
        return 0;
    }
}
class myComparator implements Comparator {
    public int compare(Object obj1, Object obj2){
        Employee e1= (Employee)obj1;
        Employee e2=(Employee)obj2;
        String name1= e1.name;
        String name2= e2.name;
        return name1.compareTo(name2);
    }
}

/*//output
Default sorting by those who created employee class based on employee id 
[ANUSHKA 100, RAVI 107, PRIYANKA 1000, HARRY 1400]
Customized Sorting by those who are using employee class based on employee name 
[ANUSHKA 100, HARRY 1400, PRIYANKA 1000, RAVI 107]
*/
