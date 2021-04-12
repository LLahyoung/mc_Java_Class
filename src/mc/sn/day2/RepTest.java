package mc.sn.day2;

public class RepTest {
	// count 에러를 수정하세요
	// 1~10까지 연속된 숫자를 출력하는 것이 목적
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<10;i++) {
			
			count = count + 1;
			if (count%2==0) {
				//짝수만 출력
				//System.out.print(" 짝수 "+count);
			} else {
				//System.out.print(" 홀수 "+count);
			}
		}
		// 1~50까지의 연속된 숫자를 이용하여 3,6,9일때 
		//짝을 출력하는 코드작성하시오
		// 36 --> 짝짝, 3->짝 , 1 --> 아무것도 출력안함
		for(int i=1;i<51;i++) {
			int cnt = 0;
			if (i<11) {
				if (i==3) {
					cnt++;
				} else if(i==6) {
					cnt++;
				} else if(i==9) {
					cnt++;
				}
			} else {
				//숫자 분리 코드
				//분리된 숫자 평가하는 코드
			}
			// cnt 를 기준으로 출력
			if (cnt == 1) {
				System.out.println(i+" >> 짝");
			} else if(cnt == 2){
				System.out.println(i+" >> 짝짝");
			}
			
		}
		
	}

}
