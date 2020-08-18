package com.cg.array;

import java.util.LinkedHashSet;

public class LinkedHashsetBookex {

	  
    int id;  
   String name,author,publisher;  
   int quantity;  
   public LinkedHashsetBookex(int id, String name, String author, String publisher, int quantity) {  
       this.id = id;  
       this.name = name;  
       this.author = author;  
       this.publisher = publisher;  
       this.quantity = quantity;  
   }  
    
    
   public static void main(String[] args) {  
       LinkedHashSet<LinkedHashsetBookex> hs=new LinkedHashSet<LinkedHashsetBookex>();  
       //Creating Books  
       LinkedHashsetBookex b1=new LinkedHashsetBookex(101,"Let us C","Yashwant Kanetkar","BPB",8);  
       LinkedHashsetBookex b2=new LinkedHashsetBookex(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
       LinkedHashsetBookex b3=new LinkedHashsetBookex(103,"Operating System","Galvin","Wiley",6);  
       //Adding Books to hash table  
       hs.add(b1);  
       hs.add(b2);  
       hs.add(b3);  
       //Traversing hash table  
       for(LinkedHashsetBookex b:hs){  
       System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
       }  
   }  
   }  




	

