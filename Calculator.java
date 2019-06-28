package util;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a,b,ans,operator;
		System.out.println("Please enter Num a:");
		a=scan.nextDouble();
		System.out.println("Please enter Num b:");
		b=scan.nextDouble();
		System.out.println("Select Operation:");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		operator = scan.nextDouble();
		
		while (operator >4) {
			System.out.println("Please select correct operation:");
			operator = scan.nextDouble();
		}
	Calculation answer = new Calculation();
	
	if (operator==1) {
		ans = answer.add(a,b);
		System.out.println("The Addition is : "+ans);
	}else if (operator==2) {
		ans = answer.sub(a,b);
		System.out.println("The Substraction is : "+ans);
	}else if (operator==3) {
		ans = answer.mul(a,b);
		System.out.println("The Multiplication is : "+ans);
	}else if (operator==4) {
		ans = answer.div(a,b);
		System.out.println("The Division is : "+ans);
	}
	}

}
