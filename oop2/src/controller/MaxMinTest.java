/**
 * 
 */
package controller;

import java.util.Scanner;

/**
 * @date  : 2016. 6. 15.
 * @author: 배근홍
 * @file  : MaxMinTest.java
 * @story :
 */
public class MaxMinTest {
	public String execute(int[] scores) {

		int max=0, min=100;
		

		for (int i = 0; i < scores.length; i++) {

			if (scores[i] > max) {
				max = scores[i];
			}if (scores[i] < min){
				min = scores[i];
			}
			
		}
		
		return "최고점:"+max+"점 / 최저점:"+min+"점";
	}

}
