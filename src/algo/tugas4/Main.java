package algo.tugas4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		boolean isContinue = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(isContinue) {
			System.out.println("Pilih soal: (1 == soal no 1, 2 == soal no 2)");
			int choose = 0;
			
			AbstractSoal soal = null;
			
			choose = new Integer(br.readLine());
			
			execute(choose, soal);
			
			System.out.println();
			System.out.println("Lagi ? (y/t)");
			String s = br.readLine();
			
			if(!"y".equals(s)) {
				isContinue = false;
			}
		}

		br.close();
		
	}
	
	private static void execute(int choose, AbstractSoal soal) throws Exception {
		
		switch (choose) {
		case 1:
			soal = new Soal1();
			break;

		case 2:
			soal = new Soal2();
			break;

		default:
			System.out.println("soal tidak diketahui");
			break;
		}
		
		if (soal != null) {
			soal.opening();
			soal.answer();
		}
	}

}
