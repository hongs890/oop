package simpleRPS2;

import java.util.Random;

/**
 * @date  : 2016. 6. 21.
 * @author: 배근홍
 * @file  : SimpleRPSServiceImpl.java
 * @story :
 */
public class SimpleRPSServiceImpl implements SimpleRPSService {

	@Override
	public String playGame(String p) {
		Random r = new Random();
		String result="";
		switch (p) {
		case "1":				
		switch (r.nextInt(3)+1) {
		case 1:	result = "tie";	break;			
		case 2:	result = "lose";break;
		case 3:	result = "win";	break;
		}break;
		case "2":				
		switch (r.nextInt(3)+1) {
		case 1:	result = "win";	break;
		case 2:	result = "tie";	break;
		case 3:	result = "lose";break;	
		}break;
		case "3":				
		switch (r.nextInt(3)+1) {
		case 1:	result = "lose";break;
		case 2:	result = "win";	break;
		case 3:	result = "tie";	break;	
		}break;
	}
	return result;
	}

	@Override
	public String getResult(String result) {
		return "플레이어 : "+result;
	}
}
