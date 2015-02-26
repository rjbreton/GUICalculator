package calculator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyTyped implements KeyListener {
	
	Solver test = new Solver();
	
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub		
	}

	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar()){
		case '0':
			if(CalculatorSetUp.getzeros()){
				CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "0");
				CalculatorSetUp.setoperators(true);
			}
			break;
		case '1':
			if(CalculatorSetUp.getstartingPoint()){
				CalculatorSetUp.getTextField().setText("");
				CalculatorSetUp.setstartingPoint(false);
			}
			CalculatorSetUp.setzeros(true);
			CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "1");
			CalculatorSetUp.setoperators(true);
			break;
		case '2':
			if(CalculatorSetUp.getstartingPoint()){
				CalculatorSetUp.getTextField().setText("");
				CalculatorSetUp.setstartingPoint(false);
			}
			CalculatorSetUp.setzeros(true);
			CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "2");
			CalculatorSetUp.setoperators(true);
			break;
		case '3': 
			if(CalculatorSetUp.getstartingPoint()){
				CalculatorSetUp.getTextField().setText("");
				CalculatorSetUp.setstartingPoint(false);
			}
			CalculatorSetUp.setzeros(true);
			CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "3");
			CalculatorSetUp.setoperators(true);
			break;
		case '4': 
			if(CalculatorSetUp.getstartingPoint()){
				CalculatorSetUp.getTextField().setText("");
				CalculatorSetUp.setstartingPoint(false);
			}
			CalculatorSetUp.setzeros(true);
			CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "4");
			CalculatorSetUp.setoperators(true);
			break;
		case '5': 
			if(CalculatorSetUp.getstartingPoint()){
				CalculatorSetUp.getTextField().setText("");
				CalculatorSetUp.setstartingPoint(false);
			}
			CalculatorSetUp.setzeros(true);
			CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "5");
			CalculatorSetUp.setoperators(true);
			break;
		case '6': 
			if(CalculatorSetUp.getstartingPoint()){
				CalculatorSetUp.getTextField().setText("");
				CalculatorSetUp.setstartingPoint(false);
			}
			CalculatorSetUp.setzeros(true);
			CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "6");
			CalculatorSetUp.setoperators(true);
			break;
		case '7': 
			if(CalculatorSetUp.getstartingPoint()){
				CalculatorSetUp.getTextField().setText("");
				CalculatorSetUp.setstartingPoint(false);
			}
			CalculatorSetUp.setzeros(true);
			CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "7");
			CalculatorSetUp.setoperators(true);
			break;
		case '8': 
			if(CalculatorSetUp.getstartingPoint()){
				CalculatorSetUp.getTextField().setText("");
				CalculatorSetUp.setstartingPoint(false);
			}
			CalculatorSetUp.setzeros(true);
			CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "8");
			CalculatorSetUp.setoperators(true);
			break;
		case '9': 
			if(CalculatorSetUp.getstartingPoint()){
				CalculatorSetUp.getTextField().setText("");
				CalculatorSetUp.setstartingPoint(false);
			}
			CalculatorSetUp.setzeros(true);
			CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "9");
			CalculatorSetUp.setoperators(true);
			break;
		case '/':
			if(CalculatorSetUp.getoperators()){
				CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "/");
				CalculatorSetUp.setoperators(false);
				CalculatorSetUp.setdecimals(true);
				CalculatorSetUp.setzeros(false);
			}
			break;
		case '*': 
			if(CalculatorSetUp.getoperators()){
				CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "*");
				CalculatorSetUp.setoperators(false);
				CalculatorSetUp.setdecimals(true);
				CalculatorSetUp.setzeros(false);
			}
			break;
		case '-': 
			if(CalculatorSetUp.getoperators()){
				CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "-");
				CalculatorSetUp.setoperators(false);
				CalculatorSetUp.setdecimals(true);
				CalculatorSetUp.setzeros(false);
			}
			break;
		case '+': 
			if(CalculatorSetUp.getoperators()){
				CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + "+");
				CalculatorSetUp.setoperators(false);
				CalculatorSetUp.setdecimals(true);
				CalculatorSetUp.setzeros(false);
			}
			break;
		case '.':
			if(CalculatorSetUp.getstartingPoint()){
				CalculatorSetUp.getTextField().setText("");
				CalculatorSetUp.setstartingPoint(false);
			}
			if(CalculatorSetUp.getdecimals()){
				CalculatorSetUp.getTextField().setText(CalculatorSetUp.getTextField() + ".");
			}
			CalculatorSetUp.setzeros(true);
			CalculatorSetUp.setdecimals(false);
			break;
		case '=':
			test.split(CalculatorSetUp.getTextField());
			CalculatorSetUp.getTextField().setText("" + test.solve());
			Solver.stringL.clear();
			
		}
	
		
	}
	
}
