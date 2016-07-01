/**
 * 
 */
package controller;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : Calc.java
 * @story :
 */
public class Calc {
	public String execute (int inputNum1, String opcode, 
			int inputNum2){
		int one = inputNum1;
		String op = opcode;
		int two = inputNum2;
		int resultcal=0;
		
		switch (op) {
		case "+":
			resultcal = one + two;
			op = "+";
			break;
		case "-":
			resultcal = one - two;
			op = "-";
			break;
		case "*":
			resultcal = one * two;
			op = "*";
			break;
		case "/":
			resultcal = one / two;
			op = "/";
			break;
		case "%":
			resultcal = one % two;
			op = "%";
			break;
		default:
			System.out.println("정확한 연산자를 입력 바랍니다. 처음 화면으로 돌아갑니다.");
			break;
		}
		
		return one + op + two + "=" + resultcal;
	}
	
}
