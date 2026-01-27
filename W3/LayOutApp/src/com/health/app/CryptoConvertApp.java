package com.health.app;

import java.awt.*;

import javax.swing.*;

public class CryptoConvertApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Currency Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 400);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
		
		JTextField txtAmount = new JTextField("1.0", 10);
		String[] currencies = {"USD", "EUR", "BTC", "ETH"};
		JComboBox<String>comboForm = new JComboBox<>(currencies);
		
		frame.add(txtAmount);
		frame.add(comboForm);
		
		ImageIcon swapIcon = new ImageIcon("swap_icon.png");
		Image img = swapIcon.getImage();
		Image newImg = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		swapIcon = new ImageIcon(newImg);
		
		JButton btnSwap = new JButton(swapIcon);
		btnSwap.setPreferredSize(new Dimension(50, 50));
		frame.add(btnSwap);
		
		JTextField txtResult = new JTextField(10);
		txtResult.setEditable(false);
		txtResult.setBackground(Color.LIGHT_GRAY);
		JComboBox<String>comboTo = new JComboBox<>(currencies);
		
		frame.add(txtResult);
		frame.add(comboTo);
		
		JLabel lblTime = new JLabel("Last Updated: 2026-01-25 22:15");
		lblTime.setFont(new Font("Arial", Font.ITALIC, 10));
		frame.add(lblTime);
		
		frame.setVisible(true);
		

	}

}
