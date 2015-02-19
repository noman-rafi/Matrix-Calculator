package com.noman.matrix;

public class UnitTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unit Test 3:");
		System.out.println("Multiplication of 2 Matrices and Addition of another matrice to the result");
		System.out.println("");		
		MatrixCalculator mC = new MatrixCalculator();
		mC.readFile();
		mC.add(mC.multiply(mC.x, mC.y), mC.z);
	}

}
