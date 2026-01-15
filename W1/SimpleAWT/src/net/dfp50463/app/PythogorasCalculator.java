package net.dfp50463.app;

import java.awt.*;
public class PythogorasCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new Frame("Pythogoras Calculator");
		frame.setLayout(new FlowLayout());
		
		Label num1 = new Label("a");
		frame.add(num1);
		
		TextField text1 = new TextField("0.0", 10);
		frame.add(text1);
		
		Label num2 = new Label("b");
		frame.add(num2);
		
		TextField text2 = new TextField("0.0", 10);
		frame.add(text2);
		
		Label num3 = new Label("c");
		frame.add(num3);
		
		TextField text3 = new TextField("0.0", 10);
		frame.add(text3);
		
		Button calculateButton = new Button("Calculate");
		frame.add(calculateButton);
		
		frame.setSize(300, 200);
		
		frame.setVisible(true);
	}

}
