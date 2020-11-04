import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SubmitFee extends JFrame {

	private JPanel contentPane;
	private JTextField textAdmissionno;
	private JTextField textName;
	private JTextField textClass;
	private JTextField textSection;
	private JTextField textAdmissionNo;
	private JTextField textFName;
	private JTextField textAddress;
	private JTextField textYear;
	private JTextField textMonth;
	private JTextField textAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubmitFee frame = new SubmitFee();
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
	public SubmitFee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 181));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblFee.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFee.setBounds(10, 10, 866, 50);
		contentPane.add(lblFee);
		
		JLabel lblAdmissionno = new JLabel("Admission No.");
		lblAdmissionno.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdmissionno.setBounds(100, 80, 150, 30);
		contentPane.add(lblAdmissionno);
		
		textAdmissionno = new JTextField();
		textAdmissionno.setBounds(287, 80, 250, 30);
		contentPane.add(textAdmissionno);
		textAdmissionno.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSearch.setBounds(580, 80, 100, 30);
		contentPane.add(btnSearch);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(10, 171, 60, 30);
		contentPane.add(lblName);
		
		textName = new JTextField();
		textName.setBounds(83, 174, 200, 30);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel lblClass = new JLabel("Class :");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClass.setBounds(310, 171, 60, 30);
		contentPane.add(lblClass);
		
		textClass = new JTextField();
		textClass.setColumns(10);
		textClass.setBounds(380, 171, 200, 30);
		contentPane.add(textClass);
		
		JLabel lblSection = new JLabel("Section :");
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSection.setBounds(590, 171, 80, 30);
		contentPane.add(lblSection);
		
		textSection = new JTextField();
		textSection.setColumns(10);
		textSection.setBounds(680, 171, 200, 30);
		contentPane.add(textSection);
		
		JLabel lblAdmissionNo = new JLabel("Admission No :");
		lblAdmissionNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdmissionNo.setBounds(10, 228, 120, 30);
		contentPane.add(lblAdmissionNo);
		
		textAdmissionNo = new JTextField();
		textAdmissionNo.setColumns(10);
		textAdmissionNo.setBounds(140, 228, 200, 30);
		contentPane.add(textAdmissionNo);
		
		JLabel lblFName = new JLabel("F Name :");
		lblFName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFName.setBounds(350, 228, 70, 30);
		contentPane.add(lblFName);
		
		textFName = new JTextField();
		textFName.setColumns(10);
		textFName.setBounds(430, 228, 200, 30);
		contentPane.add(textFName);
		
		JLabel lblAddress = new JLabel("Address : ");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(10, 289, 70, 30);
		contentPane.add(lblAddress);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(100, 289, 200, 30);
		contentPane.add(textAddress);
		
		JLabel lblYear = new JLabel("Year :");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblYear.setBounds(310, 289, 70, 30);
		contentPane.add(lblYear);
		
		textYear = new JTextField();
		textYear.setColumns(10);
		textYear.setBounds(380, 289, 200, 30);
		contentPane.add(textYear);
		
		JLabel lblMonth = new JLabel("Month :");
		lblMonth.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMonth.setBounds(590, 289, 70, 30);
		contentPane.add(lblMonth);
		
		textMonth = new JTextField();
		textMonth.setColumns(10);
		textMonth.setBounds(660, 289, 200, 30);
		contentPane.add(textMonth);
		
		JLabel lblAmount = new JLabel("Amount :");
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAmount.setBounds(190, 340, 80, 30);
		contentPane.add(lblAmount);
		
		textAmount = new JTextField();
		textAmount.setColumns(10);
		textAmount.setBounds(287, 343, 200, 30);
		contentPane.add(textAmount);
		
		JButton BtnSave = new JButton("Save");
		BtnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		BtnSave.setBounds(387, 424, 100, 30);
		contentPane.add(BtnSave);
	}
}
