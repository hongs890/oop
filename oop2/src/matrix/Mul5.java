package matrix;

/**
 * @date  : 2016. 6. 22.
 * @author: 배근홍
 * @file  : Matrix5.java
 * @story :
 */
public class Mul5 {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int result = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				result += 5;
				mtx[i][j]=result;
				System.out.print(mtx[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

}
