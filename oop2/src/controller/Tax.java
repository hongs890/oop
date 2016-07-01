/**
 * 
 */
package controller;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : Tax.java
 * @story :
 */
public class Tax {
	public String ctax (String taxname, int taxsal, int taxhold, double ctaxRate){
		
		
		int sal = 0, tax = 0, hold = 0;
		double taxRate = 0; 

		String name = taxname;
		sal = taxsal;
		hold = taxhold;

		if (hold > 0) {
			taxRate = 0.097;

		} else {

			System.out.println("그럼, 바뀐 세율을 입력 바랍니다");
			taxRate = ctaxRate;

		}

		tax = (int) (sal * taxRate);
		
		return "연봉 " + sal + " 만원을 받으시는 " + name + " 님께서 " + "납부할 세금은 " + tax + "원 입니다";

	
	}
}
