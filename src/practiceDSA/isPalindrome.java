package practiceDSA;

public class isPalindrome {
	
	boolean isPali(int n) {
			int rev=0, num=n, rev_digit;
			do {
				rev_digit = num % 10;
				rev = (rev*10)+rev_digit; 
				num /= 10;
			}while(num != 0);
			if(rev == n) {
				return true;
			}else {
				return false;
			}
	}
}