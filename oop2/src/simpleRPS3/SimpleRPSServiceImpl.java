package simpleRPS3;

import java.util.Random;

/**
 * @date  : 2016. 6. 21.
 * @author: 배근홍
 * @file  : SimpleRPSServiceImpl.java
 * @story :
 */
public class SimpleRPSServiceImpl implements SimpleRPSService {
	SimpleRPSBean rps = new SimpleRPSBean();
	
	@Override
	public String playGame(int player) {
		String result="";
		rps.setPlay(player);
		rps.setComp();
		int com = rps.getComp();
		switch (player) {
		case 1:				
			switch (com) {
		case 1:	result = "tie";	break;			
		case 2:	result = "lose";break;
		case 3:	result = "win";	break;
		}break;
		case 2:				
			switch (com) {
		case 1:	result = "win";	break;
		case 2:	result = "tie";	break;
		case 3:	result = "lose";break;	
		}break;
		case 3:				
			switch (com) {
		case 1:	result = "lose";break;
		case 2:	result = "win";	break;
		case 3:	result = "tie";	break;	
		}break;
		default:
			break;
	}
	return result;
	}

	@Override
	public String getResult(String result) {
		return "플레이어 : "+rps.getValue(rps.getPlay())
				+ "\n컴퓨터 : " +rps.getValue(rps.getComp())
				+ "\n결과 : "+this.playGame(rps.getPlay());
	}
}
