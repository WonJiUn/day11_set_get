package day11_set_get;

public class Quiz01_MainClass {
	public static void main(String[] args) {
		
		Quiz01 q = new Quiz01();
		
		boolean bool = true;
		
		while(bool) {
			System.out.println("1.로그인  2.가입  3.로그아웃");
			System.out.print(">>> ");
			q.selectNum();
			
			switch(q.getSelect()) {
			case 1:
				q.loginFunc(); 
				q.loginCheck(q.getLoginId(), q.getLoginPw());
				break;
			case 2:
				q.createAccount();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다");
				bool = q.logout();
				break;
			default : System.out.println("1~3중에 하나를 입력해주세요");
			}
		}
		
		
		
		
		
	}
}
