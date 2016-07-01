package gameRps;

/**
 * @date  : 2016. 6. 20.
 * @author: 배근홍
 * @file  : RPSBean.java
 * @story :
 */
public class RPSBean {
	private String winner;
	private int play, comp;

	
	public RPSBean(int play) {
		this.play=play;
	}
	

	public void setComp(int comp){
		this.comp=comp;
	}
	
	public void setWinner(String winner){
		this.winner=winner;
	}
	//-------------------------------
	public String getWinner(){
		return this.winner;
	}
	public int getPlay(){
		return this.play;
	}
	public int getComp(){
		return this.comp;
		
	}
	@Override
	public String toString() {
		
		String playuser="",playcomp="";
		switch (this.getPlay()) {
		case 1:	playuser="가위"; break;
		case 2:	playuser="바위";break;
		case 3: playuser="보";break;
		}
		switch (this.getComp()) {
		case 1:	playcomp="가위"; break;
		case 2:	playcomp="바위";break;
		case 3: playcomp="보";break;
		}
		
		return "결과 \n승자="+winner+" \n플레이어="+playuser+"\n컴퓨터="+playcomp;
	}
}
