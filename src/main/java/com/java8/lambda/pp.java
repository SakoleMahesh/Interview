package com.java8.lambda;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class pp {
	public static void main(String[] args) {
		Map<Integer, Integer> Tree = new TreeMap<Integer, Integer>();
		Tree.put(1, 1);
		Tree.put(1, 1);
		Tree.put(1, 1);
		Tree.put(2, 2);
		Tree.put(2, null);
		Tree.put(3, null);

		System.out.println(Tree);
		Set<Integer> set = new HashSet<Integer>();
		set.add(null);
		set.add(null);
		set.add(1);
		set.add(2);
		System.out.println(set);

		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		hash.put(1, 2);
		hash.put(2, 2);
		hash.put(13, 2);
		hash.put(43, 2);
		hash.put(123, 2);
		System.out.println(hash);
		Integer key=null;
		Iterator<Integer> itr = hash.keySet().iterator();
		while (itr.hasNext()) {
			 key = itr.next();
			
			System.out.println("Key: " + key + " Value: " + hash.get(key));
		}
		if (hash.get(key) == 2) {
			itr.remove();
		}
		System.out.println(hash);
		
	}

}
