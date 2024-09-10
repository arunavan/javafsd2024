package com.training.day13.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionsListDemo1 {

	public static void main(String[] args) {
		
		//List<Object>l=new ArrayList<>();
		//List l=new LinkedList();  //fast , frequent changes
		Vector<Object> l=new Vector<>();  //slow legacy
		
		
		l.add(4);
		l.add("java");
		l.add(4);
		l.add("java");
		l.add(4);
		l.add("java");
		l.add(new Date());
		l.add(98.89);
		l.add(23l);
		l.add(4.5f);
		
		l.remove(3);
		//l.clear();
		System.out.println(l.contains("java"));
		System.out.println(l.indexOf(98.89));
		System.out.println(l.lastIndexOf(4));
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		
		List<Object> l2=new ArrayList<>();
		l2.add(34);
		l2.add(56);
		l2.add(67);
		
		l.addAll(l2);
		System.out.println(l);
		
		//l.removeAll(l2);
		//l.retainAll(l2);
		System.out.println(l.containsAll(l2));
		System.out.println(l);
		
		
		/*
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i));
		*/
		
		/*
		for(Object o : l)
			System.out.println(o);
		*/
		
		List<Integer> l3=Arrays.asList(3,2,5,6);
		
		Iterator<Object> i=l.iterator();
		while(i.hasNext())
		{	System.out.println(i.next());
		}
		System.out.println(" enumeration======== using enum");
		Enumeration<Object> e=l.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	
		Stack<Object> s=new Stack<>();  //push, pop...
		s.push(34);
		s.push(12);
		s.push(56);
		System.out.println(s.pop());
		
		
		
	}

}
