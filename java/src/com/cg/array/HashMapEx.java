package com.cg.array;

import java.util.HashMap;

public class HashMapEx {

    
    public static void main(String args[]) {
     
    HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
     
          hashMap.put(1, "One");
          hashMap.put(2, "Two");
          hashMap.put(3, "Three");
          hashMap.put(4, "Four");
          hashMap.put(5, "Five");
    System.out.println(hashMap);
    System.out.println("Value for the key 1 is "+hashMap.get(1));
    System.out.println("Value for the key 10 is "+hashMap.get(10));
    }
    }

