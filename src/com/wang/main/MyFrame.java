package com.wang.main;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

import com.wang.go.Result;
import com.wang.state.Kripke;
import com.wang.state.State;

public class MyFrame extends JFrame {

	public static int i = 0;
	private JButton jButton1;
	private JTextField jTextField1;
	private JLabel jLabel2;
	private JButton jButton2;
	private JLabel jLabel3;
	private JTextField jTextField2;
	private JLabel jLabel0;
	private JTextField jTextField0;
	private JPanel jPanel1;
	private JMenuItem jMenuItem0;
	private JMenu jMenu0;
	private JMenuBar jMenuBar0;
	private JLabel jLabel4;
	private JTextField jTextField3;
	private JButton jButton3;
	private JButton jButton4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JButton jButton5;
	private JButton jButton7;
	private JButton jButton8;
	private JButton jButton9;
	private JButton jButton6;
	private JButton jButton10;
	private JScrollPane jScrollPane1;
	private JPanel jPanel2;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane2;
	private JLabel jLabel7;
	private static long t1;
	private static long t2;
	private JTextArea jTextArea2;
	private JPanel jPanel3;
	private JLabel jLabel8;
	private static final long serialVersionUID = 1L;
	private JButton jButton0;
	private JTextArea jTextArea0;
	private JScrollPane jScrollPane0;
	private JComboBox jComboBox0;
	private JPanel jPanel0;
	private JLabel jLabel1;
	public static String stateName[];
	public static int stateNum = 0;
	public static List<State> stateList = new ArrayList<State>();
	public static Kripke kripke = new Kripke();

