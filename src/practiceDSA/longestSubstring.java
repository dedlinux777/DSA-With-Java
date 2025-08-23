package practiceDSA;

import java.util.HashSet;
import java.util.Set;

public class longestSubstring {

public int lengthOfLongestSubstring(String s) {
        
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int i=0, j=0;
        int length = s.length();

        for(j = 0; j < length; j++){
            if(!charSet.contains(s.charAt(j))){
                charSet.add(s.charAt(j));
                maxLength = Math.max(maxLength, j - i);
            }else{
                while (charSet.contains(s.charAt(j))) {
                    charSet.remove(s.charAt(i++));   
                }
                charSet.add(s.charAt(j));
            }
        }
        
        System.out.println("Character set of substring is: ");
        for(char chars : charSet) {
        	System.out.print(chars);
        }
        System.out.print(" \n");
        return maxLength;
    }
}
