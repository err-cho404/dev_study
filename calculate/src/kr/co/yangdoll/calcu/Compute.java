package kr.co.yangdoll.calcu;

// 사칙연산을 하는 역할
public class Compute {
	int add(int num1, int num2){
		int result = 0;
		result = num1 + num2;
		return result; /* 간단하게는 return num1 + num2;로 쓸 수 있음 */
	}
	int subtract(int num1, int num2){
		int result = 0;
		result = num1 - num2;
		return result;
	}
	int multiply(int num1, int num2){
		int result;
		result = num1 * num2;
		return result;
	}
	int divide(int num1, int num2){
		int result;
		result = num1 / num2;
		return result;
		
	}
	}
