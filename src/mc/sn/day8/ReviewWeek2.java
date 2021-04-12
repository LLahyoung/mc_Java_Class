package mc.sn.day8;

public class ReviewWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewWeek2 instance = new ReviewWeek2();

		// 2. 아래의 test1() 호출에 대해서 직접 예외처리하는 코드 - try catch
		try {
			instance.test1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		instance.test2();
		
		instance.test4();
	}

	// throws - try catch 예외처리
	public void test1() throws ArrayIndexOutOfBoundsException {
		int[] a = new int[0];
		System.out.println(a[0]);

		// 1. exception을 나중에 처리하도록 메소드를 수정 - throws
	}

	// 증감 연산자
	public void test2() {
		// 31번 라인이 출력되면 어떤 값을 출력할까요?
		// 32번 라인이 출력되면 어떤 값을 출력할까요?
		int x = 10;
		System.out.println("x++ = " + x++);
		System.out.println("x = " + x);
	}

	//오버로딩 - 파라미터 개수가 다르거나 타입이 다르거나
	public void test3() {}
	public void test3(int a) {}
	public void test3(String b) {}
	
	//향상된 for문 
	public void test4() {
		int[] numbers = {1,2,3};
		//1. 인덱스 없이 배열의 내용을 출력하는 코드 작성
		for(int temp: numbers) {
			System.out.println(temp);
		}
	}
}
