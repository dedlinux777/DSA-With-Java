package AlphaPractice;
import java.lang.Math;
import java.util.*;

public class Strings_practice {
	
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
        for(int i = s.length()-1; i > (s.length()-1)/2 ; i--) {
        	if(s.charAt(i) != s.charAt(s.length()-1-i)) {
        		return false;
        	}
        }
        return true;
    }
	
	public double getShortestPathInPlane(String s) {
		int n = s.length();
		int x = 0, y = 0;
		
		for(int i = 0; i < n ; i++) {
			char dir = s.charAt(i);
			// North:
			if(dir == 'N') {
				y++;
			}
			else if(dir == 'S') {
				y--;
			}// south
			else if(dir == 'E') {
				x++;
			} // east
			else { // west
				x--;
			}	
		}
		double path = Math.sqrt(((x^2)-(y^2)));
		
		return path;
	}
	
	public String toUpperCaseLetters(String s) {
		StringBuilder str = new StringBuilder("");
		for(int i = 0;i < s.length(); i++) {
			char ch = s.charAt(i);
			if(i == 0 && !Character.isUpperCase(ch) ) {
				ch = Character.toUpperCase(ch);
				str.append(ch);
			}else if(s.charAt(i-1)==' ' && !Character.isUpperCase(ch)) {
				ch = Character.toUpperCase(ch);
				str.append(ch);
			}else {
				str.append(ch);
			}
		}
		return str.toString();
	}
	
	public String CompressString(String s) {
		StringBuilder str = new StringBuilder();
		// aaaacbbbbbccccd
		Integer count = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			count = 1;
			while(i < s.length()-1 && s.charAt(i+1) == ch ) {
				count++;
				i++;
			}
			str.append(ch);
			if(count>1) {
				str.append(count.toString());
			}
		}
		return str.toString();
	}
	
	int countLowerCaseVowels(String s) {
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'a' | ch == 'e'| ch == 'i' | ch == 'o' | ch == 'u') {
				count++;
			}
		}
		
		return count;
	}
	
	boolean isAnagrams(String s1, String s2) {
		s1.toLowerCase();
		s2.toLowerCase();
		
		char [] strArray1 = s1.toCharArray();
		char [] strArray2 = s2.toCharArray();
		
		Arrays.sort(strArray1);
		Arrays.sort(strArray2);
		
		return Arrays.equals(strArray1, strArray2);
	}
	
	
	
	
}
