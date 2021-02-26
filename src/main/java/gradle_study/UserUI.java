package gradle_study;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gradle_study.ui.DepartmentUI;
import gradle_study.ui.TitleUI;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnDepartment;
	private JButton btntitle;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserUI frame = new UserUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserUI() {
		setTitle("UserUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lbtitle = new JLabel("UserUI");
		lbtitle.setFont(new Font("굴림", Font.BOLD, 25));
		lbtitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbtitle, BorderLayout.CENTER);
		
		JPanel pBtn = new JPanel();
		contentPane.add(pBtn, BorderLayout.SOUTH);
		
		btnDepartment = new JButton("부서");
		btnDepartment.addActionListener(this);
		pBtn.add(btnDepartment);
		
		btntitle = new JButton("직책");
		btntitle.addActionListener(this);
		pBtn.add(btntitle);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btntitle) {
			actionPerformedBtntitle(e);
		}
		if (e.getSource() == btnDepartment) {
			actionPerformedBtnDepartment(e);
		}
	}
	
	protected void actionPerformedBtnDepartment(ActionEvent e) {
		DepartmentUI frame = new DepartmentUI();
		frame.setVisible(true);
	}
	
	protected void actionPerformedBtntitle(ActionEvent e) {
		TitleUI frame = new TitleUI();
		frame.setVisible(true);
	}
}
