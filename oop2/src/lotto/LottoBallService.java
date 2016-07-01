package lotto;

/**
 * @date  : 2016. 6. 24.
 * @author: 배근홍
 * @file  : LottoBallService.java
 * @story :
 */
public interface LottoBallService {
	public void setLottoBall();
	public int[] getLottoBall();
	public boolean isDuplication2(int num, int i);
	
}
