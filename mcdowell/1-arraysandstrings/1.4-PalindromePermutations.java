// Given astring, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words

import java.util.*;
import java.lang.Object.*;

class PalindromePermutations {

public static void main (String [] args) {
	System.out.println(isPalindrome("asdfasdf"));
	System.out.println(isPalindrome("tact coa"));
	System.out.println(isPalindrome("racecar"));
	System.out.println(isPalindrome("race ace caacer"));
	System.out.println(isPalindrome("rce ace caacer"));

}

static boolean isPalindrome(String str){
	Map<Character, Integer> countMap = new LinkedHashMap<>();
	for (int i = 0; i < str.length(); i++){
		Character currentChar = str.charAt(i);
		if (currentChar == ' '){
			continue;
		}
		if (countMap.containsKey(currentChar)){
			countMap.put(currentChar, countMap.get(currentChar) + 1);
		}else{
			countMap.put(currentChar, 1);
		}
	}
	
	Set<Character> keys = countMap.keySet();
	boolean oddChar = false;
	for (Character currentChar : keys){
		if (countMap.get(currentChar) % 2 == 1){
			if (oddChar) return false;
			oddChar = true;
		}
	}
	return true;
}
}
