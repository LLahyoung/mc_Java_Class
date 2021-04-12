package mc.sn.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2~100까지 출력하는 반복문 작성한다. --> for의 문법을 알아야 함.
		int number = 0;
		for(int i=0;i<99;i++) {
			System.out.println(i+2);
		}
//		1~100까지의 수가 하나씩 올때 마다 소수를 판별하는 로직을	
//		거치게 한다. --> 소수의 정의를 알아야 한다.

//		소수의 정의를 알고리즘으로 변환한다.
//
		number = 5;
//		[1과 자기자신으로만 나누어떨어지는 수]
		int count = 0;
		for (int i=1;i<6;i++) {
			if (number % i == 0) { // ? 1~5까지의 수가 옴
				count ++;
			}
		}
//		로직을 거친 수가 소수인지를 확인한다. --> 소수확인 
//		순서를 결정한다. --> if 문 문법을 알아야 한다.
		int sum = 0;
		if (count==2) {
//			해당 수를 변수에 할당하고 소수가 할당될 때 마다 누적시킨다.
//			--> 누적 코드를 알아야 한다.
			sum  = sum + number;
		}

//		반복문이 끝나면 해당 변수를 출력한다.
//		--> 반복문 끝나는 부분을 알아야 한다.
		System.out.println(sum);
	}

}
