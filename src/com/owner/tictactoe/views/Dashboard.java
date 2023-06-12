package com.owner.tictactoe.views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			Dashboard window = new Dashboard();
			window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public Dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void gameStart() {
		String player1 = textField1.getText();
		String player2 = textField2.getText();
		frame.setVisible(false);
		frame.dispose();
		new UserView(player1, player2);
		
	}
	private void initialize() {
		frame = new JFrame("TicTacToe-Game");
		frame.setBounds(100, 100, 770, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Dashboard.class.getResource("/assets/img.png")));
		lblNewLabel.setBounds(0, 0, 492, 294);
		frame.getContentPane().add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textField1.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField1.setBounds(516, 68, 232, 35);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Player 1 Name : ");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel_1.setBounds(516, 33, 182, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Player 2 Name : ");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel_2.setBounds(516, 127, 184, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textField2.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField2.setColumns(10);
		textField2.setBounds(516, 163, 232, 35);
		frame.getContentPane().add(textField2);
		
		JButton btnNewButton = new JButton("Start Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameStart();
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnNewButton.setBounds(552, 237, 169, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
