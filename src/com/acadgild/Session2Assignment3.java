package com.acadgild;

import java.util.Scanner;
/**
 * 
 * @author 	Deepak
 * @date	26/05/2017
 * @desc	To print X pattern.
 */
public class Session2Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=1;
		
		System.out.println("Enter no of rows in the grid - ");
		Scanner s = new Scanner(System.in);
		int rows=s.nextInt();// no of rows in the pyramid
		
		// set the intial row and column position where printing will be done
		int print1=1,print2=rows;
		
		// loop through the number of rows
		for(i=1;i<=rows;i++){
			// loop through the number of columns
			for(j=1;j<=rows;j++){
				if(j==print1 || j==print2){
				System.out.print("*");
				}
				else{
					System.out.print("_");
				}
				
			}
			// determine the next print position of *
			print1=print1+1;
			print2=print2-1;
			System.out.println("");
		}
		s.close();
	}

}
