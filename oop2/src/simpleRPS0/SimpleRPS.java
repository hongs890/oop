package simpleRPS0;

import javax.swing.JOptionPane;

import global.MyConstants;

/**
 * @date  : 2016. 6. 21.
 * @author: 배근홍
 * @file  : SimpleRPS.java
 * @story :
 */
public class SimpleRPS {
	public static void main(String[] args) {
		
			JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
			String result="";
			while (true) {
				switch (JOptionPane.showConfirmDialog(null, "GO or STOP")) {
				case 0:
					String p = JOptionPane.showInputDialog("1. 가위 2. 바위 3. 보 0.종료");
					result = gameEngine(result, p);
					JOptionPane.showMessageDialog(null, result);
					break;
				case 1:
					return;
				}
		}
	}

	/**
	 * @param result
	 * @param p
	 * @return
	 */
	private static String gameEngine(String result, String p) { //gameEngine이 서비스&빈이 된다.
		switch (p) {
			case "1":				
			switch ((int)(Math.random()*3)+1) {
			case 1:	result = "tie";	break;			
			case 2:	result = "lose";break;
			case 3:	result = "win";	break;
			}break;
			case "2":				
			switch ((int)(Math.random()*3)+1) {
			case 1:	result = "win";	break;
			case 2:	result = "tie";	break;
			case 3:	result = "lose";break;	
			}break;
			case "3":				
			switch ((int)(Math.random()*3)+1) {
			case 1:	result = "lose";break;
			case 2:	result = "win";	break;
			case 3:	result = "tie";	break;	
			}break;
				
			
		}
		return result;
	}
}
