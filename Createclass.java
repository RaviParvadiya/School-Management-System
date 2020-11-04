import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Createclass extends JFrame {

	private JPanel contentPane;
	private JTextField textClassName;
	private JTextField textSection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Createclass frame = new Createclass();
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
	public Createclass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateClass = new JLabel("Create Class");
		lblCreateClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCreateClass.setBounds(10, 10, 466, 50);
		contentPane.add(lblCreateClass);
		
		JLabel lblClassName = new JLabel("Class Name");
		lblClassName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClassName.setBounds(130, 118, 110, 25);
		contentPane.add(lblClassName);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSection.setBounds(130, 163, 110, 25);
		contentPane.add(lblSection);
		
		textClassName = new JTextField();
		textClassName.setBounds(282, 118, 150, 30);
		contentPane.add(textClassName);
		textClassName.setColumns(10);
		
		textSection = new JTextField();
		textSection.setColumns(10);
		textSection.setBounds(282, 158, 150, 30);
		contentPane.add(textSection);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreate.setBounds(130, 230, 100, 25);
		contentPane.add(btnCreate);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(282, 230, 100, 25);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(130, 265, 100, 25);
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
		btnClose.setBounds(282, 265, 100, 25);
		contentPane.add(btnClose);
	}

}
