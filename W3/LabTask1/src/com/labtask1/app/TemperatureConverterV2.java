package com.labtask1.app;

import java.awt.*;

import javax.swing.*;

public class TemperatureConverterV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Temperature Converter - GridLayout");
		frame.setLayout(new GridLayout(4,1));
		
		frame.add(new JLabel("Celcius: "));
		JTextField celciusBox = new JTextField(15);
		frame.add(celciusBox);
		
		frame.add(new JLabel("Temperature Unit: "));
		
		JComboBox units = new JComboBox();
		units.addItem("Fahrenheit (°F)");
		units.addItem("Kelvin (K)");
		frame.add(units);
		
		frame.add(new JLabel("Result: "));
		JTextField resultBox = new JTextField(15);
		frame.add(resultBox);
		
		JButton btnConvert = new JButton("Convert");
		JButton btnClear = new JButton("Clear");
		
		frame.add(btnConvert);
		frame.add(btnClear);
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
