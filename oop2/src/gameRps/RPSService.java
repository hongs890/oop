package gameRps;

/**
 * @date  : 2016. 6. 20.
 * @author: 배근홍
 * @file  : RPSService.java
 * @story :
 */
public interface RPSService {

	public void betPlayerValue(int playerValue);
	public void setComputerValue();
	public String whoWin();
	public String showResult();
	public boolean checkValidation(String rps); // 유효성 체크
	
	
}
