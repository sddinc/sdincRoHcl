package assingmentAccount.day4;

import java.util.*;

public class sortingThings {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(1);
        list.add(152);

        Collections.sort(list);

        System.out.println(list);



        List<String> set = new ArrayList();
        set.add("xyz");
        set.add("axyz");
        set.add("bxyz");
        set.add("cxyz");
        Collections.sort(set);
        System.out.println(set);

    }
}
