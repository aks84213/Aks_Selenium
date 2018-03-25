package com.java.arrays.day6;

public class twoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		twodimesionalarrayPrac();
	}
	
	public static void twodimesionalarrayPrac(){
		int [][] array1 = new int [3][4]; // rows and columns
		array1 [0][0] = 3;
		array1 [0][1] = 4;
		array1 [0][2] = 5;
		array1 [0][3] = 6;
		array1 [1][0] = 6;
		array1 [1][1] = 9;
		array1 [1][2] = 17;
		array1 [1][3] = 71;
		array1 [2][0] = 12;
		array1 [2][1] = 721;
		array1 [2][2] = 71;
		array1 [2][3] = 23;
		
		
			
		for (int row=0; row<3; row++){
			for (int col=0; col<4; col++){
				System.out.println(array1[row][col]);
			}
		}
	}

}
