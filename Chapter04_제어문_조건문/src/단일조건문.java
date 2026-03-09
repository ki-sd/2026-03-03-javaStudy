
public class 단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
		if(num%3==0)
		{
			System.out.println(num+"는 3의 배수입니다.");
		}
		else if(num%5==0)
		{
			System.out.println(num+"는 5의 배수입니다.");
		}
		else if(num%7==0)
		{
			System.out.println(num+"는 7의 배수입니다.");
		}
		
		char c='A';
		if(c>='A' && c<='Z')
		{
			System.out.println(c+"는 대문자입니다.");
		}
		if(c>='a' && c<='z')
		{
			System.out.println(c+"는 소문자입니다.");
		}
		if(c>='0' && c<='9')
		{
			System.out.println(c+"는 숫자입니다.");
		}
		
		String id="admin";
		String pwd="1234";
		
		if(id.equals("admin") && pwd.equals("1234"))
		{
			System.out.println("로그인되었습니다.");
		}
		if(!(id.equals("admin") && pwd.equals("1234")))
		{
			System.out.println("아이디나 비밀번호가 틀립니다.");
		}
		if(id=="admin" && pwd=="1234")
		{
			System.out.println("로그인되었습니다.");
		}
	}

}
