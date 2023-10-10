package com.collection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CountChar implements ActionListener {

	JLabel l1, l2;
	JTextArea area;
	JButton btn;

	public CountChar() {
		JFrame f = new JFrame();
		l1 = new JLabel();
		l1.setBounds(50, 25, 100, 30);
		l2 = new JLabel();
		l2.setBounds(75, 25, 250, 200);
		area = new JTextArea();
		area.setBounds(20,75,250,200);
		btn = new JButton("Count Words");
		btn.setBounds(100, 300, 120, 30);
		btn.addActionListener(this);
		f.add(l1);
		f.add(l2);
		f.add(area);
		f.add(btn);
		f.setSize(450, 450);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new CountChar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = area.getText();
		String[] words = text.split("\\s");
		l1.setText("Words : " + words.length);
		l2.setText("Characters :" + text.length());

	}
}
