package com.health.app;

import java.awt.*;

import javax.swing.*;

public class BMICalculatorV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame ("BMI Calculator 2.2 - BorderLayout");
		frame.setLayout(new BorderLayout());
		
		JPanel inputJPanel = new JPanel(new GridLayout(2,2));
		
		JLabel weightLabel = new JLabel("Weight (kg): ");
		inputJPanel.add(weightLabel);
		
		JTextField weightBox = new JTextField(10);
		inputJPanel.add(weightBox);
		
		JLabel heightLabel = new JLabel("Height (m): ");
		inputJPanel.add(heightLabel);
		
		JTextField heightBox = new JTextField(10);
		inputJPanel.add(heightBox);
		
		frame.add(inputJPanel, BorderLayout.NORTH);
		
		
		JButton button = new JButton("Calculate");
		frame.add(button, BorderLayout.CENTER);
		
		
		JPanel inputPanel = new JPanel(new GridLayout(1,3));
		
		JLabel resultLabel = new JLabel("Your BMI result:  ");
		inputPanel.add(resultLabel);
		
		JTextField resulttBox = new JTextField(10);
		inputPanel.add(resulttBox);
		
		frame.add(inputPanel, BorderLayout.SOUTH);
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
