package Exceptions;

import java.io.FileNotFoundException;

public class Exception1 {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub

		arrayoutofindex();
	}

	public static void arrayoutofindex() {
	String []itemlist = {"sofa", "set", "cot", "chair"};
	for(int i = 0; i<=itemlist.length; i++){
		System.out.println("item = "+itemlist[i]);
	}

		
	}
}
