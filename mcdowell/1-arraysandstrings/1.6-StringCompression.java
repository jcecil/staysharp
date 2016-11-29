// Implement a method to perform basic string comprehension using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a-z)

import java.util.*;
import java.lang.Object.*;

class StringCompression {

public static void main (String [] args) {
	System.out.println(compress("aabcccccaaa"));
	System.out.println(compress("aabcccccaaasdfasdfasdfa"));
}

static String compress(String string){
	StringBuilder b = new StringBuilder();

	Character currentChar = null;
	Integer count = 1;
	for (int i = 0; i < string.length(); i++){
		if (currentChar == null){
			currentChar = string.charAt(i);
			continue;
		}
		
		if (string.charAt(i) == currentChar) count++;
		else {
			b.append(currentChar);
			b.append(count.toString());
			currentChar = string.charAt(i);
			count = 1;
		}
	}
	b.append(currentChar);
	b.append(count.toString());
			
	if (b.toString().length() > string.length()) return string;
	return b.toString();
}
}
