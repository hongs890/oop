package simpleRPS3;

import java.util.Random;

public interface SimpleRPSService {
	public abstract String playGame(int player);
	public abstract String getResult(String result);
}
