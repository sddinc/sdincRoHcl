package assingmentAccount.myTutorials.StreamApi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<User> users= new ArrayList<>();
        users.add(new User(2,"ali",230));
        users.add(new User(3,"Cemal",120));
        users.add(new User(4,"Sergiu",200));
        users.add(new User(5,"Alex",300));

        //users.stream().forEach(System.out::println);
        users.stream().forEach(x->
        {  //System.out.println(x.toString());
            users.stream().forEach(t->t.talk());
        });
        long nr=users.stream().filter(s->s.id>3).count();

       // System.out.println(nr);
        /*
        List <User> filteredList=users
                .stream()
                .filter(a->a.id>3)
                .collect(Collectors.toList());
        filteredList.stream().forEach(User::talk);
        */
        List <User>mappedList=users.stream()
                .map(monay->new User(monay.id,monay.name, (monay.salary)+100))
                .collect(Collectors.toList());
        mappedList.stream()
                .forEach(r-> System.out.println(r.toString()));
        //convert to toMap

        Map<Integer,String> userMap= users
                                    .stream()
                                    .collect(Collectors
                                    .toMap(user->user.id,user->user.name));
        userMap.forEach((k,v)-> System.out.println(k+":"+v));
    }
}

class User{
    int id;
    String name;
    int salary;
    public User(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "user [id="+id+",name"+name+"="+salary+"]";
    }

    public void talk(){
        System.out.println("Hi, I am"+this.name);
    }
}