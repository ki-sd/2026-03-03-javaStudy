package com.sist.lang;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

// toString() 활용
public class Object_4 extends JFrame implements ItemListener {
	JComboBox box=new JComboBox();
	JLabel la=new JLabel("",JLabel.CENTER);
	public Object_4() {
		box.addItem("홍길동"); //Object
		box.addItem("심청이");
		box.addItem("박문수");
		
		add("North",box);
		add("Center",la);
		
		setSize(300,350);
		setVisible(true);
		
		box.addItemListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Object_4();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box) {
			String name=box.getSelectedItem().toString();
			// Object를 문자열로 변환 => toString()
			// => 윈도우
			la.setText(name);
		}
	}

}
