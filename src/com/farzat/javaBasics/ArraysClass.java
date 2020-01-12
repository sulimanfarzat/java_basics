/*###################################################*/
/*############# author : Suliman Farzat #############*/
/*###################################################*/

package com.farzat.javaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ArraysClass {
	
	
	// simple array
	public void simpleArray() {
		System.out.println("\n-------------simple array----------------\n");
		
		String[] s = new String[4];
		for (String string : s) {
			System.out.println(string);
		}

		int[] num = new int[2];
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		double d[] = new double[4];
		for (double dou : d) {
			System.out.println(dou);
		}

		String[] sTr = { "Suliman", "Kasem", "Farzat" };
		for (String string : sTr) {
			System.out.println(string);
		}
		System.out.println(sTr[1]);
	
	}
	
	
	// fixed array
	public void fixArray() {
		System.out.println("\n-------------fixed array----------------\n");

		int [] num;
		num = new int[5];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		System.out.println(num[0]);
		
	}
	
	
	// dynamic 2d array
	public void dynamic2dArray() {
		System.out.println("\n--------------dynamic 2d array---------------\n");

		String[][] names = { { "Suliman", "Farzat" }, { "Kasem", "Farzat" } };
		System.out.println(names[0][0] + " " + names[0][1]);
		System.out.println(names[1][0] + " " + names[1][1]);
		
	}
	
	
	// fill in dynamic 2d Array with append text
	public void fillInDynamic2dArray() {
		System.out.println("\n--------------fill in dynamic 2d Array---------------\n");
		
		String [][] employees = new String [2][2];
		employees[0][0] = "Suliman";
		employees[0][1] = "is 24 years old";
		employees[1][0] = "Kasem";
		employees[1][1] = "is 1 years old";
		
		for (int i = 0; i < employees.length; i++) {
			StringBuilder text = new StringBuilder();
			for (int j = 0; j < employees.length; j++) {
				if (j == 0 ) {
					text.append(" name: ");
				} else {
					text.append(" , he is: ");
				}
				text.append(employees[i][j]);
			}
			System.out.println(text);
		}
		
	}
	
	
	// list array
	public void listArray() {
		System.out.println("\n-------------list array----------------\n");
		
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Suliman");
		namesList.add("Kasem");
		namesList.add("Aime");
		namesList.add("Iman");
		System.out.println(namesList);
		
		// add
		namesList.add("Dolly");
		namesList.add("Dham");
		System.out.println(namesList);
		
		// remove
		namesList.remove(1);
		System.out.println(namesList);
		
		// get
		String name = namesList.get(2);
		System.out.println(name);
		
		// position
		int pos = namesList.indexOf("Iman");
		System.out.println(pos);
		
	}
	
	
	// hash map array
	public void hashMapArray() {
		System.out.println("\n--------------hash map array---------------\n");

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name1", "Suliman");
		hm.put("name2", "Kasem");
		hm.put("name3", "Aime");
		System.out.println(hm);
		
		// put
		hm.put("name4", "Iman");
		hm.put("name5", "Dolly");
		System.out.println(hm);
		
		// get
		String str = hm.get("name2");
		System.out.println(str);
		
		// remove
		hm.remove("name3");
		System.out.println(hm);
	
	}

	
	// Array List with list Iterators
	public void listIteratorsArray() {
		System.out.println("\n--------------ArrayList ListIterator---------------\n");

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println(list);
		
		ListIterator<Integer> listIterator1 = list.listIterator();
		while (listIterator1.hasNext()) {
			Integer value = listIterator1.next();
			System.out.println(value);
		}

	}
	
	
	// hash map array with Iterators
	public void iteratorsArray() {
		System.out.println("\n--------------HashMap Iterators---------------\n");
		
		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("animal 1", "cat");
		hm2.put("animal 2", "dog");
		hm2.put("animal 3", "lion");
		System.out.println(hm2);
		
		Set<String> keys = hm2.keySet();
		Iterator<String> iterator2 = keys.iterator();
		while (iterator2.hasNext()) {
			String key = iterator2.next(); // get key
			String value = hm2.get(key); // get value
			System.out.println(key + " : " + value);
		}
	}
	


}
