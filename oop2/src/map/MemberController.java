package map;

import java.util.List;

import javax.swing.JOptionPane;

/**
 * @date  : 2016. 6. 28.
 * @author: 배근홍
 * @file  : MemberController.java
 * @story  :
 */
public class MemberController {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		String temp ="";
		//===================================================================
		while (true) {
			switch (JOptionPane.showInputDialog(""
					+ "=== 회원 전용화면 ===\n"
					+ "1. 회원가입 2.로그인 3. 내정보보기 4.내정보수정(비밀번호) 5.탈퇴 0.종료\n"
					+ "=== 관리자 화면 ===\n"
					+ "11. 회원목록 12. 검색(ID) 13.검색(이름) 14. 검색(성별) 15.회원수")) {
			case "1":
				temp = JOptionPane.showInputDialog("=== 회원가입 ===\n"
						+ "아이디, 패스워드, 이름, 성별");
				String[] arr = temp.split(",");
				MemberBean member = new MemberBean(); 
				member.setId(arr[0]);
				member.setPw(arr[1]);
				member.setName(arr[2]);
				member.setGender(arr[3]);
				JOptionPane.showMessageDialog(null, service.join(member));
				break;
			case "2":
				temp = JOptionPane.showInputDialog("id,pw");
				String[] arr2 = temp.split(",");
				MemberBean member2 = new MemberBean();
				member2.setId(arr2[0]);
				member2.setPw(arr2[1]);
				JOptionPane.showMessageDialog(null, service.login(member2));
				break;
			case "3":
				JOptionPane.showMessageDialog(null, service.detail());
				break;
			case "4":
				/*String change = service.updatePW(JOptionPane.showInputDialog("====정보수정===\n"
						+ "수정하실 패스워드"));*/
				
					
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.delete());
				break;
			case "11":
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "12":
				JOptionPane.showInputDialog("검색하실 ID를 입력하세요");
				JOptionPane.showMessageDialog(null, service.findById(temp));;
				break;
			case "13":
				List<MemberBean> searchName = service.findByName(JOptionPane.showInputDialog("검색하실 이름을 입력하세요"));
				JOptionPane.showMessageDialog(null, searchName);
				break;
			case "14":
				int searchGender = service.countByGender(JOptionPane.showInputDialog("검색하고자 하는 성별을 입력해주세요"));
				JOptionPane.showMessageDialog(null, searchGender);
				break;
			case "15":
				JOptionPane.showMessageDialog(null, "가입한 회원의 수는 총"+service.count()+"명 입니다.");
				break;
			case "0":
				return;

			default:
				break;
			}
		}
	}

}
