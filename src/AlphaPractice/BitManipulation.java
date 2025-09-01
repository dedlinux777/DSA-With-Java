package AlphaPractice;

public class BitManipulation {

	void evenOrOdd(int n) {
		int bitmask = 1;

		if ((n & bitmask) == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is Odd");
		}
	}

	int getIthBit(int n, int i) {
		int bitmask = 1 << i; // bringing the 1 or moving the 1 to the ith position, the positions left side
								// of ith bit are filled with zero's so that we get the ith bit

		if ((n & bitmask) == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	int setIthBit(int n, int i) {
		int bitmask = 1 << i;
		return n | bitmask;
	}

	int clearIthBit(int n, int i) {
		int bitmask = ~(1 << i);
		return n & bitmask;
	}

	int updateIthBit(int n, int i, int newBit) {
		clearIthBit(n, i);
		int bitmask = newBit << i; // 0 or 1 would be shifted i times to the left and ORing that with n updates the
									// ith bit in n
		return n | bitmask;
	}

	int clearLastIthBits(int n, int i) {
		int bitMask = -1 << i; // last bits after i becomes 0 
		return n & bitMask;
	}
	
	void isPowerOf2(int n) {
		if((n&(n-1)) == 0) {
			System.out.println("N is the power of 2");
		}else {
			System.out.println("N is not the power of 2");
		}
	}
	
	void countSetBits(int n) {
		int count = 0;
		while(n > 0) {
			if((n&1)==1) {   // n & 000001 give's the 1st bit, if that = to 1 then count++
				count++;
			}
			n = n >> 1; // right shift one position 
		}
		System.out.print(count);
	}
	int fastExpo(int a, int n) {
		int ans = 1;
		
		while(n>0) {
			if((n&1) == 1) {
				ans = ans * a;
			}
			a = a*a; // on each position of bit's of n the a becomes doubled
			n = n>>1;
		}
		return ans;
	}
	
	
	
	
	
}
