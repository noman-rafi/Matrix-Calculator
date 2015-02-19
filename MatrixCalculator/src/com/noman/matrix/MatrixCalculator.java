package com.noman.matrix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MatrixCalculator {

	int orders[][] = new int[3][2];
	int mat[][][] = new int[3][100][100];
	int x[][];
	int y[][];
	int z[][];

	public void readFile(){
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader("D:\\sample.txt"));
			String currLine;
			try {
				int matNo =0;
				while ((currLine = buffRead.readLine()) != null) {

					//System.out.println(currLine);
					int nRows = 0;
					for( int i=0; i<currLine.length(); i++ ) {
						if( currLine.charAt(i) == ';' ) {
							nRows++;
						} 
					}
					int nCols = 1;
					String temp = currLine.substring(0, currLine.indexOf(";"));
					for( int i=0; i<temp.length(); i++ ) {
						if( temp.charAt(i) == ',' ) {
							nCols++;
						} 
					}

					orders[matNo][0]= nRows;
					orders[matNo][1]= nCols;

					int arr[] = new int[1000];
					int t[][] = new int[nRows][nCols];
					int j=0;
					for( int i=0; i<currLine.length(); i++ ) {
						char c = currLine.charAt(i);
						if( Character.isDigit(c) == true ) {
							arr[j]= Character.getNumericValue(c);
							//System.out.println(arr[j]);
							j++;
						} 
					}
					int k=0;
					for(int i=0; i<nRows ; i++){
						for(j=0; j<nCols; j++){
							mat[matNo][i][j] = arr[k];
							//System.out.println(mat[matNo][i][j]);
							k++;
						}
					}

					matNo++;
				}

				x= new int[orders[0][0]][orders[0][1]];
				for(int i=0; i<orders[0][0]; i++){
					for(int j=0; j<orders[0][1]; j++){
						x[i][j]=mat[0][i][j];
						//System.out.println(x[i][j]);
					}

				}

				y= new int[orders[1][0]][orders[1][1]];
				for(int i=0; i<orders[1][0]; i++){
					for(int j=0; j<orders[1][1]; j++){
						y[i][j]=mat[1][i][j];
						//System.out.println(y[i][j]);
					}

				}

				z= new int[orders[2][0]][orders[2][1]];
				for(int i=0; i<orders[2][0]; i++){
					for(int j=0; j<orders[2][1]; j++){
						z[i][j]=mat[2][i][j];
						//System.out.println(z[i][j]);
					}

				}



			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public int[][] multiply(int[][] a, int[][] b) {
		int aRows = a.length;
		int bRows = b.length;
		int aCol = a[0].length; 
		int bCol = b[0].length;
		if (aCol != bRows){
			System.out.println("Error: The Rows and Columns of the two matrices doesn't match!");
			System.exit(1);
		}
		int[][] c = new int[aRows][bCol];
		for (int i = 0; i < aRows; i++) {
			for (int j = 0; j < bCol; j++) {
				for (int k = 0; k < aCol; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
					//System.out.println(c[i][j]);
				}
			}
		}
		System.out.println("Product of 2 Matrices");
		for(int i=0; i < aRows; i++){
			for(int j=0; j < aCol; j++){
				System.out.print(c[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		return c;
	}

	public int[][] add(int[][] a, int[][] b){
		if(a[0].length== 0 || b[0].length == 0){
			System.out.println("Error: Empty Matrix");
		}
		int aRows = a.length;
		int aCol = a[0].length; 
		int bCol = b[0].length;
		int bRows = b.length;

		if((aRows != bRows) || (aCol != bCol) ){
			System.out.println("Error: The Order of the two matrices doesn't match!");
			System.exit(1);
		}

		int[][] c = new int[aRows][aCol];
		for(int i=0; i < aRows; i++){
			for(int j=0; j < aCol; j++){
				c[i][j] =  a[i][j] + b[i][j];
				//System.out.println(c[i][j]);
			}	
		}
		System.out.println("Addition of 2 Matrices");
		for(int i=0; i < aRows; i++){
			for(int j=0; j < aCol; j++){
				System.out.print(c[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		return c;
	}

	public int[][] subtract(int[][] a, int[][] b){
		int aRows = a.length;
		int aCol = a[0].length; 
		int bCol = b[0].length;
		int bRows = b.length;

		if((aRows != bRows) || (aCol != bCol) ){
			System.out.println("Error: The Order of the two matrices doesn't match!");
			System.exit(1);
		}

		int[][] c = new int[aRows][aCol];
		for(int i=0; i < aRows; i++){
			for(int j=0; j < aCol; j++){
				c[i][j] =  a[i][j] - b[i][j];
				//System.out.println(c[i][j]);
			}
		}
		System.out.println("Differance of 2 Matrices");
		for(int i=0; i < aRows; i++){
			for(int j=0; j < aCol; j++){
				System.out.print(c[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		return c;
	}


}
