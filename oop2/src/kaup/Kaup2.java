/**
 * 
 */
package kaup;

import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author: 배근홍
 * @file : Kaup2.java
 * @story : 카우푸지수 구하는 프로그램
 */
public class Kaup2 {
	String name, height, weight;

	public void setName(String name){ //외부에서 받은 값을 저장한다 (write)//
		this.name = name;
	}
	public void setHeight(String height){
		this.height = height;
	}
	public void setWeight(String weight){
		this.weight = weight;
	}

	//-------------------------필드????????------------------//
	
	public String getName(){
		return this.name;
	}
	public String getHeight(){
		return this.height;
	}
	public String getWeight(){
		return this.weight;
	}
	
	public String kaupcal () {
		// 
		// ----init
	
		String result = "";
		double height=Double.parseDouble(this.height),
				weight=Double.parseDouble(this.weight),
				kaup=0.0;
		// ----op

		kaup = weight / (height / 100) / (height / 100);

		if (kaup < 18.5) {
			result = "저체중";
		} else if (kaup >= 18.5 && kaup < 23) {
			result = "정상체중";
		} else if (kaup >= 23 && kaup < 25) {
			result = "위험체중";
		} else if (kaup >= 25 && kaup < 30) {
			result = "비만 1단계";
		} else if (kaup >= 30 && kaup < 40) {
			result = "비만 2단계";
		}
		if (kaup >= 40) {
			result = "비만 3단계";
		}

		return name+"은 BMI지수는 "+Double.parseDouble(String.format("%.2f" , kaup ))+"이고,"+result+"이다.";
	}
}
