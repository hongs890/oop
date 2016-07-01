package lotto;

/**
 * @date  : 2016. 6. 23.
 * @author: 배근홍
 * @file  : LottoServiceImpl.java
 * @story :
 */
public class LottoServiceImpl implements LottoService {

	private int[][]lottos;
	private int[] lotto; // 한줄값 
	private int count; // 돈에 따른 회전수 
	
	public LottoServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setLottos(LottoBean lot) {
		// 회전수를 입력받아서 매트릭스로 로또 추첨
		this.count = count(lot);
		this.lottos = new int[count][6];
		this.lotto = new int[6];
		int i = 0;
		
		if (count < 0) {
			this.lottos = null;
		} else {
			for (count = 0; count < lottos.length; count++) {
				while (true) {
				lot.setNumber();
				int num = lot.getNumber();
				if (isDuplication(count, num)) {
					continue;
				}
				this.lottos[count][i] = num;
					i++;
				if (i==lottos[count].length) {
					i=0;
					break;
				}
			}
			}
		}
	}
	

	@Override
	public int[][] getLottos() {
		// 로또를 가져온다(완성) 
		return lottos;
	}

	@Override
	public boolean isDuplication(int count, int num) {
		// 중복방지 (완성)
		for (int i = 0; i < lottos[count].length; i++) {
			if (lottos[count][i]==num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void sort(int[] lot) {
		// 오름차순을 정렬 (줄단위로 해당) 
		for (int i = 0; i < lot.length-1; i++) {
			for (int j = 0; j < lot.length-i -1; j++) {
				if (lot[j]>lot[j+1]) {
					//구글링으로 스왑정렬을 응용한 코드를 입력하세요
					int temp = lot[j];
					lot[j] = lot[j+1];
					lot[j+1] = temp;
				}
			}
		}
	}

	@Override
	public int count(LottoBean lot) {
		return lot.getMoney() / 1000; 
	}

}
