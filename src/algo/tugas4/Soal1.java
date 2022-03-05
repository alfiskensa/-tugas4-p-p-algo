package algo.tugas4;

import java.util.Date;

public class Soal1 extends AbstractSoal {

	
	public void answer() throws Exception {
		Date startDate = sdf.parse("2022-03-05 08:00:00");
		long timeMillisA = startDate.getTime();
		long timeMillisB = timeMillisA+(60*1000);
		boolean isAComplete = false;
		boolean isBComplete = false;
		
		Double exploredA = 0.0;
		long travelTimeA = 0l;
		
		double exploredB = 0.0;
		long travelTimeB = 0l;
		
		long totalTimeBOverlapA = 0l;
		
		while(!isAComplete || !isBComplete) {
			if(exploredA <= distance) {
				travelTimeA+= 1000l;
				
				if((10*1000) > travelTimeA) {
					exploredA+= 2;
				} else if((20*1000) > travelTimeA) {
					exploredA+= 2.1;
				} else {
					exploredA+= 0.1;
				}
				
			} else {
				isAComplete = true;
			}
			
			if((travelTimeA > (60*1000)) && (exploredB <= distance)){
				travelTimeB+= 1000l;
				exploredB+= 3;
				
				if(totalTimeBOverlapA == 0) {
					if(exploredB > exploredA) {
						totalTimeBOverlapA = travelTimeB;
					}
				}
			} else {
				isBComplete = true;
			}
		}
		
		System.out.println("Waktu tempuh Ali: "+(travelTimeA/1000)+" detik");
		System.out.println("Jarak yang ditempuh Ali: "+exploredA+" m");
		System.out.println("Waktu sampai Ali: "+sdf.format(new Date(timeMillisA+travelTimeA)));
		System.out.println("");
		System.out.println("Waktu tempuh Badu: "+(travelTimeB/1000)+" detik");
		System.out.println("Jarak yang ditempuh Badu: "+exploredB+" m");
		System.out.println("Waktu sampai Badu: "+sdf.format(new Date(timeMillisB+travelTimeB)));
		System.out.println("");
		System.out.println("Waktu Badu mendahului Ali: "+sdf.format(new Date(timeMillisB+totalTimeBOverlapA)));

	}
	
	@Override
	public void opening() {
		// TODO Auto-generated method stub
		System.out.println("+==============================+");
		System.out.println("| NIM: 2111600819              |");
		System.out.println("| Nama: Alfi Ramdhani          |");
		System.out.println("| Program Tugas No. 1          |");
		System.out.println("+==============================+");
	}
	
}
