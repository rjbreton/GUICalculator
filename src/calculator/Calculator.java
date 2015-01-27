package calculator;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			JFrame frame = new JFrame("My Calculator");
			frame.setVisible(true);
			
			GridLayout gl = new GridLayout(4,6);
			frame.setLayout(gl);
			gl.setHgap(10);
			gl.setVgap(10);
			
			frame.setSize(600, 400);
			frame.setLocationRelativeTo(null);
			
			JTextField displayScreen = new JTextField("0");
			
			JButton btnZero = new JButton("0");
			JButton btnOne = new JButton("1");
			JButton btnTwo = new JButton("2");
			JButton btnThree = new JButton("3");
			JButton btnFour = new JButton("4");
			JButton btnFive = new JButton("5");
			JButton btnSix = new JButton("6");
			JButton btnSeven = new JButton("7");
			JButton btnEight = new JButton("8");
			JButton btnNine = new JButton("9");
			
			JButton btnOn = new JButton("On");
			JButton btnAdd = new JButton("+");
			JButton btnSub = new JButton("-");
			JButton btnMult = new JButton("*");
			JButton btnDiv = new JButton("/");
			JButton btnEqu = new JButton("=");
			JButton btnPeriod = new JButton(".");
			JButton btnLeft = new JButton("(");
			JButton btnRight = new JButton(")");
			JButton btnSquareRoot = new JButton("√");
			JButton btnSquared = new JButton("x^2");
			JButton btnErase = new JButton("Erase");
			JButton btnBack = new JButton("<---");
			JButton btnAc = new JButton("Ac");
		
			
			btnZero.setSize(200,400);
			btnOne.setSize(200,400);
			
			//frame.add(displayScreen);	
			frame.add(btnSeven);
			frame.add(btnEight);
			frame.add(btnNine);
			frame.add(btnDiv);
			frame.add(btnBack);
			frame.add(btnErase);
			
			frame.add(btnFour);
			frame.add(btnFive);
			frame.add(btnSix);
			frame.add(btnMult);
			frame.add(btnLeft);
			frame.add(btnRight);
			
			frame.add(btnOne);
			frame.add(btnTwo);
			frame.add(btnThree);
			frame.add(btnSub);
			frame.add(btnSquared);
			frame.add(btnSquareRoot);
			
			frame.add(btnPeriod);
			frame.add(btnZero);
			frame.add(btnAdd);
			
			frame.add(btnEqu);
			frame.add(btnOn);
			frame.add(btnAc);
			
	}

}
