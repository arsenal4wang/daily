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
			jTextArea0.setFont(new Font("����", Font.ITALIC, 14));
			jTextArea0
					.setText("\n   �����߼���һ����ʽ����֪ʶ��ʾ��ʽ�����ṩ�˸�ǿ��ı�������Ϳ��ж��ԡ�ģ�ͼ����\nһ�ֻ���״̬ת��ϵͳ����ʽ������֤������������������߼�ALC����ʱ̬�߼�CTL�У���ʱ̬��\n���߼�ALC-CTL�Ļ����ϣ�����ģ�ͼ��ķ�������ʱ̬���ʽ�����֤��������������֤���ʵķ�\nΧ�������ʹ��ʱ̬�����߼�ALC-CTL���̻�ʱ̬�淶����֤��״̬Ǩ��ϵͳ���Ƿ����һ��·��\n�����ʱ̬�淶�� ��Ҫ�Ĳ����������¡�\n\n 1������֪ʶ��KB\n    ֪ʶ��Ĺ�����Ҫ������һϵ�еĸ��������ɵļ��ϳ�ΪTBox������ÿ������֮����Ӣ��\n    ���Ÿ��������磬A,B,Student...�ȡ�\n    ������ABox��ʱ�򣬳�����Զ���ABox���TBox��һ���Խ����жϣ�����һ�£���������ӡ�\n 2������ģ�ͣ���״̬Ǩ��ϵͳ��\n   ��State Num��ѡ���ģ���д��ڵ�״̬��������State Name������״̬���������s1��s2������\n   ��Succesor���������״̬�ĺ��״̬��״̬֮����Ӣ�Ķ��Ÿ��������޺��״̬������Ϊ�գ�\n   ��ABox���棬�����״̬��ABox���Եļ��ϣ�����ÿ��ABox������Ӣ�Ķ��Ÿ�����ABox���Եķ�\n  ������ʽ�á�-����ʾ������״̬û��ABox���ԣ�����Ϊ�ա�\n   ��󣬵��Add��ť ��ӵ���ģ���С�\n   ��󣬵��Path���ɸ�ģ���е�����·�����������Path��panel����ʾ��\n 3����ʽ�Ĺ��졣\n   ���ʱ̬���Ӱ�ťAND OR NOT EF AF EG AG�ȣ����������ť֮����textField������ʱ̬����\n��������ABox���ԣ��õ�ʱ̬�����߼���ʽ��\n 4����֤\n   ��1��2���֮�󣬵��go��ť��������·�����㹫ʽ������������㹫ʽ��·������������·����\n��ʾû������Ĺ�ʽ���ڡ�\n 5������\n   ��ʹ�ø�����Ĺ����У�ÿһ����������������������ʾ��������֤�˳�����Ѻú�ʹ�õİ�ȫ����\n��������ʹ�����ʣ�����ϵ wangyguang@126.com");
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
				frame.setTitle("����");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setIconImage(Toolkit.getDefaultToolkit().createImage(
						"images/help.png"));// �������Ͻ�ͼ��
				frame.setResizable(false);
				frame.pack();
			}
		});
	}
}
