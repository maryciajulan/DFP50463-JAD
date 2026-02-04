package com.labtask1.app;

import java.awt.FlowLayout;

import javax.swing.*;

public class BMICalculatorV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("BMI Calculator - FlowLayout");
		frame.setLayout(new FlowLayout());
		
		JLabel weightLabel = new JLabel("Weight (kg): ");
		frame.add(weightLabel);
		JTextField weightBox = new JTextField(10);
		frame.add(weightBox);
		
		JLabel heightLabel = new JLabel("Height (cm): ");
		frame.add(heightLabel);
		JTextField heightBox = new JTextField(10);
		frame.add(heightBox);
		
		JLabel resultLabel = new JLabel("Result BMI: ");
		frame.add(resultLabel);
		JTextField resultBox = new JTextField(10);
		frame.add(resultBox);
		
		JButton calcButton = new JButton("Calculate");
		frame.add(calcButton);
		JButton clearButton = new JButton("Clear");
		frame.add(clearButton);
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
