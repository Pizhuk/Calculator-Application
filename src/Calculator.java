import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Calculator {	
	
	public Calculator() {
		JFrame frame = new JFrame("Calculator");
		frame.setSize(250, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField textField1 = new JTextField();
		JTextField textField2 = new JTextField();
		JTextField textField3 = new JTextField();
		JPanel content = new JPanel();
		JButton button = new JButton("Perform the operation");
		
		textField1.setBounds(10, 10, 141, 100);
		textField1.setColumns(10);
		
		textField2.setBounds(10, 10, 141, 100);
		textField2.setColumns(10);
		
		textField3.setBounds(10, 10, 141, 100);
		textField3.setColumns(10);
		
		content.add(new JLabel("Number #1 : "));
		content.add(textField1);
		content.add(new JLabel("Number #2 : "));
		content.add(textField2);
		content.add(new JLabel("Arithmetic operation: "));
		content.add(textField3);
		content.add(button);
		
		JLabel label = new JLabel("Result of operation: ");
		content.add(label);
		JLabel label1 = new JLabel("");
		content.add(label1);
		
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text1 = textField1.getText();
				String text2 = textField2.getText();
				String operation = textField3.getText();
				double answer = 0;
				
				if (IsDouble(text1)==true && IsDouble(text2)==true) {
					if (operation.equalsIgnoreCase("+")) {
						double firstNumber = Double.parseDouble(textField1.getText());
						double secondNumber = Double.parseDouble(textField2.getText());
						answer = (firstNumber + secondNumber);
						label.setText("Result: "+firstNumber+" "+operation+" "+secondNumber+" = "+answer);
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						label1.setText("");
					}
					else if (operation.equalsIgnoreCase("-")) {
						double firstNumber = Double.parseDouble(textField1.getText());
						double secondNumber = Double.parseDouble(textField2.getText());
						answer = (firstNumber - secondNumber);
						label.setText("Result: "+firstNumber+" "+operation+" "+secondNumber+" = "+answer);
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						label1.setText("");
					}
					else if (operation.equalsIgnoreCase("*")) {
						double firstNumber = Double.parseDouble(textField1.getText());
						double secondNumber = Double.parseDouble(textField2.getText());
						answer = (firstNumber * secondNumber);
						label.setText("Result: "+firstNumber+" "+operation+" "+secondNumber+" = "+answer);
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						label1.setText("");
					}
					else if (operation.equalsIgnoreCase("/")) {
						double firstNumber = Double.parseDouble(textField1.getText());
						double secondNumber = Double.parseDouble(textField2.getText());
						answer = (firstNumber / secondNumber);
						label.setText("Result: "+firstNumber+" "+operation+" "+secondNumber+" = "+answer);
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						label1.setText("");
					}
					
					else {
						label.setText("In field 'Arithmetic operation' can be");
						label1.setText("only such operators: '+', '-', '*' and '/'");
						textField3.setText("");
					}
				
				}
				else {
					label.setText("Number #1 and Number #2");
					textField1.setText("");
					textField2.setText("");
					textField3.setText("");
					label1.setText("should be double!");
					
				}
	        }

		});

		
		frame.setContentPane(content);
	       
        frame.setVisible(true);
	}
	
	public boolean IsDouble(String str) {
		boolean bool = false;
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3'
					|| str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7' 
					|| str.charAt(i)=='8' || str.charAt(i)=='9' || (str.charAt(i)=='.' && str.length()>1)) {
				bool = true;
			}
			else {
				bool = false;
				break;
			}
		}
		return bool;
	}

	


	

	
	public static void main(String[] args) {
		new Calculator();
		

	}
	

}
