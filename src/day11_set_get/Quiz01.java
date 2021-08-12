package day11_set_get;

import java.util.Scanner;

public class Quiz01 {
	private int select;
	private String id, pw;
	private String loginId, loginPw;
	Scanner sc = new Scanner(System.in);
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getSelect() {
		return select;
	}
	public String getid() {
		return id;
	}
	public String getpw() {
		return pw;
	}
	public String getLoginId() {
		return loginId;
	}
	public String getLoginPw() {
		return loginPw;
	}
	public void selectNum() {
		select = sc.nextInt();
	}
	public void loginFunc() {
		System.out.print("아이디 입력 : ");
		loginId = sc.next();
		System.out.print("비밀번호 입력 : ");
		loginPw = sc.next();
	}
	public void loginCheck(String loginId, String loginPw) {
		if(loginId.equals(this.id) && loginPw.equals(this.pw)) {
			System.out.println("인증 통과");			
		}
		else {
			System.out.println("인증 실패");
		}
	}
	public void createAccount() {
		System.out.print("가입 id : ");
		this.id = sc.next();
		System.out.print("가입 pw : ");
		this.pw = sc.next();
		System.out.println("저장 완료");
	}
	public boolean logout() {
		return false;
	}
}
