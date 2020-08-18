package com.cg.array;

import java.util.HashMap;
import java.util.Set;

public class HashMApRetrieve {


    public static void main(String args[]) {
    
    HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
          hashMap.put(1, "One");
          hashMap.put(2, "Two");
          hashMap.put(3, "Three");
    Set<Integer> keys = hashMap.keySet();
    System.out.println("All the keys of HashMap....");
    System.out.println(keys);
    
    }
    }
	

