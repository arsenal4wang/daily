package com.wang.main;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;

//VS4E -- DO NOT REMOVE THIS LINE!
public class helpFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextArea jTextArea0;
	private JScrollPane jScrollPane0;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public helpFrame() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJScrollPane0(), new Constraints(new Bilateral(-2, 0, 22), new Bilateral(0, 0, 22)));
		setSize(633, 395);
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
			jTextArea0.setEditable(false);
			jTextArea0.setFont(new Font("宋体", Font.ITALIC, 14));
			jTextArea0.setText("\n   模型检测是一种基于状态转移系统的形式化的验证方法，该工具使用时态逻辑CTL公式对待验证的 "+"\n"+"规范进行刻画，验证在状态迁移系统中是否存在一条路径满足该时态公式。该工具基于状态迁移系统"+"\n"+"和分支时态逻辑CTL."
					+ " 主要的操作步骤如下。\n\n"
					+ "1、构建模型，即状态迁移系统。\n"
					+ "   在State Num中选择该模型中存在的状态个数；在State Name里输入状态名，最好用s1，s2命名；\n"
					+ "   在Succesor里面输入该状态的后继状态，状态之间用英文逗号隔开，若无后继状态，则置为空；\n"
					+ "   在Atoms里面，输入该状态的原子命题集合，其中每个原子命题用英文逗号隔开，命题否定的"+"\n"+"形式用“-”表示，若无命题，则置为空。"+"\n"+"   最后，点击Add按钮 添加到该模型中。\n"
					+ "   最后，点击Path生成该模型中的所有路径，在下面的area里显示。\n"
					+ "2、公式的构造。\n"
					+ "   点击时态算子按钮AND OR NOT EF AF EG AG等，点击上述按钮之后在textField里面在时态算子"+"\n"+"后面输入原子命题，得到时态公式。\n"
					+ "3、验证\n"
					+ "   在1、2完成之后，点击go按钮，若存在路径满足公式，输出所有满足公式的路径。若不存在路径，"+"\n"+"提示"
					+ "没有满足的公式存在。");
		}
		return jTextArea0;
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
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				helpFrame frame = new helpFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("帮助");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setIconImage(Toolkit.getDefaultToolkit().createImage(
						"images/help.png"));// 设置左上角图标
				frame.setResizable(false);
				frame.pack();
			}
		});
	}
}
