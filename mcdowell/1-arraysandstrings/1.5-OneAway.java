// There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a charcter. Given two strings, write a function to check if they are one edit (or zero edits) away

import java.util.*;
import java.lang.Object.*;

class OneAway {

public static void main (String [] args) {
	System.out.println(isOneEditAway("pale", "ple"));
	System.out.println(isOneEditAway("pales", "pale"));
	System.out.println(isOneEditAway("pale", "bale"));
	System.out.println(isOneEditAway("pale", "bake"));
}

static boolean isOneEditAway(String one, String two){
	if (one.length() > two.length() + 1 || one.length() < two.length() - 1) return false;

	boolean foundAnEdit = false;
	int twoOffset = 0;
	for (int oneIndex = 0; oneIndex < one.length(); oneIndex++) {
		if (oneIndex >= two.length()) break;

		if (one.charAt(oneIndex) == two.charAt(oneIndex + twoOffset)){
			continue;
		} else if (foundAnEdit) {
			return false;
		} else {	
			foundAnEdit = true;
			if (oneIndex+1 < one.length()){
				// char inserted in string 1 at current position
				// char was deleted in string 2 at current position
				if (one.charAt(oneIndex+1) == two.charAt(oneIndex)){
					twoOffset = -1;
					continue;
				}
			}
			
			if (oneIndex+1 < two.length()){
				// char inserted in string 2 at current position
				// char deleted in string 1 at current position
				if (one.charAt(oneIndex) == two.charAt(oneIndex+1)){
					twoOffset = 1;
					continue;
				}
				
			}

			if (oneIndex+1 < two.length() && oneIndex+1 < one.length()){
				// char inserted at current position in either string
				if (one.charAt(oneIndex+1) == two.charAt(oneIndex+1)){
					continue;
				}
			}
			return false;
		}
	}
	return true;
}
}
