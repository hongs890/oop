package lotto;

import java.util.Arrays;

/**
 * @date  : 2016. 6. 24.
 * @author: 배근홍
 * @file  : LottoBallServiceImpl.java
 * @story :
 */
public class LottoBallServiceImpl implements LottoBallService{

	private int[]lottos;
	
	public LottoBallServiceImpl() {
		this.lottos = new int[6];
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setLottoBall() {
		LottoBean lot = new LottoBean();
		for (int i = 0; i < lottos.length; i++) {
			lottos[i]=0;
		}
		for (int i = 0; i < lottos.length; i++) {
			lot.setNumber();
			int num = lot.getNumber();
			boolean exist = false;
			for (int j = 0; j < lottos.length; j++) {
				if (lottos[j]==num) {
					exist = true;
					break;
				}
			}
			if (exist) {
				i--;
				continue;
			}else{
				lottos[i]=num;
			}
		} 
			int i=0;
			while (true) {
				int num = lot.getNumber();
				this.lottos[i] = num;
				if (isDuplication2(num, i)) {
					continue;
				}
				
				i++;
				if (i==lottos.length) {
					i=0;
					break;
				}
		}
		Arrays.sort(lottos);
	}

	@Override
	public int[] getLottoBall() {
		return lottos;
	}

	@Override
	public boolean isDuplication2(int num, int i) {
		for (int j = 0; j < i; j++) {
			if (lottos[j]==num) {
				return true;
			}
		}
		return false;
	}
}