	public static String formula = "";
	private JButton jButton11;
	private JButton jButton12;
	private JButton jButton13;
	private JButton jButton14;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";

	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MyFrame frame = new MyFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("CTL Verification Tool (CVT)  v1.0");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setIconImage(Toolkit.getDefaultToolkit().createImage(
						"images/QQ.jpg"));// 设置左上角图标
				frame.setResizable(false);// 使创口不能最大化
				frame.pack();
			}
		});
	}

	public MyFrame() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Leading(6, 234, 10, 10),
				new Leading(27, 412, 10, 10)));
		add(getJPanel3(), new Constraints(new Bilateral(0, 0, 311),
				new Trailing(0, 26, 10, 10)));
		add(getJPanel1(), new Constraints(new Leading(243, 413, 10, 10),
				new Leading(27, 210, 10, 10)));
		add(getJPanel2(), new Constraints(new Leading(252, 417, 10, 10),
				new Leading(239, 206, 10, 10)));
		setJMenuBar(getJMenuBar0());
		setSize(686, 509);
	}

	private JButton getJButton14() {
		if (jButton14 == null) {
			jButton14 = new JButton();
			jButton14.setText("EX");
			jButton14.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton14ActionActionPerformed(event);
				}
			});
		}
		return jButton14;
	}

	private JButton getJButton13() {
		if (jButton13 == null) {
			jButton13 = new JButton();
			jButton13.setText("AX");
			jButton13.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton13ActionActionPerformed(event);
				}
			});
		}
		return jButton13;
	}

	private JButton getJButton12() {
		if (jButton12 == null) {
			jButton12 = new JButton();
			jButton12.setText("∨");// or
			jButton12.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton12ActionActionPerformed(event);
				}
			});
		}
		return jButton12;
	}

	private JButton getJButton11() {
		if (jButton11 == null) {
			jButton11 = new JButton();
			jButton11.setText("∧");// and
			jButton11.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton11ActionActionPerformed(event);
				}
			});
		}
		return jButton11;
	}

	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setFont(new Font("宋体", Font.ITALIC, 14));
			jLabel8.setText("欢迎使用分支时态逻辑CTL验证工具CVT v1.0版");
		}
		return jLabel8;
	}

	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jPanel3 = new JPanel();
			jPanel3.setBorder(BorderFactory.createBevelBorder(
					BevelBorder.LOWERED, null, null, null, null));
			jPanel3.setLayout(new GroupLayout());
			jPanel3.add(getJLabel8(), new Constraints(new Leading(10, 10, 10),
					new Leading(3, 10, 10)));
		}
		return jPanel3;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("运行时间：");
		}
		return jLabel7;
	}

	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setViewportView(getJTextArea1());
		}
		return jScrollPane2;
	}

	private JTextArea getJTextArea1() {
		if (jTextArea1 == null) {
			jTextArea1 = new JTextArea();
			jTextArea1.setText("");
		}
		return jTextArea1;
	}

	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setBorder(BorderFactory.createTitledBorder(null,
					"the result", TitledBorder.LEADING,
					TitledBorder.DEFAULT_POSITION, null, null));
			jPanel2.setLayout(new GroupLayout());
			jPanel2.add(getJScrollPane2(), new Constraints(new Leading(2, 401,
					10, 10), new Leading(0, 177, 10, 10)));
		}
		return jPanel2;
	}

	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setBorder(BorderFactory.createTitledBorder(null,
					"Border Title", TitledBorder.LEADING,
					TitledBorder.DEFAULT_POSITION, null, null));
		}
		return jScrollPane1;
	}

	private JButton getJButton10() {
		if (jButton10 == null) {
			jButton10 = new JButton();
			jButton10.setText("Go");
			jButton10.setBorder(BorderFactory.createEtchedBorder(
					EtchedBorder.LOWERED, null, null));
			jButton10.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton10ActionActionPerformed(event);
				}
			});
		}
		return jButton10;
	}

	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setText("EF");
			jButton6.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton6ActionActionPerformed(event);
				}
			});
		}
		return jButton6;
	}

	private JButton getJButton9() {
		if (jButton9 == null) {
			jButton9 = new JButton();
			jButton9.setText("AG");
			jButton9.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton9ActionActionPerformed(event);
				}
			});
		}
		return jButton9;
	}

	private JButton getJButton8() {
		if (jButton8 == null) {
			jButton8 = new JButton();
			jButton8.setText("AF");
			jButton8.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton8ActionActionPerformed(event);
				}
			});
		}
		return jButton8;
	}

	private JButton getJButton7() {
		if (jButton7 == null) {
			jButton7 = new JButton();
			jButton7.setText("EG");
			jButton7.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton7ActionActionPerformed(event);
				}
			});
		}
		return jButton7;
	}

	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("OR");
			jButton5.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton5ActionActionPerformed(event);
				}
			});
		}
		return jButton5;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("");
			jLabel6.setForeground(Color.blue);
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setFont(new Font("Serif", Font.BOLD, 16));
			jLabel5.setText("Formula：");
		}
		return jLabel5;
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("AND");
			jButton4.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton4ActionActionPerformed(event);
				}
			});
		}
		return jButton4;
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("Not");
			jButton3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton3ActionActionPerformed(event);
				}
			});
		}
		return jButton3;
	}

	private JMenuBar getJMenuBar0() {
		if (jMenuBar0 == null) {
			jMenuBar0 = new JMenuBar();
			jMenuBar0
					.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);// 设置右对齐
			jMenuBar0.add(getJMenu0());
		}
		return jMenuBar0;
	}

	private JMenu getJMenu0() {
		if (jMenu0 == null) {
			jMenu0 = new JMenu();
			jMenu0.setText("帮助");
			jMenu0.setFont(new Font("Serif", Font.BOLD, 12));
			jMenu0.setPreferredSize(new Dimension(50, 20));
			jMenu0.add(getJMenuItem0());
		}
		return jMenu0;
	}

	private JMenuItem getJMenuItem0() {
		if (jMenuItem0 == null) {
			jMenuItem0 = new JMenuItem();
			jMenuItem0.setFont(new Font("Serif", Font.PLAIN, 10));
			ImageIcon image = new ImageIcon("images/help.png");
			// jMenuItem0.setIcon(new
			// ImageIcon(getClass().getResource("images/help.png")));
			jMenuItem0.setIcon(image);
			jMenuItem0.setText("帮助");
			jMenuItem0.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jMenuItem0ActionActionPerformed(event);
				}
			});
		}
		return jMenuItem0;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setBorder(BorderFactory.createTitledBorder(null,
					"Formula Construction", TitledBorder.LEADING,
					TitledBorder.DEFAULT_POSITION, null, null));
			jPanel1.setLayout(new GroupLayout());
			jPanel1.add(getJLabel4(), new Constraints(new Leading(0, 12, 12),
					new Leading(0, 12, 12)));
			jPanel1.add(getJButton3(), new Constraints(new Leading(0, 12, 12),
					new Leading(69, 12, 12)));
			jPanel1.add(getJButton4(), new Constraints(new Leading(56, 10, 10),
					new Leading(69, 42, 42)));
			jPanel1.add(getJButton5(), new Constraints(
					new Leading(114, 10, 10), new Leading(69, 12, 12)));
			jPanel1.add(getJButton6(), new Constraints(
					new Leading(165, 10, 10), new Leading(69, 12, 12)));
			jPanel1.add(getJButton7(), new Constraints(
					new Leading(214, 10, 10), new Leading(69, 12, 12)));
			jPanel1.add(getJTextField3(), new Constraints(new Leading(0, 321,
					12, 12), new Leading(26, 28, 42, 42)));
			jPanel1.add(getJButton10(), new Constraints(new Leading(327, 74,
					12, 12), new Leading(26, 31, 12, 12)));
			jPanel1.add(getJLabel5(), new Constraints(new Leading(0, 12, 12),
					new Leading(137, 12, 12)));
			jPanel1.add(getJButton11(), new Constraints(new Leading(0, 12, 12),
					new Leading(103, 12, 12)));
			jPanel1.add(getJButton12(), new Constraints(
					new Leading(61, 12, 12), new Leading(103, 12, 12)));
			jPanel1.add(getJButton13(), new Constraints(new Leading(116, 60,
					10, 10), new Leading(103, 12, 12)));
			jPanel1.add(getJButton9(), new Constraints(
					new Leading(182, 12, 12), new Leading(103, 12, 12)));
			jPanel1.add(getJButton14(), new Constraints(new Leading(266, 53,
					10, 10), new Leading(69, 12, 12)));
			jPanel1.add(getJButton8(), new Constraints(
					new Leading(241, 10, 10), new Leading(103, 12, 12)));
			jPanel1.add(getJLabel6(), new Constraints(new Leading(73, 10, 10),
					new Leading(140, 12, 12)));
			jPanel1.add(getJLabel7(), new Constraints(new Leading(2, 10, 10),
					new Leading(166, 12, 12)));
		}
		return jPanel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("State  Num：");
			jLabel0.setFont(new Font("Serif", Font.PLAIN, 14));
		}
		return jLabel0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("State Name：");
			jLabel1.setFont(new Font("Serif", Font.PLAIN, 14));
		}
		return jLabel1;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Successor：");
			jLabel2.setFont(new Font("Serif", Font.PLAIN, 15));
		}
		return jLabel2;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Atoms：");
			jLabel3.setFont(new Font("Serif", Font.PLAIN, 14));
		}
		return jLabel3;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Input The CTL Formula：");
			jLabel4.setFont(new Font("Serif", Font.PLAIN, 14));
		}
		return jLabel4;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent event) {
					jTextField1MouseMouseEntered(event);
				}

			});
			jTextField1.addMouseMotionListener(new MouseMotionAdapter() {

			});
		}
		return jTextField1;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent event) {
					jTextField2MouseMouseEntered(event);
				}
			});
		}
		return jTextField2;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setBorder(new LineBorder(Color.gray, 2, false));
			jTextField3.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent event) {
					jTextField3MouseMouseEntered(event);
				}
			});
			Document dc = jTextField3.getDocument();// 设置内容改变的监听内容。
			dc.addDocumentListener(new DocumentListener() {

				@Override
				public void removeUpdate(DocumentEvent e) {
					jLabel6.setText(jTextField3.getText());
				}

				@Override
				public void insertUpdate(DocumentEvent e) {
					jLabel6.setText(jTextField3.getText());
				}

				@Override
				public void changedUpdate(DocumentEvent e) {
					jLabel6.setText(jTextField3.getText());
				}
			});
		}
		return jTextField3;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("Path");
			jButton2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton2ActionActionPerformed(event);
				}
			});
		}
		return jButton2;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Reset");
			jButton1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton1ActionActionPerformed(event);
				}
			});
			jButton1.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent event) {
					jButton1MouseMouseEntered(event);
				}
			});
		}
		return jButton1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null,
					"Create Model", TitledBorder.LEADING,
					TitledBorder.DEFAULT_POSITION, new Font("Serif", Font.BOLD,
							12), null));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJButton1(), new Constraints(new Leading(3, 10, 10),
					new Leading(122, 12, 12)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(9, 12, 12),
					new Leading(28, 12, 12)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(12, 12, 12),
					new Leading(54, 12, 12)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(24, 12, 12),
					new Leading(80, 12, 12)));
			jPanel0.add(getJButton0(), new Constraints(new Leading(75, 58, 10,
					10), new Leading(122, 12, 12)));
			jPanel0.add(getJButton2(), new Constraints(
					new Leading(139, 12, 12), new Leading(122, 12, 12)));
			jPanel0.add(getJComboBox0(), new Constraints(new Leading(91, 68,
					12, 12), new Leading(4, 18, 12, 12)));
			jPanel0.add(getJTextField0(), new Constraints(new Leading(91, 68,
					12, 12), new Leading(28, 12, 12)));
			jPanel0.add(getJTextField1(), new Constraints(new Leading(91, 68,
					12, 12), new Leading(54, 12, 12)));
			jPanel0.add(getJTextField2(), new Constraints(new Leading(91, 68,
					12, 12), new Leading(80, 12, 12)));
			jPanel0.add(getJLabel0(), new Constraints(new Leading(9, 12, 12),
					new Leading(1, 12, 12)));
			jPanel0.add(getJScrollPane0(), new Constraints(new Leading(3, 218,
					10, 10), new Bilateral(168, 0, 22)));
			jPanel0.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent event) {
					jPanel0MouseMouseEntered(event);
				}
			});
		}
		return jPanel0;
	}

	@SuppressWarnings("unchecked")
	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "0",
					"1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
			jComboBox0.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jComboBox0ActionActionPerformed(event);
				}
			});
		}
		return jComboBox0;
	}

	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setViewportView(getJTextArea0());
		}
		return jScrollPane0;
	}

	private JTextArea getJTextArea0() {
		if (jTextArea0 == null) {
			jTextArea0 = new JTextArea();
			jTextArea0.setText("");
		}
		return jTextArea0;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent event) {
					jTextField0MouseMouseEntered(event);
				}
			});
		}
		return jTextField0;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Add");
			jButton0.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
			jButton0.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent event) {
					jButton0MouseMouseEntered(event);
				}
			});
		}
		return jButton0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class. Note: This class is only created so that you can
	 * easily preview the result at runtime. It is not expected to be managed by
	 * the designer. You can modify it as you like.
	 */
	private void jComboBox0ActionActionPerformed(ActionEvent event) {
		stateNum = Integer.parseInt(jComboBox0.getSelectedItem().toString());
		JOptionPane.showMessageDialog(jComboBox0, "该模型共有 " + stateNum + " 个状态");
	}

	private void jButton0ActionActionPerformed(ActionEvent event) { // 添加状态按钮
		if (i < stateNum) {// 状态没有输入完
			State state = new State();// 保存刚输入的状态
			state.setName(jTextField0.getText().toString());// 设置状态名字
			/*
			 * 分割后继状态
			 */
			List<String> temSucc = new ArrayList<>();// 获得后继状态
			if (jTextField1.getText() == "") {
				temSucc.add("");
			} else {
				String temStr[] = new String(jTextField1.getText()).split(",");
				for (int m = 0; m < temStr.length; m++) {
					temSucc.add(temStr[m]);
				}
			}
			List<String> tempAtoms = new ArrayList<>();// 获得命题集合
			if (jTextField2.getText() == "") {
				tempAtoms.add("");
			} else {
				String tempStr[] = new String(jTextField2.getText()).split(",");
				for (int m = 0; m < tempStr.length; m++) {
					tempAtoms.add(tempStr[m]);
				}
			}
			state.setSuccessor(temSucc);
			state.setProList(tempAtoms);
			stateList.add(state);
			kripke.setStateSets(stateList);
			++i;
			jTextArea0.setText(kripke.toString());
		} else {// 状态输入完之后显示序列
			JOptionPane.showMessageDialog(jButton0, "状态输入完毕，不能再输入");
			// jComboBox0.setSelectedIndex(0);
			jTextField0.setText("");
			jTextField1.setText("");
			jTextField2.setText("");
		}
	}

	private void jButton1ActionActionPerformed(ActionEvent event) {
		stateNum = 0;
		i = 0;
		jTextArea0.setText("");
		jComboBox0.setSelectedIndex(0);
		jTextField0.setText("");
		jTextField1.setText("");
		jTextField2.setText("");
		stateList.clear();// 确保状态队列里没有之前的状态
		kripke = new Kripke();
	}

	private void jButton2ActionActionPerformed(ActionEvent event) {
		if (stateNum != 0) {
			long t = System.currentTimeMillis();
			kripke.CreatLists(kripke.getStateSets());
			kripke.getCurLuJin(0);
			jTextArea0.setText(kripke.toString() + "\n"
					+ "All paths in this model are：\n"
					+ kripke.GetNonReapeatedPath());
			t1 = System.currentTimeMillis() - t;
		} else {
			JOptionPane.showMessageDialog(jButton2, "没有模型，请先构造模型");
		}
	}

	private void jButton0MouseMouseEntered(MouseEvent event) {
		jButton0.setToolTipText("添加状态");
	}

	private void jTextField0MouseMouseEntered(MouseEvent event) {
		jTextField0.setToolTipText("输入状态名，以s1,s2等命名状态");
	}

	private void jTextField1MouseMouseEntered(MouseEvent event) {
		jTextField1.setToolTipText("输入该状态的后继状态，用  , 隔开");
	}

	private void jTextField2MouseMouseEntered(MouseEvent event) {
		jTextField2.setToolTipText("输入状态的属性，用原子命题集合表示，命题之间用 , 隔开");
	}

	private void jButton1MouseMouseEntered(MouseEvent event) {
		jButton1.setToolTipText("将系统重置为最初状态");
	}

	private void jPanel0MouseMouseEntered(MouseEvent event) {
	}

	private void jMenuItem0ActionActionPerformed(ActionEvent event) {// 帮助 事件处理
		helpFrame help = new helpFrame();
		help.setVisible(true);
		help.setTitle("帮 助");
		help.setResizable(false);
		help.setIconImage(Toolkit.getDefaultToolkit().createImage(
				"images/help.png"));// 设置左上角图标
		help.setLocationRelativeTo(new MyFrame());// 设置其出现的相对位置----在父frame的中间
	}

	private void jTextField3MouseMouseEntered(MouseEvent event) {
		jTextField3.setToolTipText("在此处输入公式");
	}

	public String showFormula(String string) {
		formula = jTextField3.getText() == null ? "" : jTextField3.getText();
		int indexstart = jTextField3.getSelectionStart();
		formula = formula.substring(0, indexstart) + string
				+ formula.substring(indexstart);
		return formula;
	}

	private void jButton3ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("Not"));
	}

	private void jButton4ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("AND"));
	}

	private void jButton5ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("OR"));
	}

	private void jButton6ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("EF"));
	}

	private void jButton7ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("EG"));
	}

	private void jButton9ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("AG"));
	}

	private void jButton8ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("AF"));
	}

	private void jButton11ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("∧"));
	}

	private void jButton12ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("∨"));
	}

	private void jButton10ActionActionPerformed(ActionEvent event) {
		if (jTextField3.getText().toString().equals("")) {
			JOptionPane.showMessageDialog(jButton10, "没有公式，先输入公式");
		}
//		else if (jTextField3.getText().toString().startsWith("EF")) {
//
//		}
		else {
			String string = "";
			if (jTextField3.getText().toString().contains("Not")) {
				string = jTextField3.getText().toString().replace("Not", "-");
			} else {
				string = jTextField3.getText().toString();
			}
			jTextArea1.setText("");
			long t = System.currentTimeMillis();
			jTextArea1.setText(Result.get_final_result(kripke.getStatePath(),
					string));
			System.out.println("路径的大小" + kripke.getStatePath().size());
			t2 = System.currentTimeMillis() - t;
			jLabel7.setText("运行时间： " + String.valueOf(((t1 + t2))) + " ms");
		}
	}

	private void jButton14ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("EX"));
	}

	private void jButton13ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("AX"));
	}

}
