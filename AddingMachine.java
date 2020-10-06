//git link: https://github.com/sophiaparmenter/Assignment1.git
//Sophia Parmenter
//Assignment1
//CSE 360

package cse360assignment02;

import java.util.ArrayList;
import java.util.List;



public class AddingMachine {
	public static void main(String[] args) {
		
	}
	  private int total;
	  private List<Integer> memory = new ArrayList<>();
	  private List<String> operations = new ArrayList<>();
	  
	  //constructor for AddingMachine
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    memory.add(total);
	  }
	  
	  //this method returns the current total
	  public int getTotal () {
	    return total;
	  }
	  
	  //this method adds the paramter value to the total
	  //and then stores the new total in memory
	  public void add (int value) {
		  total = total+value;
		  memory.add(total);
		  operations.add("+");
	  }

	  //this methods subtracts the parameter value to the total
	  //and then stores the new total in memory
	  public void subtract (int value) {
		  total = total-value;
		  memory.add(total);
		  operations.add("-");
	  }

	  //this method returns the history of operations in memory
	  public String toString () {
		  for (int n : memory) {
			  for (String o : operations) {
				  return n + "" + o;
			  }
		  }
	   return "";
	  }

	  //this method clears the memory and operations history
	  public void clear() {
		  memory.clear();
		  operations.clear();
		  }
	  }
	
