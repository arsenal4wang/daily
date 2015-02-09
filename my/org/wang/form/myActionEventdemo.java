package org.wang.form;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class actionHandle {

	private JFrame frame = new JFrame("欢迎光临");
	private JButton but = new JButton("显示");
	private JLabel label = new JLabel();
	private JTextField textField = new JTextField(10);
	private JPanel panel = new JPanel();

	public actionHandle() {
		Font fn = new Font("Serief", Font.ITALIC + Font.BOLD, 28);
		label.setFont(fn);
		label.setText("等待输入的内容");
		but.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == but) {
					label.setText(textField.getText());
					textField.setText("");
				}
			}
		});
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.out.println("windonsClosing--> 窗口关闭");
				System.exit(1);
			}
		});// 加入事件 匿名类。
		frame.setLayout(new GridLayout(2, 1));
		panel.setLayout(new GridLayout(1, 2));
		panel.add(textField);
		panel.add(but);
		frame.add(panel);
		frame.add(label);
		frame.pack();

		frame.setSize(300, 100);
		frame.setBackground(Color.BLUE);
		frame.setLocation(300,500);
		frame.setVisible(true);
	}
}

public class myActionEventdemo {

	public static void main(String[] args) {
		new actionHandle();
	}

}
