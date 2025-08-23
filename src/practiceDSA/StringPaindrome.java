package practiceDSA;
import java.util.*;
public class StringPaindrome {
	public boolean isPalindrome(String s) {
		s.toLowerCase();
        for(int i = s.length()-1; i > (s.length()-1)/2 ; i--) {
        	if(s.charAt(i) != s.charAt(s.length()-1-i)) {
        		return false;
        	}
        }
        return true;
    }
}
