// Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

import java.util.*;
import java.lang.Object.*;

class isUnique {

public static void main (String [] args) {
	System.out.println(allCharsUnique(""));
	System.out.println(allCharsUnique("asdf"));
	System.out.println(allCharsUnique("asdfasdf"));

	System.out.println(allCharsUniqueNoHashSet(""));
	System.out.println(allCharsUniqueNoHashSet("asdf"));
	System.out.println(allCharsUniqueNoHashSet("asdfasdf"));
}

// O(n)
static boolean allCharsUnique(String string){
	Set<Character> charSet = new HashSet<>();
	for (int i = 0; i < string.length(); i++){
		if (charSet.contains(string.charAt(i))){
			return false;
		}
		charSet.add(string.charAt(i));
	}
	return true;
}

// O(n^2)
static boolean allCharsUniqueNoHashSet(String string) {
	for (int i = 0; i < string.length(); i++){
		for (int j = i+1; j < string.length(); j++){
			if (string.charAt(i) == string.charAt(j)){
				return false;
			}
		}
	}
	return true;
} 
}
