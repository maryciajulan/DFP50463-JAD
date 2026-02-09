
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class BMICalculator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("BMI Calculator - GridLayout");
		frame.setLayout(new GridLayout(4,2));
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu sourceMenu = new JMenu("Source");
		JMenu refactorMenu = new JMenu("Refactor");
		JMenu navigateMenu = new JMenu("Navigate");
		JMenu searchMenu = new JMenu("Search");
		JMenu projectMenu = new JMenu("Project");
		JMenu runMenu = new JMenu("Run");
		JMenu windowMenu = new JMenu("Window");
		JMenu helpMenu = new JMenu("Help");
		JMenuItem aboutItem = new JMenuItem("About");
		JMenuItem helpItem = new JMenuItem("Help");
		
		fileMenu.add(aboutItem);
		fileMenu.add(helpItem);
		menuBar.add(fileMenu);
		
		editMenu.add(aboutItem);
		editMenu.add(helpItem);
		menuBar.add(editMenu);
		
		sourceMenu.add(aboutItem);
		sourceMenu.add(helpItem);
		menuBar.add(sourceMenu);
		
		refactorMenu.add(aboutItem);
		refactorMenu.add(helpItem);
		menuBar.add(refactorMenu);
		
		navigateMenu.add(aboutItem);
		navigateMenu.add(helpItem);
		menuBar.add(navigateMenu);
		
		searchMenu.add(aboutItem);
		searchMenu.add(helpItem);
		menuBar.add(searchMenu);
		
		projectMenu.add(aboutItem);
		projectMenu.add(helpItem);
		menuBar.add(projectMenu);
		
		runMenu.add(aboutItem);
		runMenu.add(helpItem);
		menuBar.add(runMenu);
		
		windowMenu.add(aboutItem);
		windowMenu.add(helpItem);
		menuBar.add(windowMenu);
		
		helpMenu.add(aboutItem);
		helpMenu.add(helpItem);
		menuBar.add(helpMenu);
		
		
		
		JLabel weightLabel = new JLabel("Weight (kg): ");
		frame.add(weightLabel);
		JTextField weightBox = new JTextField(10);
		frame.add(weightBox);
		
		JLabel heightLabel = new JLabel("Height (m): ");
		frame.add(heightLabel);
		JTextField heightBox = new JTextField(10);
		frame.add(heightBox);
		
		JLabel resultLabel = new JLabel("Result BMI: ");
		frame.add(resultLabel);
		JTextField resultBox = new JTextField(10);
		frame.add(resultBox);
		
		JButton calcButton = new JButton("Calculate");
		
		helpItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(frame,
						"BMI Calculator v1",
						"About BMI Calculator",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		aboutItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(frame, 
						"Marycia Julan",
						"About BMI Calculator",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		calcButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					double weight = Double.parseDouble(weightBox.getText());
					double height = Double.parseDouble(heightBox.getText());
					
					//bmi= weight/(height^2)
					double bmi;
					
					bmi = weight / (height*height);
					resultBox.setText(String.format("Result: %.2f", bmi));
					
				} catch (NumberFormatException ex) {
					// TODO: handle exception
					resultBox.setText("Ralat Sistem" + ex.toString());
					resultBox.setForeground(Color.RED);
				}
				
			}
		});
		
		
		frame.add(calcButton);
		JButton clearButton = new JButton("Clear");
		frame.add(clearButton);
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);

	}

}
