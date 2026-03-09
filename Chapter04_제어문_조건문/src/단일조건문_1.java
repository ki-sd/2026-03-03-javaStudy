
public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*50)+51;
		int num2 = (int)(Math.random()*50)+51;
		int num3 = (int)(Math.random()*50)+51;
		
		int max=num1;
		if(max<num2)
			max=num2;
		if(max<num3)
			max=num3;
		
		System.out.println("최대값:"+max);
		
		int min=num1;
		if(min>num2)
			min=num2;
		if(min>num3)
			min=num3;
		
		System.out.println("최소값:"+min);
		
		int mid=num1+num2+num3-max-min;
		
		System.out.println("중간값:"+mid);
	}

}
