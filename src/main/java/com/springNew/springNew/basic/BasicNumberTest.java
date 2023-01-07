package com.springNew.springNew.basic;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author krishnakumar
 *
 */
public class BasicNumberTest {

	public static void main(String[] args) {
	     int num=20;
		 //factorial(num);
		// tableMultiplication(num);
	     findArmStrongNumber();
	    // fabinacciSeries(num);
	     //firstAndLastNumbers();
	    // firstAndLastNumbersM2();
	     primeNumbersBetween(1,100);
			
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

	// 2nd approch
	private static void firstAndLastNumbersM2() {
		int num=87134,firstDigit = 0;
		int lastDigit=num%10;
		System.out.println("lastDigit  : "+lastDigit);
		while(num!=0) {
			 firstDigit=num%10;
			num=num/10;
		}
		System.out.println("first Digit : "+firstDigit);
	}

	//my approch
	private static void firstAndLastNumbers() {
	int num=2741;
	int temp=num;
	int countTotalDigits = countTotalDigits(num, 0);
	for(int i=1;i<=num;i++) {
		int  rem=num%10;
		if(i==1) {
		System.out.println("Last Digit of a number -- "+rem);}
		num=num/10;
		if(i==(countTotalDigits-1)) {
		System.out.println("1st Digit of a number -- "+num);
		}
	}
	}

	private static void fabinacciSeries(int num) {
		int a=0,b=1,temp;
		System.out.println(a+" \n"+b);
		for(int i=2;i<=num;i++) {
			temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
		}
	}

	private static void findArmStrongNumber() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a  number  to print armstrong numbers : ");
		final int num = sc.nextInt();
		System.out.println("Armstrong Number Below : " +num );
		for(int i=1;i<=num;i++) {
			if(isArmStrongNumber(i)) {
				System.out.println(i);
			}
			else { }
		}
	}

	private static boolean isArmStrongNumber(int num) {
	   int temp,sum=0,digits = 0;
	   temp=num;
	   int TotalDigits = countTotalDigits(num,digits);
	    while(num !=0) {
	    	//num
	    	int rem=num%10;
	    	sum+=Math.pow(rem, TotalDigits);
	    	num=num/10;
	    }
	    if(temp ==sum) {
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

	private static void tableMultiplication(int num) {
		for(int multiplier=1;multiplier<=10;multiplier++) {
			System.out.println(num +" * "+multiplier+" = "+(num*multiplier));
		}
	}

	private static BigInteger factorial(final int num) {
		BigInteger fact = BigInteger.ONE;
		if(num==0 || num==1) {
			//return  1;
		}
			for(int loop=1;loop<=num;loop++) {
				fact=fact.multiply(BigInteger.valueOf(loop));
			}
			System.out.println("Factorial of  " + num + "!  is "+fact);
			return fact;
	 }
}
