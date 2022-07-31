package assingmentAccount.day4;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Employee e1= new Employee(12,"Ali",200,20,"java");
        Employee e2= new Employee(13,"Ali",200,20,"java");
        Employee e3= new Employee(14,"Ali",200,20,"java");
        Employee e4= new Employee(15,"Ali",200,20,"java");

        TreeSet <Employee> set = new TreeSet<>();

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        System.out.println(set);





    }
}
