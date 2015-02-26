package calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class CalculatorSetUp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField textField;
	private static boolean decimals = true;
	private static boolean operators = false;
	private static boolean startingPoint = true;
	private KeyTyped keys = new KeyTyped();
	private Solver test = new Solver();
	private static CalculatorSetUp frame;
	private static boolean zeros = false;
	static ArrayList <String> undoTracker = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				frame = new CalculatorSetUp();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
	

	/**				stringL.remove(i);

	 * Create the frame.
	 */
	public CalculatorSetUp() {
		setTitle("Ryan's Calc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 229, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setText("0");
		
		this.addKeyListener(keys);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(zeros){
					textField.setText(textField.getText() + "0");
					operators = true;
				}
				frame.requestFocusInWindow();
			}
		});
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(startingPoint){
					textField.setText("");
					startingPoint = false;
				}
				textField.setText(textField.getText() + "1"); 
				operators = true;
				zeros = true;
			}
		});
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(startingPoint){
					textField.setText("");
					startingPoint = false;
				}
				textField.setText(textField.getText() + "2");
				operators = true;
				zeros = true;
			}
		});
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(startingPoint){
					textField.setText("");
					startingPoint = false;
				}
				textField.setText(textField.getText() + "3");
				operators = true;
				zeros = true;
			}
		});
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(startingPoint){
					textField.setText("");
					startingPoint = false;
				}
				textField.setText(textField.getText() + "4");
				operators = true;
				zeros = true;
			}
		});
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(startingPoint){
					textField.setText("");
					startingPoint = false;
				}
				textField.setText(textField.getText() + "5");
				operators = true;
				zeros = true;
			}
		});
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(startingPoint){
					textField.setText("");
					startingPoint = false;
				}
				textField.setText(textField.getText() + "6");
				operators = true;
				zeros = true;
			}
		});
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(startingPoint){
					textField.setText("");
					startingPoint = false;
				}
				textField.setText(textField.getText() + "7");
				operators = true;
				zeros = true;
			}
		});
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(startingPoint){
					textField.setText("");
					startingPoint = false;
				}
				textField.setText(textField.getText() + "8");
				operators = true;
				zeros = true;
			}
		});
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(startingPoint){
					textField.setText("");
					startingPoint = false;
				}
				textField.setText(textField.getText() + "9");
				operators = true;
				zeros = true;
			}
		});
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(startingPoint){
					textField.setText("");
					startingPoint = false;
				}
				if(decimals){
					textField.setText(textField.getText() + ".");
				}
				decimals = false;
				zeros = true;
			}
		});
		
		JButton btnA = new JButton("*");
		btnA.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(operators){
					textField.setText(textField.getText() + "*");
					decimals = true;
					zeros = true;
				}
				operators = false;
				
			}
		});
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(operators){
					textField.setText(textField.getText() + "/");
					decimals = true;
					zeros = true;
				}
			operators = false;
			}
		});
			
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(operators){
					textField.setText(textField.getText() + "-");
					decimals = true;
					zeros = true;
				}
				operators = false;
			}
		});
		
		JButton button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(operators){
					textField.setText(textField.getText() + "+");
					decimals = true;
					zeros = true;
				}
				operators = false;
			}
		});
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textField.setText("0");
				decimals = true;
				operators = false;
				startingPoint = true;
				zeros = false;
				Solver.stringL.clear();
				undoTracker.clear();
			}
		});
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				test.split(textField);
				CalculatorSetUp.getTextField().setText("" + test.solve());
				Solver.stringL.clear();
			}
		});
		
		JButton btnUndo = new JButton("Back");
		btnUndo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(button_7)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_8)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_9)
									.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
									.addComponent(button_12))
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(button_4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_5)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnA, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(button_10)
												.addComponent(button_1))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(button_2)
												.addComponent(button_0)))
										.addComponent(btnClear, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnUndo, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button_3)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(button_14))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(buttonEqual)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(button_13, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))))
							.addGap(46)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_7)
						.addComponent(button_8)
						.addComponent(button_12)
						.addComponent(button_9))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(button_4)
							.addComponent(button_5)
							.addComponent(button_6))
						.addComponent(btnA))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_2)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_1)
								.addComponent(button_3)
								.addComponent(button_14))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(button_10)
									.addComponent(button_0)
									.addComponent(buttonEqual))
								.addComponent(button_13))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnClear)
						.addComponent(btnUndo))
					.addGap(463))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public static JTextField getTextField() { return textField; }
	public static boolean getdecimals() { return decimals; }
	public static boolean getoperators() { return operators; }
	public static boolean getstartingPoint() { return startingPoint; }
	public static boolean getzeros() { return zeros; }
	public static void setstartingPoint(boolean b) { startingPoint = b; }
	public static void setoperators(boolean b) { operators = b; }
	public static void setdecimals(boolean b) { decimals = b; }
	public static void setzeros(boolean b) { zeros = b; }
}
