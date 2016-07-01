/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date  : 2016. 6. 15.
 * @author: 배근홍
 * @file  : Controller.java
 * @story :
 */
public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calc calc = new Calc();
		MaxMinTest maxMinTest = new MaxMinTest();
		while (true) {
			System.out.println("[메뉴]"
					+"1. 계산기"
					+"2. 카우푸"
					+"3. 최고 최저점수"
					+"0.종료");
			switch (s.next()) {
			case "1":	
			System.out.println("num1, opcode, num2 입력하시오");
			System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
			break;
			case "2":	
			
				break;
			case "3":
				System.out.println("학생수?");
				int count = s.nextInt();
				int[] scores = new int[count];
				System.out.println("점수?");
				for (int i = 0; i < scores.length; i++) {
					scores[i] = s.nextInt();
				}
				System.out.println(maxMinTest.execute(scores));
				break;
			case "0":	
				JOptionPane.showConfirmDialog(null, "Are you sure Exit?");
				return;

			default:
				break;
			}
		}
	}
}
