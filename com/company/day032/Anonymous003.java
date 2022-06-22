package com.company.day032;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class AnonyEvent003{
	JFrame frame;
	JButton button;
	
	public AnonyEvent003() {
		frame = new JFrame();
		button = new JButton();
	}
	
	public void createGraphic() {
		button.setPreferredSize(new Dimension(250, 100));
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
		button.setText("COUNT");
		
		frame.setLayout(new FlowLayout());
		frame.add(button);
		frame.setSize(300, 150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/////////////////////////////////////////////////////////////////
		button.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "클릭");
			}
		});
	}

}

public class Anonymous003 {
	public static void main(String[] args) {
		System.out.println("위의 EventHandeler를 익명 클래스로 변경하시오");
		new AnonyEvent003().createGraphic();
	}
}
