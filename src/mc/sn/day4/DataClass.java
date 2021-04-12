package mc.sn.day4;

public class DataClass {
	public DataClass() {}
	public DataClass(String sex) {
		this.sex = sex;
	}
	//VO(Value Object)라고 합니다.
	//DTO(Data Transfer Object)라고 부르기도 합니다.
	private String name;
	private String sex;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	private void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return this.sex;
	}
	
}
