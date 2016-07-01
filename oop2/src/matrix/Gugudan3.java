package matrix;

/**
 * @date : 2016. 6. 22.
 * @author: 배근홍
 * @file : Gugudan2.java
 * @story :
 */
public class Gugudan3 {
	public static void main(String[] args) {
		int result = 0;
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
				result = i * j;
				System.out.print(j + "*" + i + "=" + result + "\t");
			}
			System.out.println();
			
		}
		for (int i = 2; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				result = i * j;
				System.out.print(j + "*" + i + "=" + result + "\t");
			}
			System.out.println();
	
		}
	}
}
