package com.noman.matrix;

public class UnitTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unit Test 2:");
		System.out.println("Addition of 3 Matrices");
		System.out.println("");		
		MatrixCalculator mC = new MatrixCalculator();
		mC.readFile();
		mC.add(mC.add(mC.x, mC.y), mC.z);
	}

}
