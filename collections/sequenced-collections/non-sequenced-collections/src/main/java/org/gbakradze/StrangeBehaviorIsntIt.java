package org.gbakradze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrangeBehaviorIsntIt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("good", "bad", "ugly"));
        for (String s : list) {
            if (s.equals("bad")) {
                list.remove(s);
            }
        }
        System.out.println(list);

        List<String> list1 = new ArrayList<>(Arrays.asList("good", "bad", "ugly", "extra"));
        for (String s : list1) {
            if (s.equals("bad")) {
                list1.remove(s);
            }
        }
        System.out.println(list1);
    }
}