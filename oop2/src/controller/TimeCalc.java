/**
 * 
 */
package controller;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : TimeCalc.java
 * @story :
 */
public class TimeCalc {
	public String ctimecalc (int cinsert){
		
		int insert = cinsert;
		
		return insert / 3600+"시간 "+(insert / 60) % 60+"분 "+insert%60+"초";
	}

}
