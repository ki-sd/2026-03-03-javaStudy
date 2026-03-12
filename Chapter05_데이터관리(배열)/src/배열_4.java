
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"홍길동","이순신","강감찬","박문수","김두한"};
		String[] address={"서울","경기","강원","제주","부산"};
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+"("+address[i]+")");
		}
	}

}
