/**
 * 
 */
package controller;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : Num.java
 * @story :
 */
public class Num {
	public String controlnum (String cstudent1, String cstudent2, String cstudent3, int cave1, int cave2, int cave3){
		
		String name1="", name2="", name3="";
		int result1=0, result2=0, result3=0;

		String student1 = cstudent1;
		int ave1 = cave1;
		String student2 = cstudent2;
		int ave2 = cave2;
		String student3 = cstudent3;
		int ave3 = cave3;
	
		
		if (ave1 > ave2 && ave1 > ave3) {
			result1 = ave1;
			name1 = student1;
			if (ave2 > ave3) {
				result2 = ave2;
				name2 = student2;
				result3 = ave3;
				name3 = student3;
			} else {
				result2 = ave3;
				name2 = student3;
				result3 = ave2;
				name3 = student2;
			}
		} else if (ave2 > ave3) {
			result1 = ave2;
			name1 = student2;
			if (ave1 > ave3) {
				result2 = ave1;
				name2 = student1;
				result3 = ave3;
				name3 = student3;
			} else {
				result2 = ave3;
				name2 = student3;
				result3 = ave1;
				name3 = student1;
			}
		} else {
			result1 = ave3;
			name1 = student3;
			if (ave1 > ave2) {
				result2 = ave1;
				name2 = student1;
				result3 = ave2;
				name3 = student2;
			} else {
				result2 = ave2;
				name2 = student2;
				result3 = ave1;
				name3 = student1;
			}
		}
		return"1등:"+name1+result1+"점 2등:"+name2+result2+"점 3등:"+name3+result3+"점 입니다.";
	}
	

}
