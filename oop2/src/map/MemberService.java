package map;

import java.util.List;

/**
 * @date  : 2016. 6. 28.
 * @author: 배근홍
 * @file  : MemberService.java
 * @story  :
 */
public interface MemberService {
	public String join(MemberBean member); //1.회원가입
	public String login(MemberBean member);  //2.로그인
	public MemberBean detail(); //3.내정보보기
	public void updatePW(MemberBean member); // 4.내정보수정 (비번)
	public String delete(); // 5.탈퇴
	public List<MemberBean> list(); // 11.회원목록
	public MemberBean findById(String id); // 12. 검색(ID)
	public List<MemberBean> findByName(String name); // 13.검색(이름)
	public int countByGender(String gender); // 14.검색 (성별)	
	public int count(); // 15. 회원수 
}
