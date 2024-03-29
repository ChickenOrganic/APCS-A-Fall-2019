//Dennis Ly
//APCS Period 3
//September 20, 2019
public class Calculate {
	// call to square returns the square of the value passed
	public static int square(int num) {
		return num*num;
	}
	// call to cube returns the cube of the value passed
	public static int cube(int num) {
		int cube = 0;
		cube = num*num*num;
		return cube;
	}
	// returns the average of the values passed to it
	public static double average(double num1, double num2) {
		double average = (num1 + num2) / 2;
		return average;
	}
	// another average method
	public static double average(double num1, double num2, double num3) {
		double answer = (num1 + num2 + num3) / 3;
		return answer;
	}
	// converts an angle measure given in radians into degrees
	public static double toDegrees(double radian) {
		double degree;
		degree = radian * (180 / 3.14159);
		return degree;
	}
	// converts angle measure given in degrees into radians
	public static double toRadians(double degree) {
		double radian;
		radian = degree * (3.14159 / 180);
		return radian;
	}
	// provides the coefficients of a quadratiic equation in standard form and returns the value of the discriminant
	public static double discriminant(double num1, double num2, double num3) {
		double discriminant;
		discriminant = (num2*num2)-(4*num1*num3);
		return discriminant;   
	}
	// converts mixed number into an improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		answer = ((whole*denominator+numerator)+"/"+denominator);
		return answer;
	}
	// converts an improper fraction into a mixed number
	public static String toMixedNum(int numerator, int denominator) {
		String answer;
		answer = (numerator/denominator+" "+numerator%denominator+"/"+denominator);
		return answer;
	}
	// converts binomial multiplication of the form into a quadratic equation
	public static String foil(int num1, int num2, int num3, int num4, String letter) {
		String a;
		String b;
		int c;
		String combined;
		a = (num1 * num3) + "n^2 + ";
		b = (num2 * num3) + (num1 * num4) + "n + ";
		c = (num2 * num4);
		combined = a + b + c;
		return combined;
	}
	// determines whether or not one integer is evenly divisible by another
	public static boolean isDivisibleBy(int num1, int num2) {
		if((num1%num2==0)||(num2%num1==0)) {
			return true;
		} else {
			return false;
		}
	}
	// returns the absolute value of the number passed
	public static double absValue(double num) {
		if(num<0) {
			num*=-1;
		}
		return num;
	}
	// returns the larger of the values passed
	public static double max(double num1, double num2) {
		if(num1>num2) {
			return num1;
		} else {
			return num2;
		}
	}
	public static double max(double num1, double num2, double num3) {
		double greaterNum;
		if ((num1>num2)&&(num1>num3)) {
			greaterNum=num1;
		} else {
			if ((num2>num1) && (num2>num3)) {
				greaterNum=num2;
			} else {
				greaterNum=num3;
			}
		  }
		return greaterNum;
	}
	// returns the smaller of the values passed
	public static int min(int num1, int num2) {
		int minimum;
		if (num1>=num2) {
			minimum = num1;
		} else {
			minimum = num2;
		  }
		return minimum;
	}
	// rounds a double correctly to 2 decimal places 
	public static double round2(double num) {
		num = (num * 100);
		if (num<0) {
			num=(num-0.5);
			num=(int)num;
		}
		else {
			num=(num+0.5);
			num=(int)num;
		}
		return num/100;
	}
	// raises a value to a positive integer
	public static double exponent(double integer, int power) {
		double answer = 0;
		for(int i=0;i<power; i++) {
			answer=integer*integer;
			}
			return answer; 
	}
	//returns the factorial of the value passed
	public static int factorial (int num) {
		if (num<=0)throw new IllegalArgumentException("no factorial of value");
		int answer=num;
		for(int i=num-1; i>0; i--) {
			answer*=i;
		}
		return answer;
		}
	//determines whether or not an integer is prime
	public static boolean isPrime (int num) {
		for (int i=num-1; i>1; i--) {
			if (isDivisibleBy(num, i)) {
				return false;
			}
		}
		return true;
	}
	//finds the greatest common factor of two integers
	public static int gcf(int integer1, int integer2) {
		int commonFactor = 1;
		double bigger = max(integer1, integer2);
		double smaller = min(integer1, integer2);
		for (int i = 1; i <= (int)bigger; i++) {
			if (isDivisibleBy((int)bigger, i) == true) {
				if (isDivisibleBy((int)smaller, i) == true) {
					commonFactor = i;
				}
			}
		}
		return commonFactor;
	}
	//returns an approximation of the square root of the value passed, rounded to two decimal places
	public static double sqrt(double num) {
		double educatedGuess = num / 2;
		if (num < 0) {
			throw new IllegalArgumentException("Number must be greater than 0");
		}
		while (((educatedGuess*educatedGuess)-num)>=.005||((educatedGuess*educatedGuess)-num)<=-.005) {
			educatedGuess=0.5*(num/educatedGuess+educatedGuess);
		}
		return round2(educatedGuess);
	}
	//uses coefficients of a quadratic equation in standard form and uses the quadratic formula to approximate real roots if any.
	public static String quadForm(int a, int b, int c) {
		double root1=0;
		double root2=0;
		if (discriminant(a, b, c) < 0) {
		return "no real roots";
		}
		else if (discriminant(a, b, c) > 0) {
			root1=(-b+sqrt(discriminant(a, b, c)))/(2 * a);
			root2=(-b-sqrt(discriminant(a, b, c)))/(2 * a);
			return round2(root1)+"and"+round2(root2);
		}
		else {
			root1 = -b / (2 * a);
			return round2(root1)+"";
		}
	}
}