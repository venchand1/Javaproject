package com.cg.array;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetex {

    public static void main(String args[]){  
        LinkedHashSet<String> set=new LinkedHashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
        
        //ignores duplicate elements
        
        LinkedHashSet<String> al=new LinkedHashSet<String>();  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ravi");  
        al.add("Ajay");  
        Iterator<String> itr=al.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        }  
   }  
       
	
}
