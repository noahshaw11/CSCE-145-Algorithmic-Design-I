/*
 * Created by Noah Shaw
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField txtDisplay;
	
	private double firstNum;
	private double secondNum;
	private double result;
	private String operation;
	private String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws DivideByZeroException 
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frmCalculator = new JFrame();
		frmCalculator.setBackground(Color.DARK_GRAY);
		frmCalculator.getContentPane().setBackground(Color.BLACK);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 388, 420);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setEditable(false);
		txtDisplay.setForeground(Color.WHITE);
		txtDisplay.setBackground(Color.BLACK);
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 11, 352, 40);
		frmCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.WHITE);
		btn0.setBackground(Color.GRAY);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(enteredNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBounds(10, 314, 61, 61);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(enteredNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(10, 251, 61, 61);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.GRAY);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(enteredNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(73, 251, 61, 61);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.GRAY);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(enteredNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(136, 251, 61, 61);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.GRAY);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(enteredNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(10, 188, 61, 61);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(Color.GRAY);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(enteredNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(73, 188, 61, 61);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(Color.GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(enteredNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(136, 188, 61, 61);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(Color.GRAY);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(enteredNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(10, 125, 61, 61);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(Color.GRAY);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(enteredNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(73, 125, 61, 61);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(Color.GRAY);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(enteredNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(136, 125, 61, 61);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnDec = new JButton(".");
		btnDec.setForeground(Color.WHITE);
		btnDec.setBackground(Color.GRAY);
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enteredNumber = txtDisplay.getText() + btnDec.getText();
				txtDisplay.setText(enteredNumber);
			}
		});
		btnDec.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDec.setBounds(73, 314, 61, 61);
		frmCalculator.getContentPane().add(btnDec);
		
		JButton btnPlusMin = new JButton("\u00B1"); //Plus/minus
		btnPlusMin.setForeground(Color.WHITE);
		btnPlusMin.setBackground(Color.GRAY);
		btnPlusMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double changeSign = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				changeSign = changeSign * (-1);
				txtDisplay.setText(String.valueOf(changeSign));
			}
		});
		btnPlusMin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlusMin.setBounds(136, 314, 61, 61);
		frmCalculator.getContentPane().add(btnPlusMin);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setForeground(Color.WHITE);
		btnEquals.setBackground(Color.ORANGE);
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(txtDisplay.getText());
				if(operation == "+")
				{
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operation == "-")
				{
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operation == "*")
				{
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operation == "/")
				{
					if(secondNum == 0.0)
					{
						txtDisplay.setText("Cannot divide by zero");
					}
					else
					{
						result = firstNum / secondNum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
					}
				}
				else if(operation == "^")
				{
					result = Math.pow(firstNum, secondNum);
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEquals.setBounds(199, 314, 61, 61);
		frmCalculator.getContentPane().add(btnEquals);
		
		JButton btnBack = new JButton("\u2190");
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(Color.LIGHT_GRAY);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back = null;
				if(txtDisplay.getText().length() > 0)
				{
					StringBuilder stringBuild = new StringBuilder(txtDisplay.getText());
					stringBuild.deleteCharAt(txtDisplay.getText().length() - 1);
					back = stringBuild.toString();
					txtDisplay.setText(back);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBounds(10, 62, 61, 61);
		frmCalculator.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.setForeground(Color.BLACK);
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClear.setBounds(73, 62, 61, 61);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnPerc = new JButton("%");
		btnPerc.setBackground(Color.LIGHT_GRAY);
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				result = firstNum / 100;
				answer = String.format("%.2f", result);
				txtDisplay.setText(answer);
			}
		});
		btnPerc.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPerc.setBounds(136, 62, 61, 61);
		frmCalculator.getContentPane().add(btnPerc);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setForeground(Color.WHITE);
		btnPlus.setBackground(Color.ORANGE);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlus.setBounds(199, 62, 61, 61);
		frmCalculator.getContentPane().add(btnPlus);
		
		JButton btnMin = new JButton("-");
		btnMin.setForeground(Color.WHITE);
		btnMin.setBackground(Color.ORANGE);
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "-";
			}
		});
		btnMin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMin.setBounds(199, 125, 61, 61);
		frmCalculator.getContentPane().add(btnMin);
		
		JButton btnMult = new JButton("*");
		btnMult.setForeground(Color.WHITE);
		btnMult.setBackground(Color.ORANGE);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMult.setBounds(199, 188, 61, 61);
		frmCalculator.getContentPane().add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setForeground(Color.WHITE);
		btnDiv.setBackground(Color.ORANGE);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDiv.setBounds(199, 251, 61, 61);
		frmCalculator.getContentPane().add(btnDiv);
		
		JButton btnExp = new JButton("^");
		btnExp.setForeground(Color.WHITE);
		btnExp.setBackground(Color.DARK_GRAY);
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "^";
			}
		});
		btnExp.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExp.setBounds(262, 62, 100, 29);
		frmCalculator.getContentPane().add(btnExp);
		
		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.setForeground(Color.WHITE);
		btnSqrt.setBackground(Color.DARK_GRAY);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				if(firstNum < 0)
				{
					txtDisplay.setText("Error");
				}
				else
				{
					result = Math.sqrt(firstNum);
					answer = String.format("\u00B1%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSqrt.setBounds(262, 94, 100, 29);
		frmCalculator.getContentPane().add(btnSqrt);
		
		JButton btnLog = new JButton("log");
		btnLog.setForeground(Color.WHITE);
		btnLog.setBackground(Color.DARK_GRAY);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(firstNum == 0.0)
				{
					txtDisplay.setText("Error");
				}
				else
				{
					firstNum = Double.parseDouble(txtDisplay.getText());
					result = Math.log10(firstNum);
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLog.setBounds(262, 125, 100, 61);
		frmCalculator.getContentPane().add(btnLog);
		
		JButton btnSin = new JButton("sin()");
		btnSin.setForeground(Color.WHITE);
		btnSin.setBackground(Color.DARK_GRAY);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				result = Math.sin(firstNum);
				answer = String.format("%.2f", result);
				txtDisplay.setText(answer);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSin.setBounds(262, 188, 100, 29);
		frmCalculator.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("cos()");
		btnCos.setForeground(Color.WHITE);
		btnCos.setBackground(Color.DARK_GRAY);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				result = Math.cos(firstNum);
				answer = String.format("%.2f", result);
				txtDisplay.setText(answer);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCos.setBounds(262, 220, 100, 29);
		frmCalculator.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan()");
		btnTan.setForeground(Color.WHITE);
		btnTan.setBackground(Color.DARK_GRAY);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				result = Math.tan(firstNum);
				answer = String.format("%.2f", result);
				txtDisplay.setText(answer);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTan.setBounds(262, 251, 100, 29);
		frmCalculator.getContentPane().add(btnTan);
		
		JButton btnArcsin = new JButton("arcsin()");
		btnArcsin.setForeground(Color.WHITE);
		btnArcsin.setBackground(Color.DARK_GRAY);
		btnArcsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				result = Math.asin(firstNum);
				answer = String.format("%.2f", result);
				txtDisplay.setText(answer);
			}
		});
		btnArcsin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnArcsin.setBounds(262, 283, 100, 29);
		frmCalculator.getContentPane().add(btnArcsin);
		
		JButton btnArccos = new JButton("arccos()");
		btnArccos.setForeground(Color.WHITE);
		btnArccos.setBackground(Color.DARK_GRAY);
		btnArccos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				result = Math.acos(firstNum);
				answer = String.format("%.2f", result);
				txtDisplay.setText(answer);
			}
		});
		btnArccos.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnArccos.setBounds(262, 315, 100, 29);
		frmCalculator.getContentPane().add(btnArccos);
		
		JButton btnArctan = new JButton("arctan()");
		btnArctan.setForeground(Color.WHITE);
		btnArctan.setBackground(Color.DARK_GRAY);
		btnArctan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				result = Math.atan(firstNum);
				answer = String.format("%.2f", result);
				txtDisplay.setText(answer);
			}
		});
		btnArctan.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnArctan.setBounds(262, 346, 100, 29);
		frmCalculator.getContentPane().add(btnArctan);
	}
}
