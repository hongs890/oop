package matrix;

/**
 * @date  : 2016. 6. 22.
 * @author: 배근홍
 * @file  : Gugudan.java
 * @story :
 */
public class Gugudan {
	public static void main(String[] args) {
		int result = 0;
		

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				
				result = i*j;
				
			 System.out.println(i+"*"+j+"="+result+"\t");
			}
			System.out.print("\n");
		}
	}
	
}
