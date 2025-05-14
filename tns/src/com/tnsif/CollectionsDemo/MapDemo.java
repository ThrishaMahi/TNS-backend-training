package com.tnsif.CollectionsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		//HashMap--> not following insertion order & no duplicates
		Map<String,Integer> m=new HashMap<String,Integer>();
		
		m.put("AIML",69);
		m.put("DS",78);
		m.put("CS",65);
		m.put("CC",80);
		m.put("OS",75);
		m.put("OS",75);
		//for(String n:m)
		//{Sop(n)}
		System.out.println("Subject   Marks");
		for(Map.Entry<String, Integer> entry:m.entrySet()) {
		System.out.println(entry.getKey()+","+entry.getValue());
		}
		
		//LinkedHashMap- no duplicates& preserves insertion order
 Map<String,Integer> lm=new LinkedHashMap<String,Integer>();
		
		lm.put("AIML",69);
		lm.put("DS",78);
		lm.put("CS",65);
		lm.put("CC",80);
		lm.put("CC",80);
		lm.put("OS",75);
		//for(String n:m)
		//{Sop(n)}
		System.out.println("LinkedHashmap output");
		for(Map.Entry<String, Integer> entry:lm.entrySet()) {
		System.out.println(entry.getKey()+","+entry.getValue());
		}
		
		
		//TreeMap- no duplicates , natural sorting
		  Map<String,Integer> tm=new TreeMap<String,Integer>();
				
				tm.put("AIML",69);
				tm.put("DS",78);
				tm.put("CS",65);
				tm.put("CC",80);
				tm.put("CC",80);
				tm.put("OS",75);
				//for(String n:m)
				//{Sop(n)}
				System.out.println("Treemap output");
				for(Map.Entry<String, Integer> entry:tm.entrySet()) {
				System.out.println(entry.getKey()+","+entry.getValue());
				}	
	}


}
