//	3명의 학생 => 국/영/수 점수입력 => 총점,평균,학점,등수
import java.util.Scanner;
public class 등수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		char[] score = new char[3];
		int[] rank = new int[3];
		String[] name = new String[3];
		
		for(int i=0;i<kor.length;i++) {
			System.out.print((i+1)+"번째 학생의 이름:");
			name[i]=sc.nextLine();
			System.out.print((i+1)+"번째 학생의 국어 점수:");
			kor[i]=sc.nextInt();
			System.out.print((i+1)+"번째 학생의 영어 점수:");
			eng[i]=sc.nextInt();
			System.out.print((i+1)+"번째 학생의 수학 점수:");
			math[i]=sc.nextInt();
			sc.nextLine();
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			if(avg[i]>90) 
				score[i]='A';
			else if(avg[i]>80)
				score[i]='B';
			else if(avg[i]>70)
				score[i]='C';
			else if(avg[i]>60)
				score[i]='D';
			else
				score[i]='F';
		}
		for(int i=0;i<avg.length;i++) {
			rank[i]=1;
			for(int j=0;j<avg.length;j++) {
				if(avg[i]<avg[j])
					rank[i]++;
			}
		}
		for(int i=0;i<kor.length;i++) {
			System.out.printf("%5s%5d%5d%5d%7d%7.2f%3c%3d\n",
					name[i],kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
		
	}

}
