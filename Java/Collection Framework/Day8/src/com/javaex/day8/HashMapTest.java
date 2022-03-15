package com.javaex.day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> map = new HashMap<>(); // new에서 타입 파라미터 생략가능
		System.out.println(map);
		
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("mango", "망고");
		System.out.println(map);
		
		map.remove("banana"); // 키 값 banana 제거
		System.out.println(map);
		
		map.put("kiwi", "키");
		// map.clear(); // 모든 값 제거
		
		
		System.out.println("");
		
		
		// entrySet() 활용하여 출력 (entrydata로 받아온 결과)
		for (Entry<String, String> entry : map.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		
		
		System.out.println("");
		
		
		//entrySet().iterator()
		Iterator<Entry<String, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
		    Map.Entry<String, String> entry = entries.next();
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
		}
		
		
		System.out.println("");
		
		
		//keySet().iterator()
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()){
		    String key = keys.next();
		    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
		}
	}

}
