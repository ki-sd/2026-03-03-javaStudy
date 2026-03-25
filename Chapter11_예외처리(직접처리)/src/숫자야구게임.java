import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
interface Rand{
	public void rand(int[] com);
}
public class 숫자야구게임 extends JFrame implements ActionListener, Rand {
	// 힌트
	JTextArea ta=new JTextArea();
	JTextField tf=new JTextField(10);
	JButton start=new JButton("시작");
	JButton end=new JButton("종료");
	// 게임에 필요한 변수
	private int[] com=new int[3];
	private int[] user=new int[3];
	private int s,b; // 0
	
	// 화면 UI
	public 숫자야구게임() {
		JScrollPane js=new JScrollPane(ta);
		JPanel p=new JPanel();
		p.add(tf);p.add(start);p.add(end);
		ta.setEditable(false); //편집방지
		tf.setEnabled(false); //비활성화
		add("Center",js);
		add("South",p);
		setSize(350, 400);
		setVisible(true);
		
		start.addActionListener(this);
		end.addActionListener(this);
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new 숫자야구게임();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==end) {
			JOptionPane.showMessageDialog(this,	"프로그램 종료");
			System.exit(0);
		}
		else if(e.getSource()==start) {
			JOptionPane.showMessageDialog(this, "야구게임을 시작합니다!");
			//난수 발생
			rand(com); //Call By Reference
			tf.setEnabled(true);
			tf.requestFocus();
			start.setEnabled(false);
			
		}
		else if(e.getSource()==tf) {
			// 입력값 읽기
			String str=tf.getText();
			int input=0;
			try {
				input=Integer.parseInt(str);
			}catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, "정수만 입력이 가능합니다");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			if(input<99 || input>999) {
				JOptionPane.showMessageDialog(this, "세자리 정수만 입력이 가능합니다");
				tf.setText("");
				tf.requestFocus();
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			//중복된 숫자 사용X
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				JOptionPane.showMessageDialog(this, "중복된 수는 사용하실 수 없습니다");
				tf.setText("");
				tf.requestFocus();
			}
			//0 입력X
			else if(user[0]==0 || user[1]==0 || user[2]==0) {
				JOptionPane.showMessageDialog(this, "0은 입력하실 수 없습니다");
				tf.setText("");
				tf.requestFocus();
			}
			s=0;
			b=0;
			for(int i=0;i<3;i++) {   //com
				for(int j=0;j<3;j++) {   //user
					if(com[i]==user[j]) {
						if(i==j) 
							s++;
						else
							b++;
					}
				}
			}
			// 힌트
			String hit=String.format("Input Number:%d,Result:%dS=%dB\n",input,s,b);
			ta.append(hit);
			if(s==3) {
				JOptionPane.showMessageDialog(this, "Game Over!");
				System.exit(0);
			}	
			tf.setText("");
			tf.requestFocus();
		}
	}
	@Override
	public void rand(int[] com) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			com[i]=(int)(Math.random()*9)+1; //1~9
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
	}

}
