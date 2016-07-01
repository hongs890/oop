package matrix;

/**
 * @date  : 2016. 6. 22.
 * @author: 배근홍
 * @file  : Matrix5.java
 * @story :
 */
public class Triangle {
	public static void main(String[] args) {
		String result = "";
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (i<j) {
					result = " ";
				} else {
					result = String.valueOf(j);
				}
				System.out.print(result);
			}
			System.out.println();
		}
	}
	

}
