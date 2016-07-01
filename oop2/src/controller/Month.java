/**
 * 
 */
package controller;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : Month.java
 * @story :
 */
public class Month {
	public String controlmonth(int monthyear, int monthmonth){
		
		int end =0;
		String name = "", result = "";
		int year = monthyear;
		int month = monthmonth;
		
		switch (month) {
		case 1:		case 3:		case 5:		case 7:		case 8:		case 10:		case 12:
			end = 31;
			break;
		case 4:		case 6:		case 9:		case 11:
			end = 30;
			break;
		case 2:
			end = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;
			break;
		default:
			System.out.print("1월에서 12월까지만 입력해주세요.");
			break;
		}
		
		return year+"년"+month+"월"+end+"일";
	}

}
