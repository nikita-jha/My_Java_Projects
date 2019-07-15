package practiceProjects;

import java.io.*;



public class Sum {

	public static void main(String arg[]) {
		double iFirst = 0.0;
		double iSecond = 0.0; 

		try {
		    System.out.println("Select the arithmetic to perform: ");
		    System.out.println("+ for add");
		    System.out.println("- for subtract");
		    System.out.println("* for multiply");
		    System.out.println("/ for divide");
		    InputStreamReader streamReader = new InputStreamReader(System.in);
		    BufferedReader bufferedReader = new BufferedReader(streamReader);
		    String aInput = bufferedReader.readLine();

			
			System.out.print("Enter first number: ");
		    streamReader = new InputStreamReader(System.in);
		    bufferedReader = new BufferedReader(streamReader);
		    String sFirst = bufferedReader.readLine();

		    System.out.print("Enter second number: ");
		    streamReader = new InputStreamReader(System.in);
		    bufferedReader = new BufferedReader(streamReader);
		    String sSecond = bufferedReader.readLine();

			iFirst = Integer.parseInt(sFirst);
			iSecond = Integer.parseInt(sSecond);
			double value = 0.0;

			if (aInput.equals("+")) 
				value = iFirst + iSecond;
			else if
				(aInput.equals("-"))
				value = iFirst - iSecond;
			else if 
				(aInput.equals("*"))
				value = iFirst * iSecond;
			else if
				(aInput.equals("/"))
				value = iFirst/iSecond;
			else
				System.out.println("Invalid selection!");
				
			
			
			System.out.println("The value is : " + value); 
		
		} catch (IOException e) {
		    e.printStackTrace();
		}		

	}
	
}
