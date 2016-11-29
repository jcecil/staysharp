// Write a method to replace all spaces in a string with "%20". You may assume that the string has sufficient space at the end to hold the additional characters, and that you are give the "true" length of the string. (Note: if implementing in Java, please use a charcter array so that you can perform this operation in place)

import java.util.*;
import java.lang.Object.*;

class URLify {

public static void main (String [] args) {
	char[] charArray = "Mr John Smith    ".toCharArray();
	urlify(charArray, 13);
	System.out.println(charArray);

}

static void urlify(char[] charArray, int length){
	for (int i = 0; i < length; i++){
		if (charArray[i] == ' '){
			for (int j = charArray.length-1; j > i+2; j--){
				charArray[j] = charArray[j-2];
			}
			charArray[i] = '%';
			charArray[i+1] = '2';
			charArray[i+2] = '0';
			i+=2;
			}
		}
	}
}
