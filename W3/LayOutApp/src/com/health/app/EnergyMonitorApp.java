package com.health.app;

import java.awt.*;

import javax.swing.*;

public class EnergyMonitorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Energy Monitor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 450);
		
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		
		JLabel lblDisplay = new JLabel("Monthly Cost: $0.00", SwingConstants.CENTER);
		lblDisplay.setPreferredSize(new Dimension(300,100));
		lblDisplay.setOpaque(true);
		lblDisplay.setBackground(Color.GREEN);
		lblDisplay.setForeground(Color.BLACK);
		lblDisplay.setFont(new Font("Arial", Font.BOLD,18));
		frame.add(lblDisplay);
		
		frame.add(new JLabel("AirCon (Watts: 1500)"));
		

	}

}
