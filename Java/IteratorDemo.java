package com.snraja;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class IteratorDemo
{
	public void failFastForLoop()
	{
		List<String> namesList = new ArrayList<String>();
		namesList.add("ForOne");
		namesList.add("ForTwo");
		namesList.add("ForThree");
		namesList.add("ForFour");
		for(int counter=0; counter < namesList.size(); counter++) 
		{
			if(counter == 2) {
				namesList.add("ForTen");
			}
		}
		System.out.println(namesList);
	}
	
	public void failFast()
	{
		List<String> namesList = new ArrayList<String>();
		namesList.add("One");
		namesList.add("Two");
		namesList.add("Three");
		namesList.add("Four");
		
		for (String str : namesList)
		{
			System.out.println(str);
			if(str.equals("Two")) {
				namesList.add("Five");
			}
		}
	}
	
	public void failSafe()
	{
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();
		chm.put("KA", "Karnataka");
		chm.put("TS", "Telangana");
		chm.put("AP", "Andhra Pradesh");
		
		Iterator<String> it = chm.keySet().iterator();
		while(it.hasNext())
		{
			String key = it.next();
			System.out.println(key);
			if(key.equals("TS")) {
				chm.put("TN", "Tamil Nadu");
			}
		}

		System.out.println("All Keys " + chm.keySet());
	}
	
	
	public static void main(String[] args) 
	{
		IteratorDemo is = new IteratorDemo();
		
		is.failFastForLoop();
		
		try {
			is.failFast(); // Will throw exception - ConcurrentModificationException
		}catch(Exception e) {
			System.out.println("Exception Thrown");
			System.out.println(e.getClass().toGenericString());
		}
		
		is.failSafe();
	}
}
