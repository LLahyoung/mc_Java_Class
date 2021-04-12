package mc.sn.day4;

public class Studio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studio s = new Studio();
		s.readyLottoBall();
	}
	
	public void readyLottoBall() {
		LottoBall[] ballBox = new LottoBall[45];
		LottoBall ball = null;
		int number = 0;
		for(int i=0;i<45;i++) {
			number = i + 1;
			ball = new LottoBall(number+"");
			ballBox[i] = ball;
		}
		this.printBall(ballBox);
	}
	
	public void printBall(LottoBall[] balls) {
		for (LottoBall ball : balls) {
			System.out.println(ball.getBallNumber());
		}
	}

}
