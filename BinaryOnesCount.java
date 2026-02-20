package Acess_modifieres;

import java.util.Scanner;

public class BinaryOnesCount {
	
	
		public static int no_bits(int n) {
			int count =0;
			while(n!=0) {
				count++;
				n=n&(n-1);
			}
			return count;
		}

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int n;
			System.out.println("enter the number : ");
			n=sc.nextInt();
			int result=no_bits(n);
			System.out.println(result);
			sc.close();


		}

	}