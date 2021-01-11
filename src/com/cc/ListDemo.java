package com.cc;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("hechixueyuan");
        list.add(888.8F);
        list.add(false);
        list.add(1);
        System.out.println("当前元素"+list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
