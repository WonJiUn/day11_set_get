package day11_set_get;

public class Quiz01_MainClass {
	public static void main(String[] args) {
		
		Quiz01 q = new Quiz01();
		
		boolean bool = true;
		
		while(bool) {
			System.out.println("1.�α���  2.����  3.�α׾ƿ�");
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
				System.out.println("�α׾ƿ� �Ǿ����ϴ�");
				bool = q.logout();
				break;
			default : System.out.println("1~3�߿� �ϳ��� �Է����ּ���");
			}
		}
		
		
		
		
		
	}
}
