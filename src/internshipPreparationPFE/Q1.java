package internshipPreparationPFE;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
		int val = str.charAt(i);
		if (char_set[val]) return false;
		char_set[val] = true;
		}
		return true;
		}
	
	public static boolean isUniqueChars1(String str) {
		List<Integer> listInt = new ArrayList<>();
		int asciiVal=str.charAt(0);
		listInt.add(asciiVal);
		for(int i=1;i<str.length();i++){
			if(listInt.contains(new Integer(str.charAt(i)) ))return true;
			asciiVal= str.charAt(i);
			System.out.println(asciiVal +" || "+ listInt);
			listInt.add(asciiVal);
		}
		return false;
		}

	public static void main(String[] args) {
		System.out.println(isUniqueChars1("abcdefghijk"));
		System.out.println(isUniqueChars1("abcdefghijkabcd"));

	}

}
