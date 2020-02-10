package com.programming.dst.arrays;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJAva {

      private String name;

      public TestJAva(String name){
          this.name =name;
      }
        public static void main(String[] args) {

        int allowedLength = 6; // default;
        String searchPattern = "98";
        System.out.println(">>>>>>>>");


            List<TestJAva> list = new ArrayList<>();
//            list.add(new TestJAva("A"));
//            list.add(new TestJAva("B"));
//            list.add(new TestJAva("C"));

            List<String> name = list.stream().map(TestJAva::getName).collect(Collectors.toList());

            System.out.println(name);

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
