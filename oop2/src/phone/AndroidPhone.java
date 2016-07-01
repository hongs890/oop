package phone;

/**
 * @date  : 2016. 6. 22.
 * @author: 배근홍
 * @file  : AndroidPhone.java
 * @story :
 */
public class AndroidPhone extends Iphone {
	public final static String BRAND = "갤럭시노트";
	private String size, data;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getData() {
		return data;
	}
	public void setData(String call, String size, String data) {
		super.setCompany("삼성");
		super.setPortable(true);
		super.setCall(call);
		this.setSize(size);
		this.data = KIND+"이기때문에\n"+super.getMove()+",\n "
				+ "" +super.getCompany()+ " , "
				+ "" +super.getCall()+ " (이)라고 통화하고\n"
				+ this.getSize()+"인치 큰 화면을 통해서\n"
				+ "카톡으로" +data+" 메시지 전달했다.";
		
	}
	@Override
	public String toString() {
		return getData();
	}
}
