package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.ConnectException;
import java.util.function.ToDoubleBiFunction;

public class exceptionHandlingPractise {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	//	noFileAvailable();
		//nullPointerException();
		//arrayOutofBoundException();
		//throwNewException();
		//tryCatchPractise();
		//tryCatchBlockExample();
		// tryCatchfinally();
	}

	public static void noFileAvailable() throws FileNotFoundException{
	
		File io = new File ("G:\\Selenium\\workspace");
		FileReader fileReader = new FileReader(io);
		
	}

	public static void nullPointerException(){
		String userName = "Mohan";
		String password = "12345";
		String rememberMeCheckbox = null;
//		if(userName.contains("Mohan"))
//		{
//			rememberMeCheckbox= "true";
		
		
		if (rememberMeCheckbox.equals(true)){
		
			System.out.println("User selected Remeber me option "+ rememberMeCheckbox);
		}else{
		System.out.println("User has not Selected Remeber me option " + rememberMeCheckbox);
		}
	}
	
	public static void arrayOutofBoundException(){
		String [] itemlist = {"sofa", "cot","chair","bed","pot"};
		for (int i=0; i<itemlist.length; i++)// if we use <= than we can see the exception
		{
			System.out.println("The items listed are : "+itemlist[i]);
		}
	}
	
	public static void throwNewException() throws Exception{
		throw new Exception ("This is custome defined exception");
	}
	
	public static void tryCatchPractise() throws Exception {
		try 
		{
			File io = new File ("G:\\Selenium\\workspace");
			FileReader fileReader = new FileReader(io);
		} catch (Exception e){
			//ToDO : handle exception
			throw new Exception ("This is 2nd custom defined Exception Msg");
		//	System.out.println("Fail - The file is not found in the location");
		}
	}
	/*
	public static void tryCatchBlockExample(){
		int Emailcount = 5;
		String Username = "Mohan@gmail.com";
		String Password = "12444";
		String rememberMebox = "true";
		
		System.out.println("UserName Entered: "+Username);
		System.out.println("Password Entered: "+Password);
		System.out.println("Login Sucessful");
	
		try{
			if (rememberMebox.equals("true")){
				System.out.println("User has selected the remember me check box");
			}else{
				System.out.println("Pass - User has not selected the Remember me check box");
				}
		}catch (Exception e) {
			System.out.println("Remember Me check box is not present");
		}
		if (Emailcount>15){
			System.out.println("Pass - E mails are displayingsucessfully");
		}else{
			System.out.println("Fail - E mails are not displayed");
		}
	}
		
		

	
	public static void tryCatchfinally(){
		System.out.println("*************Firefox Browser launched************");
		int counter = 0;
		String myCourse = "Python";
		String [] courses = {"java","dotNet","Selenium","devOps","jenkins", "AWS"};
		try
		{
			for (int i = 0; i<courses.length; i++){
				System.out.println("course Evaluation is"+courses);
				if (myCourse.equals(courses[i])){
					System.out.println("Pass - My course is Completed " +courses[i] );}
				else{
					System.out.println("Fail - My course is not listed, hence not completed " +courses[i]);
				}
				if (counter == courses.length){
					throw new ConnectException(" Course not Found");
				}
			}			
			catch (FileNotFoundException e){
					System.out.println("Fail - Exception 1 "+myCourse+ "not listed in the Etech");
				}
				catch (ConnectException e1){
					System.out.println("Fail - Exception 2 "+myCourse+ "not listed in the Etech");
					}
				catch (Exception e2){
					System.out.println("Fail - Exception 3 "+myCourse+ "not listed in the Etech");
				}
			finally {
				System.out.println("********FireFox Browser is closed*************");
			}
					
				}
			
	

*/
}