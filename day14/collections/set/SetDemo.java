package com.training.day14.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// unique, indexing is not possible

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();  //Generic 
	//	Set set=new HashSet();  // not ordered
		
	//	Set set=new LinkedHashSet();  // maintains insertion order,pointers 
		
	//	Set set=new TreeSet();// sorted set, comparator 
		//List set=new ArrayList();
		set.add(324);
		set.add(34);
		set.add(47);
		set.add(12);
		set.add(89);
		set.add(44);
		set.add(12);
		set.add(89);
		set.add(44);
		System.out.println(set);
		
		
		Set<Integer> s1=new HashSet<>();
		s1.add(99);
		s1.add(78);
		s1.add(45);
		set.addAll(s1);
		set.remove(12);
	//	set.clear();
		System.out.println(set.isEmpty());
		//System.out.println(set.indexOf(89));
		System.out.println(set.size());
		System.out.println(set.contains(44));
		
		System.out.println(" ===for - each loop====");
		for(Object s: set)
			System.out.println(s);
		
		System.out.println(" ===iterator====");
		Iterator<Integer> i=set.iterator();
		while(i.hasNext())
		{	System.out.println(i.next());
		}
		
		//TreeSet<String> names=new TreeSet<>();
		//LinkedHashSet<String> names=new LinkedHashSet<>();
		HashSet<String> names=new HashSet<>();
		names.add("ram");
		names.add("kiran");
		names.add("bindu");
		names.add("arun");
		System.out.println(names);
		
		Object ar[]=names.toArray();
		
		System.out.println(" set to array");
		
		for(int i1=0;i1<ar.length;i1++)
			System.out.println(ar[i1]);
		
		//customer set
		Set<Customer> customerSet=new LinkedHashSet<>();
		customerSet.add(new Customer(3,"ram"));
		customerSet.add(new Customer(2,"bindu"));
		customerSet.add(new Customer(1,"arun"));
		customerSet.add(new Customer(4,"kiran"));
		customerSet.add(new Customer(4,"kiran"));
		
		customerSet.add(new Customer(2,"bindu"));
		customerSet.add(new Customer(2,"bindu"));
		
		
		for( Customer c: customerSet) {
			System.out.println(c);
		}
		
		
	}

}
