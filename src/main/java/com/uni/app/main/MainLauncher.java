package com.uni.app.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.Font;

public class MainLauncher {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField primaryTableName;
	private JTextField secondaryTableName;
	private JTextField primaryHost;
	private JTextField secondaryHost;
	private JTextField primaryUserName;
	private JTextField secondaryUserName;
	private JPasswordField primaryPassword;
	private JPasswordField secondaryPassword;
	private JTextField primaryTableCondition;
	private JTextField secondaryTableCondition;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLauncher window = new MainLauncher();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainLauncher() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setSize(1000, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, Color.WHITE, null, null, null));
		panel.setBounds(10, 11, 500, 40);
		frame.getContentPane().add(panel);
		
		JLabel lblComparator = new JLabel("COMPARATOR");
		lblComparator.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel.add(lblComparator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Connection Type", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(10, 50, 500, 105);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOfConnections = new JLabel("*# of Connections :");
		lblOfConnections.setBounds(10, 22, 99, 14);
		panel_1.add(lblOfConnections);
		
		/* Connection Host Details */
		JComboBox noOfConnections = new JComboBox();
		noOfConnections.setBounds(119, 19, 120, 20);
		panel_1.add(noOfConnections);
		
		JLabel lblPrimaryHost = new JLabel("*Primary Host :");
		lblPrimaryHost.setBounds(10, 55, 99, 14);
		panel_1.add(lblPrimaryHost);
		
		JLabel lblSecondaryHost = new JLabel("*Secondary Host :");
		lblSecondaryHost.setBounds(10, 80, 99, 14);
		panel_1.add(lblSecondaryHost);
		
		primaryHost = new JTextField();
		primaryHost.setBounds(118, 52, 186, 20);
		panel_1.add(primaryHost);
		primaryHost.setColumns(10);
		
		secondaryHost = new JTextField();
		secondaryHost.setColumns(10);
		secondaryHost.setBounds(118, 77, 186, 20);
		panel_1.add(secondaryHost);
		
		primaryUserName = new JTextField();
		primaryUserName.setBounds(314, 52, 80, 20);
		panel_1.add(primaryUserName);
		primaryUserName.setColumns(10);
		
		secondaryUserName = new JTextField();
		secondaryUserName.setBounds(314, 77, 80, 20);
		panel_1.add(secondaryUserName);
		secondaryUserName.setColumns(10);
		
		primaryPassword = new JPasswordField();
		primaryPassword.setBounds(410, 52, 80, 20);
		panel_1.add(primaryPassword);
		
		secondaryPassword = new JPasswordField();
		secondaryPassword.setBounds(410, 77, 80, 20);
		panel_1.add(secondaryPassword);
		
		JLabel lblUsername = new JLabel("*USERNAME:");
		lblUsername.setBounds(314, 34, 80, 14);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("*PASSWORD:");
		lblPassword.setBounds(410, 34, 80, 14);
		panel_1.add(lblPassword);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Table Details", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel_2.setBounds(10, 153, 964, 130);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblPrimaryTableName = new JLabel("*Primary Table Name :");
		lblPrimaryTableName.setBounds(10, 25, 124, 14);
		panel_2.add(lblPrimaryTableName);
		
		JLabel lblSecondarytableName = new JLabel("*Secondary Table Name :");
		lblSecondarytableName.setBounds(483, 25, 141, 14);
		panel_2.add(lblSecondarytableName);
		
		JLabel lblPrimaryTableColumns = new JLabel("Primary Table Columns:");
		lblPrimaryTableColumns.setBounds(10, 50, 124, 14);
		panel_2.add(lblPrimaryTableColumns);
		
		JLabel lblSecondaryTableColumns = new JLabel("Secondary Table Columns :");
		lblSecondaryTableColumns.setBounds(483, 50, 141, 14);
		panel_2.add(lblSecondaryTableColumns);
		
		primaryTableName = new JTextField();
		primaryTableName.setBounds(144, 22, 305, 20);
		panel_2.add(primaryTableName);
		primaryTableName.setColumns(10);
		
		JTextArea primaryTableColumn = new JTextArea();
		primaryTableColumn.setBounds(144, 48, 305, 44);
		panel_2.add(primaryTableColumn);
		
		JTextArea secondaryTableColumn = new JTextArea();
		secondaryTableColumn.setBounds(634, 48, 305, 44);
		panel_2.add(secondaryTableColumn);
		
		secondaryTableName = new JTextField();
		secondaryTableName.setColumns(10);
		secondaryTableName.setBounds(634, 22, 305, 20);
		panel_2.add(secondaryTableName);
		
		JLabel lblPrimaryTableCondition = new JLabel("Primary Table Condition:");
		lblPrimaryTableCondition.setBounds(10, 102, 124, 14);
		panel_2.add(lblPrimaryTableCondition);
		
		primaryTableCondition = new JTextField();
		primaryTableCondition.setColumns(10);
		primaryTableCondition.setBounds(144, 99, 305, 20);
		panel_2.add(primaryTableCondition);
		
		JLabel lblSecondaryTableCondition = new JLabel("Secondary Table Condition:");
		lblSecondaryTableCondition.setBounds(483, 102, 141, 14);
		panel_2.add(lblSecondaryTableCondition);
		
		secondaryTableCondition = new JTextField();
		secondaryTableCondition.setColumns(10);
		secondaryTableCondition.setBounds(634, 99, 305, 20);
		panel_2.add(secondaryTableCondition);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(531, 120, 116, 30);
		frame.getContentPane().add(btnReset);
		
		JButton btnSetupConnection = new JButton("Setup Conn...");
		btnSetupConnection.setBounds(531, 85, 116, 30);
		frame.getContentPane().add(btnSetupConnection);
		
		JButton btnCompareFields = new JButton("Compare Fields");
		btnCompareFields.setEnabled(false);
		btnCompareFields.setBounds(531, 50, 116, 30);
		frame.getContentPane().add(btnCompareFields);
		
		JButton btnCompareValues = new JButton("Compare Values");
		btnCompareValues.setEnabled(false);
		btnCompareValues.setBounds(531, 15, 116, 30);
		frame.getContentPane().add(btnCompareValues);
		
		JTextPane txtpnThis = new JTextPane();
		txtpnThis.setEditable(false);
		txtpnThis.setText("** This Utility is to Compare Fields in two tables. \r\n** This Utility is to Compare Fields values in two tables. \r\n** You can also setup 2 connection and compare values b/w two database i.e. SIT/ PROD or UAT/PROD etc. \r\n** This Utility will help validate data in PROD and UAT, which is a usual Concern with everyone. \r\n** You can also specify condition for select as well. \r\n** HOSTN Details format: jdbc:oracle:thin:@localhost:1521/serviceName");
		txtpnThis.setBounds(657, 11, 317, 137);
		frame.getContentPane().add(txtpnThis);
		
		JTextPane outputTextPane = new JTextPane();
		outputTextPane.setEditable(false);
		outputTextPane.setBounds(10, 308, 964, 442);
		frame.getContentPane().add(outputTextPane);
		
		JLabel lblComparisionDetails = new JLabel("Comparision Details");
		lblComparisionDetails.setBounds(445, 293, 103, 14);
		frame.getContentPane().add(lblComparisionDetails);
	}
}
