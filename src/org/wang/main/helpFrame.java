package org.wang.main;

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
		add(getJScrollPane0(), new Constraints(new Bilateral(0, 0, 22), new Bilateral(6, 0, 22)));
		setSize(635, 516);
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
			jTextArea0
					.setText("\n   描述逻辑是一种形式化的知识表示形式，它提供了更强大的表达能力和可判定性。模型检测是\n一种基于状态转移系统的形式化的验证方法，该软件将描述逻辑ALC引入时态逻辑CTL中，在时态描\n述逻辑ALC-CTL的基础上，采用模型检测的方法，对时态性质进行验证，这样扩大了验证性质的范\n围。该软件使用时态描述逻辑ALC-CTL来刻画时态规范，验证在状态迁移系统中是否存在一条路径\n满足该时态规范。 主要的操作步骤如下。\n\n 1、构建知识库KB\n    知识库的构建主要是声明一系列的概念，概念组成的集合成为TBox，其中每个概念之间用英文\n    逗号隔开，例如，A,B,Student...等。\n    在输入ABox的时候，程序会自动对ABox相对TBox的一致性进行判断，若不一致，则不允许添加。\n 2、构建模型，即状态迁移系统。\n   在State Num中选择该模型中存在的状态个数；在State Name里输入状态名，最好用s1，s2命名；\n   在Succesor里面输入该状态的后继状态，状态之间用英文逗号隔开，若无后继状态，则置为空；\n   在ABox里面，输入该状态的ABox断言的集合，其中每个ABox断言用英文逗号隔开，ABox断言的否\n  定的形式用“-”表示，若该状态没有ABox断言，则置为空。\n   最后，点击Add按钮 添加到该模型中。\n   最后，点击Path生成该模型中的所有路径，在下面的Path的panel里显示。\n 3、公式的构造。\n   点击时态算子按钮AND OR NOT EF AF EG AG等，点击上述按钮之后在textField里面在时态算子\n后面输入ABox断言，得到时态描述逻辑公式。\n 4、验证\n   在1、2完成之后，点击go按钮，若存在路径满足公式，输出所有满足公式的路径。若不存在路径，\n提示没有满足的公式存在。\n 5、其他\n   在使用该软件的过程中，每一个错误操作都会给与错误的提示，这样保证了程序的友好和使用的安全。若\n有其他的使用疑问，请联系 wangyguang@126.com");
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
	 * Main entry of the class. Note: This class is only created so that you can
	 * easily preview the result at runtime. It is not expected to be managed by
	 * the designer. You can modify it as you like.
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
