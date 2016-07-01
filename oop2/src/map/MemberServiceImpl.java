package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *  * @date  : 2016. 6. 28.  * @author: 배근홍  * @file  : MemberServiceImpl.java
 *  * @story  :  
 */
public class MemberServiceImpl implements MemberService {

	Map<String, MemberBean> map;
	MemberBean session;

	public MemberServiceImpl() {
		map = new HashMap<String, MemberBean>();
	}

	@Override
	public String join(MemberBean member) {
		// 1. 회원가입
		String result = "";
		if (map.containsKey(member.getId())) {
			result = "이미 존재하는 아이디입니다.";
		} else {
			result = "가입 성공";
			map.put(member.getId(), member);
		}
		return result;
	}

	@Override
	public String login(MemberBean member) {
		// 2. 로그인
		String result = "";
		if (map.containsKey(member.getId())) {
			if (findById(member.getId()).getPw().equals(member.getPw())) {
				result = "로그인 성공";
				session = findById(member.getId());
			}else{
				result="로그인 실패";
			}
		} else {
			result = "ID가 없습니다.";
		}
		return result;
	}

	@Override
	public MemberBean detail() {
		// 3. 내 정보 보기
		return session;
	}

	@Override
	public void updatePW(MemberBean member) {
		// 4.정보 수정
		session.setPw(member.getPw());
		map.put(session.getId(), session);
	}

	@Override
	public String delete() {
		// 5. 회원 탈퇴
			map.remove(session.getId());
			session = null;
		return "삭제성공";
	}

	@Override
	public List<MemberBean> list() {
		// 11. 회원목록
		List<MemberBean> memberList = new ArrayList<MemberBean>();
		for (Entry<String, MemberBean> entry : map.entrySet()) {
			memberList.add(entry.getValue());
		}
		return memberList;
	}

	@Override
	public MemberBean findById(String id) {
		// 12.검색 (ID)
		return map.get(id);
	}

	@Override
	public List<MemberBean> findByName(String name) {
		// 13. 이름 확인
		List<MemberBean> searchName = new ArrayList<MemberBean>();
		for (String key : map.keySet()) {
			if (name.equals(map.get(key).getName())) {
				searchName.add(map.get(key));
			}
		}
		return searchName;
	}

	@Override
	public int countByGender(String gender) {
		// 14. 성별 확인 
		int count = 0;
			for (String key : map.keySet()) {
				if (gender.equals(map.get(key).getGender())) {
					count++;
				}
			}
		return count;
	}

	@Override
	public int count() {
		// 15. 회원수
		return map.size();
	}

}
