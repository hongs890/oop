package simpleRPS3;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
		SimpleRPSService service = new SimpleRPSServiceImpl();
		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "GO or STOP")) {
			case 0:
				JOptionPane.showMessageDialog(null, service.getResult(service.playGame(Integer.parseInt(JOptionPane.showInputDialog("1. 가위 2. 바위 3. 보 0.종료")))));
				break;
			default:
				return;
			}
	}
}
}
