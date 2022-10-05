package calcullater;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calform {
	static double a,b;
	static int c = 0;
	static double result;
	public static void main(String[] args) {
		Font f1;
		JFrame Frame = new JFrame();
		JTextField Field = new JTextField();
		JButton Btn0 = new JButton("0");
		JButton Btn1 = new JButton("1");
		JButton Btn2 = new JButton("2");
		JButton Btn3 = new JButton("3");
		JButton Btn4 = new JButton("4");
		JButton Btn5 = new JButton("5");
		JButton Btn6 = new JButton("6");
		JButton Btn7 = new JButton("7");
		JButton Btn8 = new JButton("8");
		JButton Btn9 = new JButton("9");
		JButton Btn10 = new JButton("+");
		JButton Btn11 = new JButton("-");
		JButton Btn12 = new JButton("x");
		JButton Btn13 = new JButton("%");
		JButton Btn14 = new JButton("C");
		JButton Btn15 = new JButton("=");
		JButton Btn16 = new JButton(".");
		f1 = new Font("청소년체",Font.PLAIN, 20);
		DecimalFormat df = new DecimalFormat("###.#");

		Field.setBounds(10,10,230,80);
		Btn0.setBounds(70,220,50,30);
		Btn1.setBounds(10,100,50,30);
		Btn2.setBounds(70,100,50,30);
		Btn3.setBounds(130,100,50,30);
		Btn4.setBounds(10,140,50,30);
		Btn5.setBounds(70,140,50,30);
		Btn6.setBounds(130,140,50,30);
		Btn7.setBounds(10,180,50,30);
		Btn8.setBounds(70,180,50,30);
		Btn9.setBounds(130,180,50,30);
		Btn10.setBounds(190,100,50,30);
		Btn11.setBounds(190,140,50,30);
		Btn12.setBounds(190,180,50,30);
		Btn13.setBounds(190,220,50,30);
		Btn14.setBounds(10,220,50,30);
		Btn15.setBounds(10,260,230,30);
		Btn16.setBounds(130,220,50,30);
		
		Frame.setTitle("계산기");
		Frame.setResizable(false);	
		Frame.setLocationRelativeTo(null);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(260,340);
		Frame.getContentPane().setLayout(null);
		Frame.getContentPane().add(Btn0);
		Frame.getContentPane().add(Btn1);
		Frame.getContentPane().add(Btn2);
		Frame.getContentPane().add(Btn3);
		Frame.getContentPane().add(Btn4);
		Frame.getContentPane().add(Btn5);
		Frame.getContentPane().add(Btn6);
		Frame.getContentPane().add(Btn7);
		Frame.getContentPane().add(Btn8);
		Frame.getContentPane().add(Btn9);
		Frame.getContentPane().add(Btn10);
		Frame.getContentPane().add(Btn11);
		Frame.getContentPane().add(Btn12);
		Frame.getContentPane().add(Btn13);
		Frame.getContentPane().add(Btn14);
		Frame.getContentPane().add(Btn15);
		Frame.getContentPane().add(Btn16);
		Frame.getContentPane().add(Field);
		Frame.setVisible(true);
		Field.setEnabled(true);
		Field.setHorizontalAlignment(JTextField.RIGHT);
		Field.setFont(f1);
		
		Btn0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Field.setText(Field.getText() + "0");
			}
		});
		
		Btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Field.setText(Field.getText() + "1");
			}
		});
		
		Btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Field.setText(Field.getText() + "2");
			}
		});
		
		Btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Field.setText(Field.getText() + "3");
			}
		});
		
		Btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Field.setText(Field.getText() + "4");
			}
		});
		
		Btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Field.setText(Field.getText() + "5");
			}
		});
		
		Btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Field.setText(Field.getText() + "6");
			}
		});
		
		Btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Field.setText(Field.getText() + "7");
			}
		});
		
		Btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Field.setText(Field.getText() + "8");
			}
		});
		
		Btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Field.setText(Field.getText() + "9");
			}
		});
		Btn10.addActionListener(new ActionListener() {
			//더하기
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = Field.getText();
				a = Double.parseDouble(str);
				Field.setText("");
				c = 1;
			}
		});
		Btn11.addActionListener(new ActionListener() {
			//빼기
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = Field.getText();
				a = Double.parseDouble(str);
				Field.setText("");
				c = 2;
			}
		});
		Btn12.addActionListener(new ActionListener() {
			//곱하기
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = Field.getText();
				a = Double.parseDouble(str);
				Field.setText("");
				c = 3;
			}
		});
		Btn13.addActionListener(new ActionListener() {
			//나누기
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str = Field.getText();
				a = Double.parseDouble(str);
				Field.setText("");
				c = 4;
			}
		});
		Btn14.addActionListener(new ActionListener() {
			//지우기
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Field.setText("");
			}
		});
		Btn16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Field.setText(Field.getText() + ".");
			}
		});
		Btn15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str1 = Field.getText();
				b = Double.parseDouble(str1);
				Field.setText("");
				
				switch (c) {
					case 1: {
						a = a + b;
						if ((a == Math.floor(a)) && !Double.isInfinite(a)) {
							Field.setText(Field.getText() + df.format(a));
						}
						else {
							Field.setText(Field.getText() + (a));
						}
						c = 0;
						break;
					}
					case 2: {
					
						a = a - b;
						if ((a == Math.floor(a)) && !Double.isInfinite(a)) {
							Field.setText(Field.getText() + df.format(a));
						}
						else {
							Field.setText(Field.getText() + (a));
						}
						c = 0;
						break;
					}
					case 3: {
						a = a * b;
						if ((a == Math.floor(a)) && !Double.isInfinite(a)) {
							Field.setText(Field.getText() + df.format(a));
						}
						else {
							Field.setText(Field.getText() + (a));
						}
						c = 0;
						break;
					}	
					case 4: {
						a = a / b;
						if ((a == Math.floor(a)) && !Double.isInfinite(a)) {
							Field.setText(Field.getText() + df.format(a));
						}
						else {
							Field.setText(Field.getText() + (a));
						}
						c = 0;
						break;
					}	
					default:{
						c = 0;
						Field.setText(Field.getText() + "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
						break;
					}
				}
				}
			}
		);
	}
}
