package simpleRPS2;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	public static void main(String[] args) {
		SimpleRPSService service = new SimpleRPSServiceImpl();
		
		JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "GO or STOP")) {
			case 0:
				JOptionPane.showMessageDialog(null, service.getResult(service.playGame(JOptionPane.showInputDialog("1. 가위 2. 바위 3. 보 0.종료"))));
				break;
			case 1:
				return;
			}
	}
}
}
