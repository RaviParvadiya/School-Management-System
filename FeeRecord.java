import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FeeRecord extends JFrame {

	private JPanel contentPane;
	private JTextField textClass;
	private JTextField textSection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeeRecord frame = new FeeRecord();
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
	public FeeRecord() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFeeRecord = new JLabel("Fee Record");
		lblFeeRecord.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFeeRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeRecord.setBounds(0, 0, 536, 40);
		contentPane.add(lblFeeRecord);
		
		JLabel lblClass = new JLabel("Class :");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClass.setBounds(40, 65, 70, 30);
		contentPane.add(lblClass);
		
		textClass = new JTextField();
		textClass.setBounds(120, 65, 100, 30);
		contentPane.add(textClass);
		textClass.setColumns(10);
		
		JLabel lblSection = new JLabel("Section :");
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSection.setBounds(230, 65, 70, 30);
		contentPane.add(lblSection);
		
		textSection = new JTextField();
		textSection.setColumns(10);
		textSection.setBounds(310, 65, 100, 30);
		contentPane.add(textSection);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(441, 65, 85, 30);
		contentPane.add(btnNewButton);
	}

}
