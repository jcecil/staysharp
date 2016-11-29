// Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring

import java.util.*;
import java.lang.Object.*;

class StringRotation{

public static void main (String [] args) {
	System.out.println(isRotation("waterbottle","erbottlewat"));	
	System.out.println(isRotation("waterbotle","erbottlewat"));	
}

// recursive? or does the zero have to exist in the original matrix?
// Setting them all to zero as oson as you see it would potentially overwrite data that hasn't been processed yet
static boolean isRotation(String s1, String s2){
	return isSubstring(s1+s1, s2);
}

static boolean isSubstring(String s1, String s2){
	return s1.indexOf(s2) > 0;
}
}
