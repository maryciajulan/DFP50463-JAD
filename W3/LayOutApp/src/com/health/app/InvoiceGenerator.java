package com.health.app;

import java.awt.*;

import javax.swing.*;

public class InvoiceGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Invoice Tool (FlowLayout)");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(300, 500);

		frame.setLayout(new BorderLayout());

		JPanel inputJPanel = new JPanel(new GridLayout(2, 3));

		inputJPanel.add(new JLabel("Client Name:     "));
		inputJPanel.add(new JLabel("Hourly Rate ($): "));
		inputJPanel.add(new JLabel("Hours Worked:    "));

		JTextField txtClient = new JTextField(15);
		inputJPanel.add(txtClient);

		JTextField txtRate = new JTextField(15);
		inputJPanel.add(txtRate);
		
		frame.add(inputJPanel, BorderLayout.NORTH);
		
		JSpinner spinHours = new JSpinner(new SpinnerNumberModel(10, 5, 100, 1));
		spinHours.setPreferredSize(new Dimension(165, 25));
		 inputJPanel.add(spinHours);

		JTextArea areaPreview = new JTextArea(12, 22);
		areaPreview.setText("Invoice Details...");

		JScrollPane scroll = new JScrollPane(areaPreview);
		
		frame.add(scroll, BorderLayout.CENTER);


		JButton btnExport = new JButton("Export PDF");
		JButton btnClear = new JButton("Clear");
		
		JPanel buttonJPanel = new JPanel();
		buttonJPanel.add(btnExport);
		buttonJPanel.add(btnClear);
		
		frame.add(buttonJPanel, BorderLayout.SOUTH);

		frame.setVisible(true);

	}

}
