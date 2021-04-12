package mc.sn.day2;

public class TestOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int number = 123456;
//		int a = 1+1;
//		// number와 a를 출력하는 코드를 작성하시오
//		System.out.println(number);
//		System.out.println(a);
//		// 코드를 실행하여 결과를 확인하세요
//		
//		// number의 가장 끝자리 수를 분리하여 출력하는
//		// 코드를 작성하시오.
//		int splitNumber = number % 10;
//		System.out.println(splitNumber);
//		// 뒤에서 두번째 수를 분리해 보세요.
//		number = (int)(number  / 10.0);
//		System.out.println("number의 값은 >>> "+number);
//		
//		int num = 532;
//		// num --> 500으로 변환하는 코드를 작성하시오.
//		num = num / 100 *100;
//		System.out.println(num);
//		double pi = 3.14159;
//		int p = (int)pi;
//		System.out.println(p);
//		double pi2 = p;
//		System.out.println(pi2);
//		
//		byte b1 = 1;
//		byte b2 = 2;
//		int b3 = b1 + b2;
//		System.out.println(b3);
//		short s1 = 1;
//		int s2 = s1 + b1;
//		System.out.println("---------------------");
//		System.out.println("1"+1);
//		System.out.println(2+"2");
		int sum = 0;
		int number = 1234;
		int splitNumber = 0;
		
		splitNumber = number % 10;
		System.out.println(splitNumber);
		number = number / 10;
		//System.out.println(number);
		sum = sum + splitNumber;
		
		splitNumber = number % 10;
		System.out.println(splitNumber);
		number = number / 10;
		//System.out.println(number);
		sum = sum + splitNumber;
		
		splitNumber = number % 10;
		System.out.println(splitNumber);
		number = number / 10;
		//System.out.println(number);
		sum = sum + splitNumber;
		
		splitNumber = number % 10;
		System.out.println(splitNumber);
		number = number / 10;
		//System.out.println(number);
		sum = sum + splitNumber;
		
		System.out.println(sum);
		
		
	}

}
/*
 * 연산자의 의미를 먼저 생각하고 연산자의 용례를 학습하면 됩니다.
 * 산술연산자는 원래 알고 있던 용법과 동일하고
 * 나머지 연산의 경우는 신경써서 학습하면 됩니다.
 * 주의점은 데이터타입의 확장을 신경쓰면 됩니다.
 * 
 * 조건연산자는 제어문 학습시 다시 학습하겠습니다.
 * 삼항연산자도 제어문 학습시 다시 하겠습니다.
 * 
 * int number = 1234를 뒤에서 부터 하나씩 분리하여 출력하고
 * 합계를 구한후 마지막에 합계를 출력하는 코드를 작성하세요
 */
