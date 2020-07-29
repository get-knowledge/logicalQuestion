package com.gobeyond.question;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
	
	
	public static void duplicateCharacters(String str) {
		
		char[] strArray = str.toCharArray();
		
		Map<Character, Integer> mapDuplicateChar = new HashMap<>();
		
		
		for(Character ch:strArray) {
			
			if(mapDuplicateChar.containsKey(ch)) {
				mapDuplicateChar.put(ch, mapDuplicateChar.get(ch)+1);
				
			}else {
				mapDuplicateChar.put(ch, 1);
			}
		}
		
		mapDuplicateChar.forEach((key,val)->{
			
			if(val>1) {
                System.out.printf("%s : %d %n", key, val);
			}
			
		});
		
	}

	
	public static void main(String a[]) {
		
		duplicateCharacters("programming");
		
	}
	
}
