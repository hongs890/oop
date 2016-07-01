package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @date  : 2016. 6. 28.
 * @author: 배근홍
 * @file  : HashMapEx.java
 * @story  :
 */
public class HashMapEx {
	public static void main(String[] args) {
		String[] msg = {"Berlin","Dortmund","Frankfurt","Gelsenkirchen","Hamburg"};
		
		Map<Integer,String>map = new HashMap<Integer,String>(); // HashMap 생성
		
		for (int i = 0; i < msg.length; i++) {
				map.put(i,msg[i]); // 맵에 저장
		}
		
		Set<Integer> keys = map.keySet();
		for (Integer n : keys) {
			System.out.println(map.get(n)); // 맵에서 읽어오기
		}
	}
}
