// Given two strings, write a method to decide if one is a permutation of the other

import java.util.*;
import java.lang.Object.*;

class CheckPermutation {

public static void main (String [] args) {
	System.out.println(isPermutation("", "asdf"));
	System.out.println(isPermutation("asd", "asdf"));
	System.out.println(isPermutation("asdf", "asdf"));
	System.out.println(isPermutation("aisondf", "asznznd"));
	System.out.println(isPermutation("123123123f", "123123123f"));

}

static boolean isPermutation(String string1, String string2){
	if (string1.length() != string2.length()) return false;

	Map<Character, Integer> counts = new HashMap<>();
	for (int i = 0; i < string1.length(); i++){
		Character currentChar = string1.charAt(i);
		if (counts.containsKey(currentChar)){
			counts.put(currentChar, counts.get(currentChar) + 1);
		}else{
			counts.put(currentChar, 1);
		}
	}
	for (int i = 0; i < string2.length(); i++){
		Character currentChar = string2.charAt(i);
		if (!counts.containsKey(currentChar)){
			return false;
		}
		counts.put(currentChar, counts.get(currentChar) - 1);
		if (counts.get(currentChar) == 0){
			counts.remove(currentChar);
		}
	}
	return true;
}
}
