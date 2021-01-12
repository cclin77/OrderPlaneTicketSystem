package com.cc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add("hechixueyuan");
        set.add(888.8F);
        set.add(false);
        set.add(1);
        System.out.println(set.size());

    }
}
