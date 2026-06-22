package com.matrics;
import java.util.Scanner;
public class Matrixmulti {
	public static void main(String [] args) {
		// dynamic values we get by using scanner class
Scanner s =new Scanner(System.in);
	 int r1=s.nextInt();
	 System.out.println(r1+"how many row");//3
	 int c1= s.nextInt();
	 System.out.println(c1+" how many coloum ");//2
	 int r2=s.nextInt() ;
	 System.out.println(r2);//2
	 int c2=s.nextInt();
	 System.out.println(c2);//4
	 //matrix  results 3*2 and 2*4 = 3*4 matrics
	int [][] A= new int [r1][c1];
	int [][] B=new int [r2][c2];
	int [][] C= new int [r1][c2];
	//input of A matrics
	for(int i=0;i< r1;i++) {
		for(int j=0;j<c1;j++) {
			A[i][j]=s.nextInt();
			System.out.println( "a matrics entered "+ A[i][j]);
		}
	}
	//reading B matric
	for(int i=0; i<r2;i++) {
		for(int j=0;j<c2;j++) {
			B[i][j]=s.nextInt();
			System.out.println("b matrices reading  "+B[i][j]);
		}
	}
	 
	if(c1==r2) {
		for (int i = 0; i < r1; i++) {
	        for (int j = 0; j < c2; j++) {
	            for (int k = 0; k < c1; k++) {
	            	//if k loop executed 0,1 then increment j then i values incrementes
	                C[i][j] += A[i][k] * B[k][j];
	                System.out.println("printing the results " +C[i][j]);
	            }
	        }
			
		}
		
	}
	else {
		System.out.println("matrics multiple is not possible");
	}
}
}


