import java.awt.EventQueue;

import java.sql.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Crud {
	
	static Connection con;
	public static void connect()
	{
		
			
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/java_swing","root","");	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		connect();
		// for frame;
		
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setBounds(600,200,350,340);
		frame.setTitle("CRUD APPLICATION");
		ImageIcon icon = new ImageIcon("images.jpg");
		frame.setIconImage(icon.getImage());
		frame.setLayout(null);
		
		
		JLabel lblTitle = new JLabel("Crud Application");
		lblTitle.setFont(new Font ("",Font.BOLD, 36));
		lblTitle.setBounds(20,1,300,40);
		frame.add(lblTitle);
		
		// for label;

		JLabel labelID = new JLabel("ID");
		labelID.setFont(new Font ("",Font.BOLD, 18));
		labelID.setBounds(10,50,150,25);
		
		
		JLabel labelAddress = new JLabel("EMAIL ADDRESS");
		labelAddress.setFont(new Font ("",Font.BOLD, 18));
		labelAddress.setBounds(10,80,300,25);
		
		JLabel labelPass = new JLabel("PASSWORD");
		labelPass.setFont(new Font ("",Font.BOLD, 18));
		labelPass.setBounds(10,110,300,25);
		
		JLabel labelNum = new JLabel("PHONE NUMBER");
		labelNum.setFont(new Font ("",Font.BOLD, 18));
		labelNum.setBounds(10,140,300,25);

		frame.add(labelID);
		frame.add(labelAddress);
		frame.add(labelPass);
		frame.add(labelNum);
		
		JTextField textID = new JTextField("");
		textID.setBounds(170,50,150,25);
		textID.setFont(new Font ("",Font.BOLD, 18));
		
		JTextField textAddress = new JTextField("");
		textAddress.setBounds(170,80,150,25);
		textAddress.setFont(new Font ("",Font.BOLD, 18));
		
		JTextField textPass = new JTextField("");
		textPass.setBounds(170,110,150,25);
		textPass.setFont(new Font ("",Font.BOLD, 18));
		
		JTextField textNum = new JTextField("");
		textNum.setBounds(170,140,150,25);
		textNum.setFont(new Font ("",Font.BOLD, 18));
		
		frame.add(textID);
		frame.add(textAddress);
		frame.add(textPass);
		frame.add(textNum);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(170,180,150,25);
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(170,210,150,25);
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(170,240,150,25);

		frame.add(btnAdd);
		frame.add(btnUpdate);
		frame.add(btnDelete);
		
		JLabel labelRecord = new JLabel("Find Record-Enter ID");
		labelRecord.setFont(new Font ("",Font.BOLD, 14));
		labelRecord.setBounds(10,180,300,25);
		frame.add(labelRecord);
		
		JTextField textRecord = new JTextField("");
		textRecord.setBounds(10,210,150,25);
		textRecord.setFont(new Font ("",Font.BOLD, 18));
		frame.add(textRecord);
		
		JButton buttonSearch = new JButton("Search");
		buttonSearch.setBounds(10,240,150,25);
		frame.add(buttonSearch);
		
		
		
		buttonSearch.addActionListener(new ActionListener() 
		{ 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(null,"Successfull");
				  
			  } 
			  
		} );
		btnAdd.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(null,"Successfull");			  } 
			} );
		btnUpdate.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(null,"Successfull");
				  
			  } 
			} );
		btnDelete.addActionListener(new ActionListener() {
			
			
			  public void actionPerformed(ActionEvent e) { 
				  JOptionPane.showMessageDialog(null,"Successfull");
			  } 
			} );
			
		
	}
	 

}
