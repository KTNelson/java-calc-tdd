package com.ktnelson.javacalctdd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcApplication {
	
	private boolean running = true;
	
	public CalcApplication(){
		
	}
	
	public void run(){
		
		while(running){
			System.out.println("Enter equation or type quit to exit");
			
			InputStreamReader istream = new InputStreamReader(System.in) ;
	
			BufferedReader bufRead = new BufferedReader(istream) ;
			
			try {
				String input = bufRead.readLine();
				if(input.compareToIgnoreCase("quit") == 0)
				{
					running = false;
				}
				else
				{
					StringParser parser = new StringParser(input);
					EquationVector eqVec = parser.createEquationVector();
					System.out.println("Result: " + eqVec.equate().getValue());
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
