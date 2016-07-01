package phone;

import javax.swing.JOptionPane;

public class PhoneController {
	public static void main(String[] args) {
		
		while (true) {
			Phone phone = new Phone();
			CellPhone cellPhone = new CellPhone();
			Iphone iphone = new Iphone();
			AndroidPhone android = new AndroidPhone();
			switch (JOptionPane.showInputDialog("1. 유선폰 2.휴대폰 3.아이폰 4. 갤럭시노트 0.종료")) {
			case "1":
				phone.setCompany(JOptionPane.showInputDialog("어느회사 제품?"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case "2":
				cellPhone.setCompany(JOptionPane.showInputDialog("어느회사 제품?"));
				cellPhone.setCall(JOptionPane.showInputDialog("통화내용"));
				cellPhone.setPortable(true);  
				JOptionPane.showMessageDialog(null, cellPhone.toString());
				break;
			case "3":
				iphone.setCompany(JOptionPane.showInputDialog("어느회사 제품?"));
				iphone.setCall(JOptionPane.showInputDialog("통화내용"));
				iphone.setData(JOptionPane.showInputDialog("문자내용"));
				iphone.setPortable(true);  
				JOptionPane.showMessageDialog(null, iphone.toString());
				break;
			case "4":
				android.setData(JOptionPane.showInputDialog("통화내용"), 
						JOptionPane.showInputDialog("화면크기"), 
						JOptionPane.showInputDialog("카톡내용"));
				JOptionPane.showMessageDialog(null, android.toString());
				break;
			case "0": return;
			}
		}
	}
}
