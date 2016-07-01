package simpleRPS1;

import javax.swing.JOptionPane;

public class SimpleRPSController {
	public static void main(String[] args) {
		SimpleRPSService service = new SimpleRPSServiceImpl();
		
		JOptionPane.showMessageDialog(null, "===가위바위보 게임===");
		int computer=0, player=0;
		String result="";
		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "GO or STOP")) {
			case 0:
				String p = JOptionPane.showInputDialog("1. 가위 2. 바위 3. 보 0.종료");
				result = service.gameEngine(result, p);
				JOptionPane.showMessageDialog(null, result);
				break;
			case 1:
				return;
			}
	}
}
}
