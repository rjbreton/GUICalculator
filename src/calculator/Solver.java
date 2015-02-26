package calculator;

import java.util.ArrayList;

import javax.swing.JTextField;

public class Solver {
	String equa;
	String temp = "";
	int count = 0;
	static ArrayList <String> stringL = new ArrayList<String>();
	String undo = "";
	
	public double solve(){
		int i = 0;
		int j = 0;
		double solution;
		while(i < stringL.size()){
			if(stringL.get(i).equals("*")){
				double temp = Double.parseDouble(stringL.get(i-1)) * Double.parseDouble(stringL.get(i+1));
				stringL.set((i-1), ("" + temp));
				stringL.remove(i);
				i--;
			}
			
			if(stringL.get(i).equals("/")){
				double temp = Double.parseDouble(stringL.get(i-1)) / Double.parseDouble(stringL.get(i+1));
				stringL.set((i-1), ("" + temp));
				stringL.remove(i);
				i--;
			}
			i++;
		}
		
		while(j < stringL.size()){
			if(stringL.get(j).equals("+")){
				double temp = Double.parseDouble(stringL.get(j-1)) + Double.parseDouble(stringL.get(j+1));
				stringL.set((j-1), ("" + temp));
				stringL.remove(j);
				j--;
			}
			if(stringL.get(j).equals("-")){
				double temp = Double.parseDouble(stringL.get(j-1)) - Double.parseDouble(stringL.get(j+1));
				stringL.set((j-1), ("" + temp));
				stringL.remove(j);
				j--;
			}
			j++;
		}
		
		solution = Double.parseDouble(stringL.get(0));
		return solution;
	}
	
	public void split(JTextField a){
		equa = a.getText();
		int i = 0;
		while(i < equa.length()){
			while(i < equa.length() && equa.charAt(i) != '+' && equa.charAt(i) != '-' && equa.charAt(i) != '/' && equa.charAt(i) != '*'){
				temp += equa.charAt(i);
				i++;
			}
			stringL.add(temp);
			if(i < equa.length()){
				stringL.add("" + equa.charAt(i));
			}
			i++;
			temp = "";
		}
		System.out.println(stringL.get(0) + stringL.get(1)+ stringL.get(2));		
	}
}
