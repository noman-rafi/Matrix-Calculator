package com.noman.matrix;

public class UnitTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unit Test 1:");
		System.out.println("Multiplication of 2 Matrices");
		System.out.println("");
		MatrixCalculator mC = new MatrixCalculator();
		mC.readFile();
		mC.multiply(mC.x, mC.y);
	}

}
