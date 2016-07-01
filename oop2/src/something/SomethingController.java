/**
 * 
 */
package something;

import javax.swing.JOptionPane;

/**
 * @date  : 2016. 6. 17.
 * @author: 배근홍
 * @file  : SomethingController.java
 * @story :
 */
public class SomethingController {
	public static void main(String[] args) {
		Something something = null;
		
		while (true) {
			switch (JOptionPane.showInputDialog("1번 등록, 2번 조회, 0번 종료")) {
			case "1":	
				String aaa = JOptionPane.showInputDialog("1번값을 입력해주세요");
				String bbb = JOptionPane.showInputDialog("2번값을 입력해주세요");
				int ccc = Integer.parseInt(JOptionPane.showInputDialog("3번값을 입력해주세요"));
				int ddd = Integer.parseInt(JOptionPane.showInputDialog("4번값을 입력해주세요"));
				
				something = new Something(aaa, bbb, ccc, ddd);
				break;
			case "2":	
				JOptionPane.showMessageDialog(null, "1번값("+something.getAaa()+"), 2번값("+something.getBbb()+"), "
						+ "3번값("+something.getCcc()+"), 4번값("+something.getDdd()+")");
				break;

			case "0":	
				JOptionPane.showConfirmDialog(null, "정말 종료하시겠습니까?");
				return;
			}
		}
	}

}
