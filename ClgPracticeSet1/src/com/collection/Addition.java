package com.collection;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Addition implements ActionListener {

	JTextField tf1, tf2, tf3;
	JButton b1, b2;

	public Addition() {
		JFrame f = new JFrame();
		f.setBackground(Color.ORANGE.brighter());
		f.setTitle("Addtion/Subtraction of Two Number");
		tf1 = new JTextField();
		tf1.setBounds(50, 50, 150, 20);
		tf2 = new JTextField();
		tf2.setBackground(Color.ORANGE.brighter());
		tf2.setBounds(50, 100, 150, 20);
		tf3 = new JTextField();
		tf3.setBounds(50, 150, 150, 20);
		tf3.setEditable(false);
		b1 = new JButton("+");
		b1.setBounds(50, 200, 50, 50);
		
		b2 = new JButton("-");
		b2.setBounds(120, 200, 50, 50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Addition();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = 0;
		if (e.getSource() == b1) {
			c = a + b;
		} else if (e.getSource() == b2) {
			c = a - b;
		}
		String result = String.valueOf(c);
		tf3.setText(result);
	}

}