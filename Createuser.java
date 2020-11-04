import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.SystemColor;

public class Createuser extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textUsername;
	private JTextField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Createuser frame = new Createuser();
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
	public Createuser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateUserPanel = new JLabel("Create User Panel");
		lblCreateUserPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateUserPanel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCreateUserPanel.setBounds(10, 10, 966, 60);
		contentPane.add(lblCreateUserPanel);
		
		JLabel lblLoginAs = new JLabel("Login As");
		lblLoginAs.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLoginAs.setBounds(80, 136, 110, 25);
		contentPane.add(lblLoginAs);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(80, 188, 110, 25);
		contentPane.add(lblName);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setBounds(80, 248, 110, 25);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(80, 302, 110, 25);
		contentPane.add(lblPassword);
		
		textName = new JTextField();
		textName.setBackground(new Color(253, 245, 230));
		textName.setBounds(204, 190, 150, 30);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textUsername = new JTextField();
		textUsername.setColumns(10);
		textUsername.setBackground(new Color(253, 245, 230));
		textUsername.setBounds(204, 248, 150, 30);
		contentPane.add(textUsername);
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		textPassword.setBackground(new Color(253, 245, 230));
		textPassword.setBounds(204, 302, 150, 30);
		contentPane.add(textPassword);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreate.setBounds(105, 371, 90, 30);
		contentPane.add(btnCreate);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(264, 371, 90, 30);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(105, 428, 90, 30);
		contentPane.add(btnDelete);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				Home h = new Home();
				h.setVisible(true);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClose.setBounds(264, 428, 90, 30);
		contentPane.add(btnClose);
	}
}
