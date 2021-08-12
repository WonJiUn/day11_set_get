package day11_set_get;

public class Ex03_set_get {
	private int num;
	private int age;
	private String name;
	//우클릭 - 소스 - 제너레이트 게터 앤 세터 (자동생성)
	//나중에 자바에서 제공하는 편리한 기능을 이용하기 위해 필요하다
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("num : " + num);
	}
}
