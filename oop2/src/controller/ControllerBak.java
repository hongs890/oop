/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 14.
 * @author: 배근홍
 * @file : Controller.java
 * @story :
 */
public class ControllerBak {
	public static void main(String[] args) {
		// ---------------------init
		Scanner s = new Scanner(System.in);
		Calc c = new Calc();
		Kaup kaup = new Kaup();
		Month month = new Month();
		Num num = new Num();
		Arr arr = new Arr();
		Maxmin maxmin = new Maxmin();
		Tax tax = new Tax();
		Gender gender = new Gender();
		TimeCalc timeCalc = new TimeCalc();
		String menu="";
	
		// ------------------ op
		while (true) {
			menu = JOptionPane.showInputDialog("1. 계산기\n 2.카우푸\n 3.년월말\n 4.1등구하기\n "
					+ "5.학번/나이\n 6.최고최저점수\n 7.세금액\n 8.성별판별\n 9.시분초구하기\n 0.종료");
			switch (menu) {
			case "1": 
			System.out.println("첫 번째 정수를 입력하세요");
			System.out.println("연산자를 입력하세요");
			System.out.println("두 번째 정수를 입력하세요");
			System.out.println(c.execute(s.nextInt(), s.next(),  s.nextInt()));
			break;
			case "2":
			System.out.println("이름을 입력하세요 : ");
			System.out.println("키를 입력하세요 : ");
			System.out.println("몸무게를 입력하세요 : ");
			System.out.println(kaup.body(s.next(), menu, s.nextDouble(), s.nextDouble(), 0));
			break;
			case "3":
			System.out.println("년을 입력하세요");
			System.out.println("월을 입력하세요");
			System.out.println(month.controlmonth(s.nextInt(), s.nextInt()));
			break;
			case "4":
			System.out.println("첫 번째 학생 이름과 점수를 입력하세요 : ");
			System.out.println("두 번째 학생 이름과 점수를 입력하세요 : ");
			System.out.println("세 번째 학생 이름과 점수를 입력하세요 : ");
			System.out.println(num.controlnum(s.next(), s.next(), s.next(), s.nextInt(), s.nextInt(), s.nextInt()));
			break;
			case "5":
			System.out.println("학생 수가 몇명입니까?");
			System.out.println("?명의 이름, 나이? : ");
			System.out.println(arr.carr(s.nextInt(), s.next(), s.nextInt()));
				break;
			case "6":
				System.out.println("학생 수가 몇명입니까?");
				int[] score = new int[s.nextInt()];
				System.out.println("점수를 입력하세요 : ");
				for (int i = 0; i < score.length; i++) {
					score[i] = s.nextInt();
				}
				System.out.println(maxmin.cmaxmin(score));
				break;
			case "7":
				System.out.println("이름 : [ ]");
				System.out.println("연봉 : [ ]");
				System.out.println("세율이 바뀌었습니까?" + "그대로이면 1, 바뀌었으면 0 을 입력하세요");
				System.out.println(tax.ctax(s.next(), s.nextInt(), s.nextInt(), 0));
				break;
			case "8":
				System.out.print("이름과 주민등록번호를 입력해주세요 : ");
				System.out.println(gender.cgender(s.next(), s.next()));
				break;
			case "9":
				System.out.print("초를 입력하세요 : ");	
				System.out.println(timeCalc.ctimecalc(s.nextInt()));
				break;
			case "0"	:
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
			default:
				JOptionPane.showMessageDialog(null, "목록에 없는 번호입니다");
				break;
			}
		}
	}
}
