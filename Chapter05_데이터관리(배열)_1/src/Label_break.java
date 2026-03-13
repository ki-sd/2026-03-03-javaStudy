
public class Label_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa:
		for(int i=1;i<=3;i++) {
			for(int k=1;k<=3;k++) {
				System.out.println("i="+i+" ,k="+k);
			}
			for(int j=1;j<=3;j++) {
				if(j==2) break aaa;
				System.out.println("i="+i+" ,j="+j);
			}
		}
	}

}
