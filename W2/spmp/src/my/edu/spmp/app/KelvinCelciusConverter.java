package my.edu.spmp.app;

import java.awt.FlowLayout;

import javax.swing.*;

public class KelvinCelciusConverter {
	public static JFrame createKelvinCelciusFrame() {
		JFrame frame = new JFrame();
		
		JTextField kelvinJTextField = new JTextField(5);
		
		JLabel kelvinJLabel = new JLabel("K");
		
		JButton clearJButton = new JButton("Clear");
		JButton calculateJButton = new JButton("Calculate");
		
		frame.setSize(350, 200);
		JPanel panel = new JPanel(new FlowLayout());
		
		panel.add(kelvinJTextField);
		panel.add(kelvinJLabel);
		panel.add(clearJButton);
		panel.add(calculateJButton);
		
		frame.add(panel);
		return frame;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = createKelvinCelciusFrame();
		frame.setVisible(true);
		
		

	}

}
