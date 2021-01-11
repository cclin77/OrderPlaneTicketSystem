package com.cc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        List list = new ArrayList();
        list.set(1);
        list.set("hechixueyuan");
        list.set(888.8F);
        list.set(false);
        list.set(1);
        System.out.println("当前元素"+list.size());
    }
}
