/**
 * 
 */
package controller;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : Gender.java
 * @story :
 */
public class Gender {
	public String cgender (String gendername, String gendergender){
		String name = "", gender = "", result = "여";

		
		name = gendername;
		gender = gendergender;
		char sevenNumber = gender.charAt(7);

		if (sevenNumber == '0' || sevenNumber == '9') {
			System.out.println("잘못된 값을 입력하셨습니다.");
			
		}
		if (sevenNumber % 2 == 1) {
			result = "남";
		}

		return name + "(" + result + ")";
	}

}
