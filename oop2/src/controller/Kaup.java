/**
 * 
 */
package controller;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : Kaup.java
 * @story :
 */
public class Kaup {
	public String body(String kaupname, String kaupresult, double kaupheight, double kaupweight, double kaupkaup){
		
		String name2 = kaupname;
		double height = kaupheight;
		double weight = kaupweight;
		String result2 = "";
		double kaup = 0.0;
		
		kaup = weight / (height / 100) / (height / 100);
		if (kaup < 18.5) {
			result2 = "저체중";
		} else if (kaup >= 18.5 && kaup < 23) {
			result2 = "정상체중";
		} else if (kaup >= 23 && kaup < 25) {
			result2 = "위험체중";
		} else if (kaup >= 25 && kaup < 30) {
			result2 = "비만 1단계";
		} else if (kaup >= 30 && kaup < 40) {
			result2 = "비만 2단계";
		}
		if (kaup >= 40) {
			result2 = "비만 3단계";
		}
		
		return name2+"은 BMI지수는 "+kaup+"이고,"+result2+"이다";
	}
}
