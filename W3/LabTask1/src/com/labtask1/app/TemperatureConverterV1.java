package com.labtask1.app;

import java.awt.*;

import javax.swing.*;

public class TemperatureConverterV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Temperature Converter - BorderLayout");
		frame.setLayout(new BorderLayout());
		
		JPanel unitPanel = new JPanel();
		unitPanel.add(new JLabel("Celcius: "));
		JTextField celciusBox = new JTextField(15);
		unitPanel.add(celciusBox);
		
		frame.add(unitPanel, BorderLayout.NORTH);
		
		JPanel inputPanel = new JPanel();
		inputPanel.add(new JLabel("Temperature Unit: "));
		
		JComboBox units = new JComboBox();
		units.addItem("Fahrenheit (°F)");
		units.addItem("Kelvin (K)");
		inputPanel.add(units);
		
		inputPanel.add(new JLabel("Result: "));
		JTextField resultBox = new JTextField(15);
		inputPanel.add(resultBox);
		
		frame.add(inputPanel, BorderLayout.CENTER);
	
		
		JButton btnConvert = new JButton("Convert");
		JButton btnClear = new JButton("Clear");
		
		JPanel buttonJPanel = new JPanel();
		buttonJPanel.add(btnConvert);
		buttonJPanel.add(btnClear);

		frame.add(buttonJPanel, BorderLayout.SOUTH);
		
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
