package jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import swing.gridlayout;

public class jframe_ornek2 extends JFrame {
	public static void main(String[] args) {
		jframe_ornek2 jornek=new jframe_ornek2();
	}
	public jframe_ornek2()
	
	{
		
		setVisible(true);
		setSize(600,600);
		setLayout(new BorderLayout());
		JPanel centerPanel=new JPanel();
		add(centerPanel,BorderLayout.CENTER);
		centerPanel.setLayout(new GridLayout(3,1));
		JPanel altPanel=new JPanel();
		centerPanel.setBackground(new Color(50,48,65));
		add(altPanel,BorderLayout.SOUTH);
		altPanel.setLayout(new FlowLayout());
		altPanel.setPreferredSize(new Dimension(200, 200));
		
		JButton btn1=new JButton("btn1");
		btn1.setBackground(new Color(100, 0, 0));
		btn1.setForeground(new Color(0, 0, 100));
		btn1.setFont(new Font("verdana",Font.ITALIC, 25));
		JButton btn2=new JButton("btn1");
		JButton btn3=new JButton("btn1");
		centerPanel.add(btn1);
		centerPanel.add(btn2);
		centerPanel.add(btn3);
		JLabel label1=new JLabel("label1");
		JLabel label2=new JLabel("label1");
		JLabel label3=new JLabel("label1");
		altPanel.add(label1);
		altPanel.add(label2);
		altPanel.add(label3);



	}
	
	

}
