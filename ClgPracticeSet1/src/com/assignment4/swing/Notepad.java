package com.assignment4.swing;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Notepad {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Notepad");
		jFrame.setSize(600, 400);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jPanel = new JPanel();
		jFrame.add(new Button("-"));
		jFrame.add(new Button("\u25A1"));
		jFrame.add(new Button("X"));

		JMenuBar jMenuBar = new JMenuBar();
		JMenu jMenuF = new JMenu("File");
		JMenu jMenuE = new JMenu("Edit");
		JMenu jMenuH = new JMenu("Help");

		JMenuItem jMenuItemCut = new JMenuItem("Cut");
		JMenuItem jMenuItemCopy = new JMenuItem("Copy");
		JMenuItem jMenuItemPaste = new JMenuItem("Paste");
		JMenuItem jMenuItemSelectAll = new JMenuItem("Select All");

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == jMenuItemCut) {
					System.out.println("Cut");
				} else if (e.getSource() == jMenuItemCopy) {
					System.out.println("Copy");

				} else if (e.getSource() == jMenuItemPaste) {
					System.out.println("Paste");

				} else {

					System.out.println("Select All");
				}
			}
		};
		jMenuItemCut.addActionListener(actionListener);
		jMenuItemCopy.addActionListener(actionListener);
		jMenuItemPaste.addActionListener(actionListener);
		jMenuItemSelectAll.addActionListener(actionListener);

		jMenuE.add(jMenuItemCut);
		jMenuE.add(jMenuItemCopy);
		jMenuE.add(jMenuItemPaste);
		jMenuE.add(jMenuItemSelectAll);
		
		jMenuBar.add(jMenuF);
		jMenuBar.add(jMenuE);
		jMenuBar.add(jMenuH);
		
		jFrame.setJMenuBar(jMenuBar);
		
		
		jFrame.add(jPanel);
		jFrame.setVisible(true);
	}
}
