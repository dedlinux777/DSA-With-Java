package practiceDSA;

import java.util.*;

public class anagram {
	public boolean isAnagram(String s, String t) {
		if(s.length()!= t.length()) {
			return false;
		}		
		char[] sSort = s.toCharArray();
		char[] tSort = s.toCharArray();
		Arrays.sort(sSort);
		Arrays.sort(tSort);
		return Arrays.equals(sSort, tSort);
    }
}
