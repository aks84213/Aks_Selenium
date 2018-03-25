package com.java.arrays.day6;

public class stringsPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringMethod();
		//IntExample();
		//hashCodetest();
		//Split();
	}
	
	public static void stringMethod(){
		
		String email = "KISSED_DEATH@gmail.com";
		Object password = "12345";
		int age = 30;
		String emptyValue = ""; // created to test the string methods.
		Character newUpdatedID = 'j';
		
		System.out.println(email.charAt(2)); // fetches the specified charactrs from string 
		System.out.println(email.length()); // fetches the length of the string
		System.out.println(email.substring(0, 3)); //prints the characters present inbetween the start and end index
		System.out.println(email.substring(3)); // prints he characters after the specified count.
		System.out.println(email.indexOf("@")); // fetches the specified index from the string based on the character provided.
		System.out.println(email.concat(" in my email id")); // appends the string provided string vale to the emailid.
		System.out.println("myEmailID is " +email+" and the age is "+age+"");// concatinates
		System.out.println(email.contains(".com23")); // checks the email id and gives the output in boolean.
		System.out.println(email.endsWith(".com"));//verifies the specified string ends with the provided variable
		System.out.println(email.startsWith("aks")); // verifies if the specified string starts with the available string.
		System.out.println(email.toCharArray());
		System.out.println(email.equals("Aks@gmail.com")); // compares 2 object
		System.out.println(email.equalsIgnoreCase("aKS@gmail.com"));// compares 2 objects by ignoring the case
		System.out.println(email.hashCode());// generates some code for the string for every change in the string.
		System.out.println(emptyValue.isEmpty());
		System.out.println(email.lastIndexOf("a")); // gives the index of last occuring character specified
		System.out.println(email.replace("gmail.com", "yahoomail.com"));
		System.out.println(email.replaceAll("a", "@"));//replaces all the characters specified
		System.out.println(email.replaceFirst("@", "a"));
//		email = email.replace("agmail", "@yahoomail.com");
		System.out.println(email.toLowerCase());// converts the string into lower case
		System.out.println(email.toUpperCase()); // converts the string to upper case
		
		String newValue = newUpdatedID.toString();
		System.out.println(newValue.replace("j", "z"));
		
		System.out.println(password.toString());// converts any object to string -
		System.out.println(email);
		System.out.println(email.trim());//removes the spaces in the start and the end of the string
		System.out.println(email.getClass()); // provides the class name of the mmethod
		
		String [] splitValue = email.split("@");
		System.out.println(splitValue [0]);// prints 1st index
		System.out.println(splitValue [1]); // prints 2nd index
		
		System.out.println(email.split("@")); // email wil be split and username wil be in one column and domain in another -- Int question
		System.out.println(String.valueOf(age)); // convverts integer to string
		
		
	
	}
public static void IntExample(){
	
	//check if there if there is any duplicat characters in the string Name
	String name = "Dragon";
	int counter =0;
	char [] inputName = name.toCharArray();
	for (int i = 0; i<name.length(); i++){
		for (int j=i+1; j<name.length(); j++){
		if (inputName[i] == inputName[j]){
			System.out.println(" The repeated charater is : "+inputName[i]);
		}
		else
		{
			counter++;
		}
				
		}
		 
		{
	}
		
		}	
	if (counter!=0){
		System.out.println("There are no repeated characters in: " +name);
}

		
}
public static void hashCodetest(){
	String details = "My name is Mohan.S, "
			+" i hacve 10.5 yrs of Exp"
			+ " and i work in Mysore"
			+ " and i Love Mysore a lot.";
	int hashcodename = details.hashCode();
	String fileName = "Filename" + hashcodename + "";
	System.out.println(fileName);
}

public static void Split(){
	String []  inputEmailId = {"aks.saibakth@gmail.com", "kissed_death@yahoo.com", "junkstar@yahoo.com", "loneheart@yahoo.com"};
	for (int i = 0; i<inputEmailId.length; i++)
	{
		String [] splitEmailIds = inputEmailId[i].split("@");
		System.out.println(splitEmailIds[0]);
		System.out.println(splitEmailIds[1]);
	}
	System.out.println("***************");
	for (int j = 0; j<inputEmailId.length; j++)
	{
		int indexOfCharc = inputEmailId[j].indexOf("@");System.out.println(indexOfCharc);
		System.out.println(inputEmailId[j].substring(indexOfCharc, inputEmailId[j].length()));
		//System.out.println(inputEmailId[j].substring(1, indexOfCharc));
	}
}
}

