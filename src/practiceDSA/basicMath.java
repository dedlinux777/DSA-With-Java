package practiceDSA;
import java.lang.Math;
import java.util.*;

public class basicMath {

	int countDigits(int n) {
		int count = 0, temp=0;
		while(n!=0) {
			temp = n%10; // 97964
			n /= 10;
			count++;
		}
		return count;
	}
	
	int countDigitsUsingLog(int n) {
		return (int)(Math.log10(n) + 1) ;
	}
	
	int reverse_num(int x) {
		long reversed_number = 0; 
        while (x != 0) {
            int last_digit = x % 10;
            reversed_number = reversed_number * 10 + last_digit;
            x /= 10;
        }
        if (reversed_number > Integer.MAX_VALUE || reversed_number < Integer.MIN_VALUE) {
            return 0; // Return 0 if there was an overflow
        }
        return (int) reversed_number;
	}

	public boolean isPalindrome(int x) {
		int temp = x;
		long reversed_number = 0; 
        while (x != 0) {
            int last_digit = x % 10;
            reversed_number = reversed_number * 10 + last_digit;
            x /= 10;
        }
        
        if(temp == reversed_number) {
            return true;
        }else {
        	return false;
        }
    }
	
	public boolean isArmstrong(int x) {
		int temp = x, sum=0;
        while (x != 0) {
            int last_digit = x % 10;
            sum = sum + (last_digit*last_digit*last_digit);
            x /= 10;
        }
        
        if(temp == sum) {
            return true;
        }else {
        	return false;
        }
	}
	
	public Vector<Integer> printDivisors(int x) {
		Vector<Integer> list = new Vector<>();
		
		for(int i=1; i <= Math.sqrt(x); i++) {
			if(x%i == 0) {
				list.add(i);
				if(x/i != i) {
					list.add(x/i);
				}
			}
		}
		Collections.sort(list);
		return list;
	}
	
	public boolean isPrime(int x) {
		Vector<Integer> list = new Vector<>();
		
		for(int i=1; i <= Math.sqrt(x); i++) {
			if(x%i == 0) {
				list.add(i);
				if(x/i != i) {
					list.add(x/i);
				}
			}
		}
		
		if(list.size()>2) {
			return false;
		}else {
			return true;
		}
		
	}
	
	
//	GCD of 2 numbers:
	
	public int getGCDV1(int n1, int n2) {
		int gcd=1;
		for(int i=1; i <= Math.min(n1, n2); i++)
			if(n1%i == 0 && n2%i==0)
				gcd =i;
		return gcd;
	}
//	or:
	public int getGCDV2(int n1, int n2) {
		int gcd=1;
		for(int i=Math.min(n1, n2); i >= 1; i--) {
			if(n1%i == 0 && n2%i==0) {
				gcd = i; 
				break;
			}
		}
		return gcd;
	}
	
	
	public int getGCDV3(int n1, int n2) {
		while(n1>0 && n2>0) {
			if(n1>n2) {
				n1 = n1%n2;
			}else if(n1<n2){
				n2 = n2%n1;
			}
		}
		if(n1 == 0) {
			return n2;
		}
		return n1;
	}
	
	
	void printPrime(int x) {
		for(int i = 2; i<=x;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	
	int convBin2Dec(int x) {
		int lastDigit, dec=0, pow = 0;
		while(x>0) {
			lastDigit = x%10;
			dec = dec + lastDigit * (int)Math.pow(2, pow);
			pow++;
			x = x/10 ;
		}
		return dec;
	}
	
	int convDec2Bin(int x) {
		int lastDigit, bin=0, pow = 0;
		while(x>0) {
			lastDigit = x%2;
			bin = bin + lastDigit * (int)Math.pow(10, pow);
			pow++;
			x = x/2 ;
		}
		return bin;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
