package gameRps;

import javax.swing.JOptionPane;

/**
 * @date  : 2016. 6. 20.
 * @author: 배근홍
 * @file  : RPSController.java
 * @story :
 */
public class RPSController {
	public static void main(String[] args) {
		RPSService service = new RPSServiceImpl();
	
		while (true) {
			switch (JOptionPane.showInputDialog("1.게임실행 0.종료")) {
			case "1":				
				String rps = JOptionPane.showInputDialog("1가위, 2바위, 3보자기");
				if(!service.checkValidation(rps)){
						JOptionPane.showMessageDialog(null, "잘못된 값입니다.");
						break;
				}
					service.betPlayerValue(Integer.parseInt(rps));
					service.setComputerValue();
					service.whoWin();
					JOptionPane.showMessageDialog(null, service.showResult());
				break;
			case "0":			
				return;
			}
		}
	}
}
