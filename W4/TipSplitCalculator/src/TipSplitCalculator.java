import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TipSplitCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Tip & Split Calculator");
		frame.setLayout(new BorderLayout());

		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(3, 2));

		JLabel totalLabel = new JLabel("Total Bill");
		inputPanel.add(totalLabel);
		JTextField totalBoxField = new JTextField(15);
		inputPanel.add(totalBoxField);

		JLabel tipLabel = new JLabel("Tip Percentage");
		inputPanel.add(tipLabel);
		JComboBox tipComboBox = new JComboBox();
		tipComboBox.addItem("15%");
		tipComboBox.addItem("10%");
		tipComboBox.addItem("20%");
		inputPanel.add(tipComboBox);

		JLabel numPeopleLabel = new JLabel("Number of People");
		inputPanel.add(numPeopleLabel);
		JSpinner numSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
		inputPanel.add(numSpinner);

		frame.add(inputPanel, BorderLayout.NORTH);

		JLabel resultLabel = new JLabel("Each Person Pays: $0.00");
		frame.add(resultLabel, BorderLayout.CENTER);

		JButton splitButton = new JButton("Split");
		splitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					double totalBill = Double.parseDouble(totalBoxField.getText());
					String tipText = (String) tipComboBox.getSelectedItem();
					int tipPercentage = Integer.parseInt(tipText.replace("%", ""));
					int numPeople = (Integer) numSpinner.getValue();

					double tipAmount = totalBill * tipPercentage / 100;
					double totalWithTip = totalBill + tipAmount;
					double perPerson = totalWithTip / numPeople;

					resultLabel.setText(String.format("Each Person Pays: $%.2f", perPerson));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Please enter a valid number for Total Bill");
				}

			}
		});

		frame.add(splitButton, BorderLayout.SOUTH);

		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
