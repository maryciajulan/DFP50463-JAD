package com.health.app;

import java.awt.*;

import javax.swing.*;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame ("BMI Calculator 2.0");
		frame.setLayout(new FlowLayout());
		
		JLabel weightLabel = new JLabel("Weight (kg): ");
		frame.add(weightLabel);
		
		JTextField weightBox = new JTextField(10);
		frame.add(weightBox);
		
		JLabel heightLabel = new JLabel("Height (m): ");
		frame.add(heightLabel);
		
		JTextField heightBox = new JTextField(10);
		frame.add(heightBox);
		
		JButton button = new JButton("Calculate");
		frame.add(button);
		
		JLabel resultLabel = new JLabel("Your BMI result:  ");
		frame.add(resultLabel);
		
		JTextField resulttBox = new JTextField(10);
		frame.add(resulttBox);
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		

	}

}
