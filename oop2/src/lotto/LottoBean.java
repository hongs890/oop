package lotto;

/**
 * @date  : 2016. 6. 23.
 * @author: 배근홍
 * @file  : LottoBean.java
 * @story :
 */
public class LottoBean {
	private int money, number;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getNumber() {
		this.setNumber();
		return number;
	}

	public void setNumber() {
		this.number = (int)(Math.random()*45)+1; 
	}

}
