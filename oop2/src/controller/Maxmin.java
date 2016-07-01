/**
 * 
 */
package controller;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : Maxmin.java
 * @story :
 */
public class Maxmin {
	public String cmaxmin(int[] score){
				
		int max=0, min=101, i=0;
		
		for (; i < score.length; i++) {
					
			if (score[i] > max) {
				max = score[i];
						
			} else if (min > score[i]){
				min = score[i];
			}
		}	
		return 	"최고점 :" +max+ "최저점 :"+min;
	}
}
