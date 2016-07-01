package simpleRPS1;

/**
 * @date  : 2016. 6. 21.
 * @author: 배근홍
 * @file  : SimpleRPSServiceImpl.java
 * @story :
 */
public class SimpleRPSServiceImpl implements SimpleRPSService {

	@Override
	public String gameEngine(String result, String p) {
		switch (p) {
		case "1":				
		switch ((int)(Math.random()*3)+1) {
		case 1:	result = "tie";	break;			
		case 2:	result = "lose";break;
		case 3:	result = "win";	break;
		}break;
		case "2":				
		switch ((int)(Math.random()*3)+1) {
		case 1:	result = "win";	break;
		case 2:	result = "tie";	break;
		case 3:	result = "lose";break;	
		}break;
		case "3":				
		switch ((int)(Math.random()*3)+1) {
		case 1:	result = "lose";break;
		case 2:	result = "win";	break;
		case 3:	result = "tie";	break;	
		}break;
	}
	return result;
	}
}
