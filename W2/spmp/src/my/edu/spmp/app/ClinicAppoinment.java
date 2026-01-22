package my.edu.spmp.app;

import java.awt.FlowLayout;

import javax.swing.*;

public class ClinicAppoinment {
		public static JFrame clinicFrame() {
			JFrame frame = new JFrame();
			
			JTextField nameJTextField = new JTextField(5);
			JTextField noAppoinmentJTextField = new JTextField(5);
			JTextField appoinmentJTextField = new JTextField(5);
			
			JLabel nameJLabel = new JLabel("Name: ");
			JLabel noAppoinmentJLabel = new JLabel("No.Appoinment: ");
			JLabel appoinmentJLabel = new JLabel("Appoinment: ");
			
			JButton bookJButton = new JButton("Book Appoinment");
			
			
			frame.setSize(350, 200);
			JPanel panel = new JPanel(new FlowLayout());
			
			panel.add(nameJLabel);
			panel.add(nameJTextField);
			panel.add(noAppoinmentJLabel);
			panel.add(noAppoinmentJTextField);
			panel.add(appoinmentJLabel);
			panel.add(appoinmentJTextField);
			panel.add(bookJButton);
			
			frame.add(panel);
			return frame;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = clinicFrame();
		frame.setVisible(true);

	}

}
