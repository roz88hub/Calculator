/* Calculator Function Exception Handling ( TRY CATCH)
Author:- ROJAN */

import java.util.*;

public class Calculator {

	public static void main(String[] args){

		Scanner inputKey = new Scanner(System.in);
		System.out.println("What is the First Integer");
		int firstNum = inputKey.nextInt();
		System.out.println("What is the Second Integer");
		int secondNum = inputKey.nextInt();
		calculate(firstNum, secondNum);


	}
	static void calculate(int firstNum, int secondNum){
		Scanner inputKey = new Scanner(System.in);
		System.out.println("What you Like to do ADD, SUBSTRACT DIVIDE MULTIPLY. Choose A  S  D  M");
		char userInput = inputKey.next().charAt(0);


		switch (userInput) {		
		case 'A':
			System.out.println(firstNum + secondNum);
			break;
		case 'S': 
			System.out.println(firstNum - secondNum);		        
			break;
		case 'D':{
			try{
				System.out.println(firstNum / secondNum);
			}catch(ArithmeticException e){
				System.out.println("Cannot divide by Zero");
				break;
			}
		}

		case 'M':  
			System.out.println(firstNum * secondNum);
			break;

		default:
			break;



		}
	}
}

