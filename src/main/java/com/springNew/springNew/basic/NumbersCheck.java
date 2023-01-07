package com.springNew.springNew.basic;

/**
 * @author krishnakumar
 *
 */
public class NumbersCheck {

	public static void main(String[] args) {
	 //  findArmStrongNumbers();
//		int  number=153;
//		if(isArmStrongNumber(number)) {
//			System.out.println(number + " is Arm Strong Number ");
//		}
//		primeNumbersBetween(1, 100);
		minAndMaxDigits();
	}

	private static void findArmStrongNumbers() {
		int num=500;
		System.out.println("ArmStrongNumbers Below :"+num);
		for(int i=1;i<=num;i++) {
			 if(isArmStrongNumber(i)) {
				 System.out.println(i);
			 }
		}
	}

	private static boolean isArmStrongNumber(int num) {
		int temp,count=0,sum=0;
		temp=num;
		int countTotalDigits = countTotalDigits(num, count);
     while(num!=0) {
    	  int rem=num%10;
    	  sum+=Math.pow(rem, countTotalDigits);
    	  num=num/10;
      }
      if(temp==sum) {
    	  return true;
      }
      else {
    	  return false;
      }
	}
	private static int countTotalDigits(int num, int digits) {
		while(num != 0) {
			digits++;
			num=num/10;
		}
		return digits;
	}
	private static void primeNumbersBetween(int start, int end) {
		System.out.println("---------------------");
		System.out.println("-- PrimeNumbers --");
		System.out.println("---------------------");
		for(int j=start;j<=end;j++) {
		boolean checkPrimeNum = checkPrimeNum(j);
		if(checkPrimeNum) {
			System.out.println(j);
		}
		}
	}

	private static boolean checkPrimeNum(int j) {
		boolean prime=true;
		// number < =1
		if(j<=1) {
			prime=false;
		}
		for(int i=2;i<j;i++) {
			if(j%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
	}

	private static void minAndMaxDigits() {
		int num=919348,minNumber=0;
		int maximumNumber=num%10;
		System.out.println("Last Digit In a Number : "+maximumNumber);
		while(num!=0) {
			minNumber=num%10;
			//System.out.println(minNumber);
			num=num/10;
		}
		System.out.println("First Digit In a Number : "+minNumber);
		
	}
	
}
