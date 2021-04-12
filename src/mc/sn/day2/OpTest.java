package mc.sn.day2;

public class OpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		int day = 0;
		//System.out.print("\t");
		int space = 0;
		for(int i=0;i<31;i++) {
			day = i+1;
			System.out.print(day+"\t");
			if ((space+day)%7==0) {
				System.out.println();
			} 
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
