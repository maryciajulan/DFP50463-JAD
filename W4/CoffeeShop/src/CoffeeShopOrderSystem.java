import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CoffeeShopOrderSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Coffee Shop Order System");
		frame.setLayout(new BorderLayout());

		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(4, 2));

		JLabel typeLabel = new JLabel("Coffee Type");
		inputPanel.add(typeLabel);
		JComboBox typeComboBox = new JComboBox();
		typeComboBox.addItem("Latte");
		typeComboBox.addItem("Americano");
		typeComboBox.addItem("Mocha");
		inputPanel.add(typeComboBox);

		JLabel quantityLabel = new JLabel("Quantity");
		inputPanel.add(quantityLabel);
		JSpinner numSpinner = new JSpinner(new SpinnerNumberModel(2, 1, 10, 1));
		inputPanel.add(numSpinner);

		JLabel levelLabel = new JLabel("Sugar Level");
		inputPanel.add(levelLabel);
		JComboBox levelComboBox = new JComboBox();
		levelComboBox.addItem("Medium");
		levelComboBox.addItem("Low");
		levelComboBox.addItem("High");
		inputPanel.add(levelComboBox);

		frame.add(inputPanel, BorderLayout.NORTH);

		JLabel nameLabel = new JLabel("Customer Name");
		inputPanel.add(nameLabel);
		JTextField nameBoxField = new JTextField(15);
		inputPanel.add(nameBoxField);

		JLabel resultLabel = new JLabel();
		frame.add(resultLabel, BorderLayout.SOUTH);

		JButton orderButton = new JButton("Place Order");
		orderButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = nameBoxField.getText();
				String coffee = (String) typeComboBox.getSelectedItem();
				int quantity = (Integer) numSpinner.getValue();
				
				// Show result
				String message = "Order for " + name + ": " + quantity + " " + coffee + " coming up!";
				resultLabel.setText(message);
			}
		});

		frame.add(orderButton, BorderLayout.CENTER);

		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
