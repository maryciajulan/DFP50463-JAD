import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Coffee Shop Order System");
		frame.setLayout(new GridLayout(5,2));
		
		JLabel typeLabel = new JLabel("Select Coffee Type");
		frame.add(typeLabel);
		JComboBox kopi = new JComboBox();
		kopi.addItem("Americano");
		kopi.addItem("Cappucino");
		kopi.addItem("Spanish latte");
		kopi.addItem("Mocha");
		frame.add(kopi);
		
		
		JLabel quantityLabel = new JLabel("Quantity");
		frame.add(quantityLabel);
		JSpinner quantity = new JSpinner(new SpinnerNumberModel(1,1,10,1));
		frame.add(quantity);
		
		JLabel sugarLabel = new JLabel("Sugar Level");
		frame.add(sugarLabel);
		JComboBox level = new JComboBox();
		level.addItem("less sweet");
		level.addItem("Regular sweet");
		level.addItem("Extra sweet");
		frame.add(level);
		
		JLabel nameLabel = new JLabel("Customer Name");
		frame.add(nameLabel);
		JTextField nameBoxField = new JTextField(10);
		frame.add(nameBoxField);
		
		JButton orderButton = new JButton("Place Order");
		frame.add(orderButton);
		JLabel display = new JLabel();
		frame.add(display);
		
		orderButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String customerName = nameBoxField.getText();
				display.setText("Order for "  +  customerName + ": " +  quantity.getValue() + "  "  + kopi.getSelectedItem() + " coming up" );
			}
		});
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
