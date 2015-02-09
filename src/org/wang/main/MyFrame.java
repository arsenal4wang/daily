package org.wang.main;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.wang.result.Result;
import org.wang.state.KB;
import org.wang.state.Kripke;
import org.wang.state.State;

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
	private static long t3;
	private JTextArea jTextArea2;
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
	public static String tbox = "";
	
	private JPanel jPanel4;
	private JPanel jPanel5;
	private JButton jButton11;
	private JLabel jLabel9;
	private JTextField jTextField4;
	private JButton jButton13;
	private JButton jButton12;

	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MyFrame frame = new MyFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("基于时态描述逻辑ALC-CTL的验证软件  (DL-CVT)  v1.0");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setIconImage(Toolkit.getDefaultToolkit().createImage(
						"images/title.jpg"));// 设置左上角图标
				frame.setResizable(false);// 使创口不能最大化
				frame.pack();
			}
		});
		t3 = System.currentTimeMillis() - t;
	}

	public MyFrame() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel1(), new Constraints(new Leading(359, 424, 10, 10), new Leading(0, 225, 40, 40)));
		add(getJPanel6(), new Constraints(new Leading(12, 341, 10, 10), new Leading(396, 242, 10, 10)));
		add(getJPanel2(), new Constraints(new Leading(359, 424, 12, 12), new Leading(247, 389, 10, 10)));
		add(getJPanel0(), new Constraints(new Leading(8, 341, 12, 12), new Leading(8, 387, 10, 10)));
		setJMenuBar(getJMenuBar0());
		setSize(824, 665);
	}

	private JButton getJButton22() {
		if (jButton22 == null) {
			jButton22 = new JButton();
			jButton22.setText("∀");
			jButton22.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton22ActionActionPerformed(event);
				}
			});
		}
		return jButton22;
	}

	private JButton getJButton21() {
		if (jButton21 == null) {
			jButton21 = new JButton();
			jButton21.setText("∃");
			jButton21.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton21ActionActionPerformed(event);
				}
			});
		}
		return jButton21;
	}

	private JLabel getJLabel11() {
		if (jLabel11 == null) {
			jLabel11 = new JLabel();
			jLabel11.setText("j");
			jLabel11.setForeground(Color.blue);
			jLabel11.setFont(new Font("Serif", Font.BOLD, 16));
		}
		return jLabel11;
	}

	private JButton getJButton20() {
		if (jButton20 == null) {
			jButton20 = new JButton();
			jButton20.setText("=");
			jButton20.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton20ActionActionPerformed(event);
				}
			});
		}
		return jButton20;
	}

	private JButton getJButton19() {
		if (jButton19 == null) {
			jButton19 = new JButton();
			jButton19.setText("⊔");//概念或
			jButton19.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton19ActionActionPerformed(event);
				}
			});
		}
		return jButton19;
	}

	private JButton getJButton18() {
		if (jButton18 == null) {
			jButton18 = new JButton();
			jButton18.setText("⊓");//概念与
			jButton18.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton18ActionActionPerformed(event);
				}
			});
		}
		return jButton18;
	}

	private JLabel getJLabel10() {
		if (jLabel10 == null) {
			jLabel10 = new JLabel();
			jLabel10.setText("TBox:");
			jLabel0.setFont(new Font("Serif", Font.PLAIN, 16));
		}
		return jLabel10;
	}

	private JButton getJButton17() {
		if (jButton17 == null) {
			jButton17 = new JButton();
			jButton17.setText("AX");
			jButton17.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton17ActionActionPerformed(event);
				}
			});
		}
		return jButton17;
	}

	private JButton getJButton16() {
		if (jButton16 == null) {
			jButton16 = new JButton();
			jButton16.setText("EX");
			jButton16.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton16ActionActionPerformed(event);
				}
			});
		}
		return jButton16;
	}

	private JButton getJButton15() {
		if (jButton15 == null) {
			jButton15 = new JButton();
			jButton15.setText("∨");//Or
			jButton15.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton15ActionActionPerformed(event);
				}
			});
		}
		return jButton15;
	}

	private JButton getJButton14() {
		if (jButton14 == null) {
			jButton14 = new JButton();
			jButton14.setText("∧");//And
			jButton14.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton14ActionActionPerformed(event);
				}
			});
		}
		return jButton14;
	}

	private JPanel getJPanel6() {
		if (jPanel6 == null) {
			jPanel6 = new JPanel();
			jPanel6.setBorder(BorderFactory.createTitledBorder(null, "Path", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, null, null));
			jPanel6.setLayout(new GroupLayout());
			jPanel6.add(getJScrollPane0(), new Constraints(new Leading(0, 331, 10, 10), new Leading(0, 219, 10, 10)));
		}
		return jPanel6;
	}

	private JButton getJButton12() {
		if (jButton12 == null) {
			jButton12 = new JButton();
			jButton12.setText("ReBuild");
			jButton12.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton12ActionActionPerformed(event);
				}
			});
		}
		return jButton12;
	}

	private JButton getJButton13() {
		if (jButton13 == null) {
			jButton13 = new JButton();
			jButton13.setText("Bulid");
			jButton13.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton13ActionActionPerformed(event);
				}
			});
		}
		return jButton13;
	}

	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
			jTextField4.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			jTextField4.addMouseListener(new MouseAdapter() {
	
				@Override
				public void mouseEntered(MouseEvent event) {
					jTextField4MouseMouseEntered(event);
				}
			});
		}
		return jTextField4;
	}

	private JLabel getJLabel9() {
		if (jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setFont(new Font("Serif", Font.PLAIN, 14));
			jLabel9.setText("TBox：");
		}
		return jLabel9;
	}

	private JButton getJButton11() {
		if (jButton11 == null) {
			jButton11 = new JButton();
			jButton11.setText("Reset");
			jButton11.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					jButton11ActionActionPerformed(event);
				}
			});
		}
		return jButton11;
	}

	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			jPanel5 = new JPanel();
			jPanel5.setBorder(BorderFactory.createTitledBorder(null, "Model", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, null, null));
			jPanel5.setLayout(new GroupLayout());
			jPanel5.add(getJLabel0(), new Constraints(new Leading(3, 10, 10), new Leading(10, 22, 12, 12)));
			jPanel5.add(getJComboBox0(), new Constraints(new Leading(74, 49, 10, 10), new Leading(12, 20, 12, 12)));
			jPanel5.add(getJLabel1(), new Constraints(new Leading(-2, 12, 12), new Leading(42, 12, 12)));
			jPanel5.add(getJLabel2(), new Constraints(new Leading(-3, 12, 12), new Leading(74, 12, 12)));
			jPanel5.add(getJLabel3(), new Constraints(new Leading(12, 12, 12), new Leading(104, 24, 12, 12)));
			jPanel5.add(getJButton1(), new Constraints(new Leading(229, 10, 10), new Leading(40, 12, 12)));
			jPanel5.add(getJTextField1(), new Constraints(new Leading(73, 131, 10, 10), new Leading(74, 24, 12, 12)));
			jPanel5.add(getJTextField0(), new Constraints(new Leading(74, 82, 10, 10), new Leading(40, 12, 12)));
			jPanel5.add(getJTextField2(), new Constraints(new Leading(74, 128, 12, 12), new Leading(106, 12, 12)));
			jPanel5.add(getJButton2(), new Constraints(new Leading(229, 66, 12, 12), new Leading(72, 12, 12)));
			jPanel5.add(getJButton0(), new Constraints(new Leading(230, 66, 12, 12), new Leading(103, 12, 12)));
		}
		return jPanel5;
	}

	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			jPanel4 = new JPanel();
			jPanel4.setBorder(BorderFactory.createTitledBorder(null, "KB", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, null, null));
			jPanel4.setLayout(new GroupLayout());
			jPanel4.add(getJLabel9(), new Constraints(new Leading(7, 49, 10, 10), new Leading(6, 28, 10, 10)));
			jPanel4.add(getJButton12(), new Constraints(new Leading(56, 78, 10, 10), new Leading(83, 12, 12)));
			jPanel4.add(getJButton13(), new Constraints(new Leading(142, 69, 10, 10), new Leading(83, 12, 12)));
			jPanel4.add(getJLabel10(), new Constraints(new Leading(7, 12, 12), new Leading(125, 10, 10)));
			jPanel4.add(getJButton18(), new Constraints(new Leading(53, 10, 10), new Leading(43, 12, 12)));
			jPanel4.add(getJLabel11(), new Constraints(new Leading(56, 12, 12), new Leading(123, 12, 12)));
			jPanel4.add(getJButton19(), new Constraints(new Leading(101, 49, 10, 10), new Leading(43, 12, 12)));
			jPanel4.add(getJButton20(), new Constraints(new Leading(153, 43, 10, 10), new Leading(43, 12, 12)));
			jPanel4.add(getJButton21(), new Constraints(new Leading(198, 10, 10), new Leading(43, 12, 12)));
			jPanel4.add(getJButton22(), new Constraints(new Leading(242, 52, 12, 12), new Leading(43, 12, 12)));
			jPanel4.add(getJTextField4(), new Constraints(new Leading(58, 242, 10, 10), new Leading(6, 25, 12, 12)));
		}
		return jPanel4;
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
			jTextArea1.setText("    Waiting......");
			jTextArea1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		}
		return jTextArea1;
	}

	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setBorder(BorderFactory.createTitledBorder(null, "the Result Part", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, new Font("Serif",
					Font.BOLD, 16), null));
			jPanel2.setLayout(new GroupLayout());
			jPanel2.add(getJScrollPane2(), new Constraints(new Leading(13, 405, 10, 10), new Leading(3, 351, 10, 10)));
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
			ImageIcon icon = new ImageIcon("images/go.jpg");
			jButton10.setIcon(icon);
			jButton10.setBorder(new LineBorder(Color.black, 1, false));
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

				@Override
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
			jLabel6.setText("er");
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

				@Override
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
			jButton3.setBorder(new LineBorder(Color.black, 1, false));
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
			jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Formula Part", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, new Font("Serif",
					Font.BOLD, 16), null));
			jPanel1.setLayout(new GroupLayout());
			jPanel1.add(getJLabel4(), new Constraints(new Leading(18, 10, 10), new Leading(9, 12, 12)));
			jPanel1.add(getJLabel5(), new Constraints(new Leading(8, 12, 12), new Leading(152, 12, 12)));
			jPanel1.add(getJLabel6(), new Constraints(new Leading(82, 12, 12), new Leading(155, 12, 12)));
			jPanel1.add(getJLabel7(), new Constraints(new Leading(8, 12, 12), new Leading(177, 24, 10, 10)));
			jPanel1.add(getJButton11(), new Constraints(new Leading(341, 70, 12, 12), new Leading(65, 32, 10, 10)));
			jPanel1.add(getJTextField3(), new Constraints(new Leading(21, 311, 10, 10), new Leading(35, 28, 12, 12)));
			jPanel1.add(getJButton3(), new Constraints(new Leading(21, 38, 12, 12), new Leading(81, 28, 12, 12)));
			jPanel1.add(getJButton5(), new Constraints(new Leading(121, 52, 10, 10), new Leading(81, 12, 12)));
			jPanel1.add(getJButton4(), new Constraints(new Leading(63, 61, 12, 12), new Leading(81, 12, 12)));
			jPanel1.add(getJButton6(), new Constraints(new Leading(175, 53, 10, 10), new Leading(81, 12, 12)));
			jPanel1.add(getJButton7(), new Constraints(new Leading(226, 52, 10, 10), new Leading(81, 12, 12)));
			jPanel1.add(getJButton10(), new Constraints(new Leading(341, 70, 12, 12), new Leading(31, 32, 12, 12)));
			jPanel1.add(getJButton16(), new Constraints(new Leading(280, 12, 12), new Leading(81, 12, 12)));
			jPanel1.add(getJButton14(), new Constraints(new Leading(22, 58, 12, 12), new Leading(112, 12, 12)));
			jPanel1.add(getJButton15(), new Constraints(new Leading(82, 49, 12, 12), new Leading(112, 12, 12)));
			jPanel1.add(getJButton8(), new Constraints(new Leading(136, 12, 12), new Leading(112, 12, 12)));
			jPanel1.add(getJButton9(), new Constraints(new Leading(185, 53, 10, 10), new Leading(112, 12, 12)));
			jPanel1.add(getJButton17(), new Constraints(new Leading(239, 56, 10, 10), new Leading(112, 12, 12)));
		}
		return jPanel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("State Num:");
			jLabel0.setFont(new Font("Serif", Font.PLAIN, 14));
		}
		return jLabel0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("State Name:");
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
			jLabel3.setText("ABox：");
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
			jTextField1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			jTextField1.addMouseListener(new MouseAdapter() {
	
				@Override
				public void mouseEntered(MouseEvent event) {
					jTextField1MouseMouseEntered(event);
				}
			});
		}
		return jTextField1;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Model  Part", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, new Font("Serif",
					Font.BOLD, 16), null));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJPanel5(), new Constraints(new Bilateral(5, 12, 302), new Leading(193, 161, 10, 10)));
			jPanel0.add(getJPanel4(), new Constraints(new Leading(9, 10, 10), new Leading(0, 175, 12, 12)));
			jPanel0.addMouseListener(new MouseAdapter() {
	
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
			jTextArea0.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		}
		return jTextArea0;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, null, null, null, null));
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
		if (!(MyFrame.kb.getTb()==null)) {
			stateNum = Integer
					.parseInt(jComboBox0.getSelectedItem().toString());
			JOptionPane.showMessageDialog(jComboBox0, "该模型共有 " + stateNum
					+ " 个状态");
		} else {
			JOptionPane.showMessageDialog(jComboBox0, "请先构造知识库KB！");
			jComboBox0.setSelectedItem("0");
		}
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
			// 判断
			if (kb.isFormat(jTextField2.getText().toString())) {// 公式符合要求
				if (kb.isConsistent(kb.getTb(), jTextField2.getText()
						.toString())) {
					state.setSuccessor(temSucc);
//					state.setProList(kb.getAb());
					state.setProList(kb.getAllPossibleAssertions(kb.getTb(), kb.getAb()));
					stateList.add(state);
					kripke.setStateSets(stateList);
					++i;
					jTextArea0.setText(kripke.toString());
				} else {
					JOptionPane.showMessageDialog(jButton0, "知识库不一致，请检查输入");
				}
			} else {// 公式不符合规范
				JOptionPane.showMessageDialog(jButton0, "公式符合规范，应以'概念名()'的形式");
			}

		} else {// 状态输入完之后显示序列
			JOptionPane.showMessageDialog(jButton0, "状态输入完毕，不能再输入");
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
	
	public String showTBox(String string) {
		tbox = jTextField4.getText() == null ? "" : jTextField4.getText();
		int indexstart = jTextField4.getSelectionStart();
		tbox = tbox.substring(0, indexstart) + string
				+ tbox.substring(indexstart);
		return tbox;
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

	private void jButton10ActionActionPerformed(ActionEvent event) {
		if (jTextField3.getText().toString().equals("")) {
			JOptionPane.showMessageDialog(jButton10, "没有公式，先输入公式");
		} else if (kripke.getStateSets().isEmpty()) {
			JOptionPane.showMessageDialog(jButton10, "没有模型，先创建模型");
		} else {
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
			t2 = System.currentTimeMillis() - t;
			jLabel7.setText("运行时间： " + String.valueOf(((t1 + t2 + t3))) + " ms");
		}
	}

	private void jButton11ActionActionPerformed(ActionEvent event) {
		if (jTextField3.getText() != null || jTextArea1.getText() != null) {
			jTextField3.setText("");
			jTextArea1.setText("");
			jLabel7.setText("运行时间:");
		}
	}

	private void jTextField4MouseMouseEntered(MouseEvent event) {
		jTextField4.setToolTipText("此处用来输入概念，概念名之间用英文逗号隔开");
	}

	public static KB kb=new KB(); ;
	private JPanel jPanel6;
	private JButton jButton14;
	private JButton jButton15;
	private JButton jButton16;
	private JButton jButton17;
	private JLabel jLabel10;
	private JButton jButton18;
	private JButton jButton19;
	private JButton jButton20;
	private JLabel jLabel11;
	private JButton jButton21;
	private JButton jButton22;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	private void jButton13ActionActionPerformed(ActionEvent event) {
		// 构建TBox
		boolean flag = false;
		if (!(jTextField4.getText().toString() == null || jTextField4.getText()
				.toString().equals(""))) {
			String strings[] = jTextField4.getText().toString().split(",");
			ArrayList<String> tbList = new ArrayList<>();
			for (String string : strings) {
				if (!tbList.contains(string)) {
					tbList.add(string);
				} else {
					JOptionPane.showMessageDialog(jButton13, "存在重复的概念，请确认");
					tbList.clear();
				}
			}
			if (!tbList.isEmpty()) {
				kb.setTb(tbList);
				JOptionPane.showMessageDialog(jButton13, "添加知识库成功");
				jLabel11.setText(" "+tbList);
			}
		} else {
			JOptionPane.showMessageDialog(jButton13, "没有TBox，先创建TBox");
		}
	}

	private void jButton12ActionActionPerformed(ActionEvent event) {
		// 恢复TBox为空
		if (MyFrame.kb == null || MyFrame.kb.equals("")) {
		} else {
			MyFrame.kb = new KB();
			jTextField4.setText("");
			JOptionPane.showMessageDialog(jButton12, "TBox已重置，请重新构建！");
		}
	}

	private void jButton14ActionActionPerformed(ActionEvent event) {
			jTextField3.setText(showFormula("∧"));
	}

	private void jButton15ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("∨"));
	}

	private void jButton16ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("EX"));
	}

	private void jButton17ActionActionPerformed(ActionEvent event) {
		jTextField3.setText(showFormula("AX"));
	}

	private void jButton18ActionActionPerformed(ActionEvent event) {
		jTextField4.setText(showTBox(" ⊓ "));
	}

	private void jButton19ActionActionPerformed(ActionEvent event) {
		jTextField4.setText(showTBox(" ⊔ "));
	}

	private void jButton20ActionActionPerformed(ActionEvent event) {
		jTextField4.setText(showTBox("="));
	}

	private void jButton21ActionActionPerformed(ActionEvent event) {
		jTextField4.setText(showTBox("∃"));
	}

	private void jButton22ActionActionPerformed(ActionEvent event) {
		jTextField4.setText(showTBox("∀"));
	}
}
