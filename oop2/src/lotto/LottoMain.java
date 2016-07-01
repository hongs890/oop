package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;


/**
 * @date  : 2016. 6. 23.
 * @author: 배근홍
 * @file  : LottoController.java
 * @story :
 */
public class LottoMain {
		public static void main(String[] args) {
			LottoService service = new LottoServiceImpl();
			LottoBean lot = new LottoBean();
			StringBuffer buf = new StringBuffer();
//=================================================================			
			lot.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마치 구입하시겠습니까")));
			service.setLottos(lot);
			int[][] lottos = service.getLottos();
			for (int i = 0; i < lottos.length; i++) {
				/*service.sort(lottos[i]);*/
				Arrays.sort(lottos[i]);
				for (int j = 0; j < lottos[i].length; j++) {
					buf.append(lottos[i][j]+"\t");
				}
				buf.append("/");
			}
			System.out.println("로또\n"+buf);
			int lottoSerialNo = (int) (Math.random()*999999+100000);
			
			
			File output = new File("C:\\eclipse\\lotto\\"+lottoSerialNo+".txt");
			BufferedWriter bw = null;
			FileWriter fw = null;
			String[] myLotto = buf.toString().split("/");
			try{
			// 뒤에 true는 이어 써라 
			bw = new BufferedWriter(new FileWriter(output, true));
				for (String lots : myLotto) {
					lots += System.getProperty("line.separator");
					bw.write(lots);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try{
					bw.flush(); // 화장실 물내림
					bw.close(); // 화장실 문닫고 나감
				} catch(IOException e){
					e.printStackTrace();
				}
			}
		}
}
