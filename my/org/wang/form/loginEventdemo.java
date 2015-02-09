package org.wang.form;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


class loginCheck {

	private String name;
	private String password;

	public loginCheck(String name, String pass) {
		this.name = name;
		this.password = pass;
	}

	public boolean validate() {
		if ("Arsenal".equals(this.name) && "wang".equals(this.password)) {
			return true;
		} else {
			return false;
		}
	}
}

class loginactionHandle {

	private JFrame frame = new JFrame("欢迎光临");
	private JLabel labName = new JLabel("姓   名:");
	private JLabel labPass = new JLabel("密   码:");
	private JLabel labInfo = new JLabel("用户登录系统");
	private JButton submButton = new JButton("登陆");
	private JButton restButton = new JButton("重置");
	private JTextField nameText = new JTextField(10);
	private JPasswordField passText = new JPasswordField();
	private JPanel panel = new JPanel();

	public loginactionHandle() {
		Font fn = new Font("Serief", Font.ITALIC + Font.BOLD, 14);
		labInfo.setFont(fn);
		submButton.addActionListener(new ActionListener() {// 登陆按钮事件
					public void actionPerformed(ActionEvent arg0) {
						if (arg0.getSource() == submButton) {
							String nameString = nameText.getText();
							String pasString = new String(passText
									.getPassword());
							loginCheck log = new loginCheck(nameString,
									pasString);
							if (log.validate()) {
								labInfo.setText("登陆成功，欢迎--" + nameString
										+ "--光临");
								nameText.setText("");
								passText.setText("");
							} else {
								labInfo.setText("登录失败，错误的用户名或密码");
							}
						}
					}
				});

		restButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == restButton) {
					nameText.setText("");
					passText.setText("");
					labInfo.setText("用户登录系统");
				}
			}
		});

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				System.out.println("windonsClosing--> 窗口关闭");
				System.exit(1);
			}
		});// 加入事件 匿名类。
		frame.setLayout(null);
		labName.setBounds(5, 5, 50, 20);
		labPass.setBounds(5, 35, 50, 20);
		labInfo.setBounds(5, 65, 320, 35);
		nameText.setBounds(55, 5, 100, 20);
		passText.setBounds(55, 35, 100, 20);

		submButton.setBounds(155, 5, 70, 20);
		restButton.setBounds(155, 35, 70, 20);

		frame.add(labName);
		frame.add(labPass);
		frame.add(labInfo);
		frame.add(nameText);
		frame.add(passText);
		frame.add(submButton);
		frame.add(restButton);
		frame.pack();

		frame.setSize(280, 200);
		frame.setBackground(Color.BLUE);
		frame.setLocation(500,200);
		frame.setVisible(true);
	}
}

public class loginEventdemo {

	public static void main(String[] args) {
		new loginactionHandle();
	}
}
