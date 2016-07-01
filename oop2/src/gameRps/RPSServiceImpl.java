package gameRps;

/**
 * @date  : 2016. 6. 20.
 * @author: 배근홍
 * @file  : RPSServiceImpl.java
 * @story :
 */
public class RPSServiceImpl implements RPSService{

	RPSBean rpsBean;
	
	@Override
	public void betPlayerValue(int play) {
		rpsBean = new RPSBean(play);
	}

	@Override
	public void setComputerValue() {
		rpsBean.setComp((int)(Math.random()*3)+1); 
	}

	@Override
	public String whoWin() {
		switch ((rpsBean.getPlay()-rpsBean.getComp()+3)%3) {
		case 0:
			rpsBean.setWinner("무승부");
			break;
		case 1: rpsBean.setWinner("사용자 승");
		case 2: rpsBean.setWinner("컴퓨터 승");
		break;
		}
		
	return null;
	}

	@Override
	public String showResult() {
		// 결과출력
		return rpsBean.toString();
	}

	@Override
	public boolean checkValidation(String rps) {
		// TODO Auto-generated method stub
		int rRps = Integer.parseInt(rps);
		return rRps==1||rRps==2||rRps==3 ?true:false;
	}
}
