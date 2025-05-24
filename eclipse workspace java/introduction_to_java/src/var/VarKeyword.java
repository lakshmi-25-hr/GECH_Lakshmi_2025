package var;

import java.util.Scanner;

public class VarKeyword {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("size");
		 int size1=sc.nextInt();
		 int size2=sc.nextInt();
		System.out.println("enter the numbers");
		char [][] array=new char[size1][size2];
		  for(int i=0;i<size1;i++){
				  for(int j=0;j<size2;j++) {
			  array[i][j]=sc.next().charAt(0);
				  }
		  }
		  System.out.println("the array elements are");
		  for(int i=0;i<size1;i++){
			  for(int j=0;j<size2;j++) {
		System.out.print(  array[i][j]+" ");
			  }
			  System.out.println(" ");
	  }

	}}


//var we can use different datatypes 