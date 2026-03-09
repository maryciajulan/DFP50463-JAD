//Nama : Marycia Julan
//No. Pendaftaran : 20DIT23F2008
//PRACTICAL WORK 1


package com.labtask1.app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InvoiceGenerator {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Invoice Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 550);
        frame.setLayout(new BorderLayout());

        
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        inputPanel.add(new JLabel("Client Name:"));
        JTextField txtClient = new JTextField();
        txtClient.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(txtClient);

        inputPanel.add(new JLabel("Hourly Rate ($):"));
        JTextField txtRate = new JTextField();
        txtRate.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(txtRate);

        inputPanel.add(new JLabel("Hours Worked:"));
        JSpinner spinHours = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        spinHours.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(spinHours);

        inputPanel.add(new JLabel("Tax Rate (%):"));
        JTextField txtTax = new JTextField();
        txtTax.setPreferredSize(new Dimension(200, 30));
        inputPanel.add(txtTax);

        inputPanel.add(new JLabel("Apply 10% Discount:"));
        JCheckBox checkDiscount = new JCheckBox();
        inputPanel.add(checkDiscount);

        frame.add(inputPanel, BorderLayout.NORTH);


        JTextArea reportArea = new JTextArea();
        reportArea.setEditable(false);
        frame.add(new JScrollPane(reportArea), BorderLayout.CENTER);


        JButton btnGenerate = new JButton("Generate Report");
        JButton btnClear = new JButton("Clear Form");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnGenerate);
        buttonPanel.add(btnClear);
        frame.add(buttonPanel, BorderLayout.SOUTH);


        btnGenerate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String clientName = txtClient.getText().trim();
                    double hourlyRate = Double.parseDouble(txtRate.getText().trim());
                    int hoursWorked = (int) spinHours.getValue();
                    double taxRate = Double.parseDouble(txtTax.getText().trim());

                    double subtotal = hourlyRate * hoursWorked;
                    double taxAmount = subtotal * (taxRate / 100.0);
                    double discount = checkDiscount.isSelected() ? subtotal * 0.10 : 0.0;
                    double total = subtotal + taxAmount - discount;

                    String report = "Client: " + clientName + "\n"
                            + "Company / heading: Invoice Generator\n"
                            + "Description: Software Development\n"
                            + "Rate: $" + hourlyRate + "/hr\n"
                            + "Hours Works:" + hoursWorked + " hrs\n"
                            + "Subtotal: $" + String.format("%.2f", subtotal) + "\n"
                            + "Tax (" + taxRate + "%): $" + String.format("%.2f", taxAmount) + "\n"
                            + (checkDiscount.isSelected() ? "Discount (10%): $" + String.format("%.2f", discount) + "\n" : "")
                            + "Total Due: $" + String.format("%.2f", total) + "\n"
                            + "Thank you for your business!";

                    reportArea.setText(report);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers for Rate, Hours, and Tax Rate.");
                }
            }
        });


        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtClient.setText("");
                txtRate.setText("");
                txtTax.setText("");
                spinHours.setValue(0);
                checkDiscount.setSelected(false);
                reportArea.setText("");
            }
        });

        frame.setVisible(true);
    }
}