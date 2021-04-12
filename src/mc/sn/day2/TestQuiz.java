package mc.sn.day2;

public class TestQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345678;
		int sum = 0;
		
		// 각 자리수 분리하고 합계를 출력하는 코드 작성
		int splitNumber = 0;
		
		// 반복문의 형식(반복은 4회)
		for(int i=0;i<8;i++) // 몇번 반복하는지 표현
		{
			splitNumber = number % 10;
			number = number / 10;
			sum = sum + splitNumber;
			//System.out.println(splitNumber);
		}
		//System.out.println(sum);
		/*
		splitNumber = number % 10;
		number = number / 10;
		sum = sum + splitNumber;
		System.out.println(splitNumber);
		
		splitNumber = number % 10;
		number = number / 10;
		sum = sum + splitNumber;
		System.out.println(splitNumber);
		
		splitNumber = number % 10;
		number = number / 10;
		sum = sum + splitNumber;
		System.out.println(splitNumber);
		*/
		
		// 1~10까지 차례로 출력하는 코드를 for를 이용하여
		// 작성하고 확인하시오
		int sum2 =0;
		int count = 1;
		// 1~10까지 합계를 구하여 출력하시오
		for(int i=0;i<10;i++) { //for는 리스트계열하고 같이 쓰는 것이 일반적
			sum2 = sum2 + count; //누적
			System.out.print(count+" ");
			count += 1;
			
		}
		//누적방법을 사용
		System.out.println(sum2);
	}

}
