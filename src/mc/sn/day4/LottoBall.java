package mc.sn.day4;

public class LottoBall {
	// 데이터 클래스
	private String ballNumber;
	private boolean isSelectedBall;
	
	// 볼 인스턴스를 사용하기 위해 필요한 메소드와 생성자를 구현하시오.
	// 필드의 set,get을 각각 한 세트씩 만드시오.
	// 생성자도 만드시오.
	public LottoBall(String ballNumber) {
		this.ballNumber = ballNumber;
		
	}
	public String getBallNumber() {
		
		return this.ballNumber;
	}
	
	public boolean getSelectedBall() {
		return this.isSelectedBall;
	}
	
//	public void setBallNumber(String ballNumber) {
//		this.ballNumber = ballNumber;
//	}
	public void setSelectedBall(boolean isSelectedBall) {
		this.isSelectedBall = isSelectedBall;
	}
}
