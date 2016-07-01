/**
 * 
 */
package kaup;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date  : 2016. 6. 15.
 * @author: 배근홍
 * @file  : KaupController.java
 * @story :
 */
public class KaupController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Kaup2 kaup2 = new Kaup2();
		while (true) {
			switch (JOptionPane.showInputDialog("1:실행 0:종료")) {
			case "1":	
				String name = JOptionPane.showInputDialog("이름?");
				String height = JOptionPane.showInputDialog("키?");
				String weight = JOptionPane.showInputDialog("몸무게?");
				kaup2.setName(name);
				kaup2.setHeight(height);
				kaup2.setWeight(weight);
				JOptionPane.showMessageDialog(null, kaup2.kaupcal());
				break;
			default :	
				JOptionPane.showConfirmDialog(null, "정말 종료하시겠습니까?");
				return;
			}
		}
	}
}
