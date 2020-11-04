import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TeacherRecord extends JFrame {

	private JPanel contentPane;
	private JTextField textName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherRecord frame = new TeacherRecord();
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
	public TeacherRecord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTeacherRecord = new JLabel("Teacher Record");
		lblTeacherRecord.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTeacherRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeacherRecord.setBounds(0, 0, 436, 40);
		contentPane.add(lblTeacherRecord);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(10, 62, 60, 30);
		contentPane.add(lblName);
		
		textName = new JTextField();
		textName.setBounds(80, 65, 140, 30);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearch.setBounds(230, 65, 80, 30);
		contentPane.add(btnSearch);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRefresh.setBounds(320, 66, 106, 30);
		contentPane.add(btnRefresh);
	}

}
