package basic.dev;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
					Scanner sc = new Scanner(System.in);
					//1
					System.out.println("Nhập số nguyên 1 :");
					int a = sc.nextInt();
					
					System.out.println("Nhập số nguyên 2 :");
					int b = sc.nextInt();
					
					System.out.println("Nhập số nguyên 3 :");
					int c = sc.nextInt();
					
					if(a + b > c && a + c > b && b + c > a) {
						System.out.println("Day la 3 canh cua tam giac");
					}else {
						System.out.println("Day khong phai la 3 canh cua tam giac");
					}
					
					//2 
					int z[] = new int[10];
					//2.a
					input(z);
					print(z);
					//2.b
					sapXep(z);
					print(z);
					//2.c
					demCham(z);
					
	}

	private static void demCham(int[] z) {
		//TODO Auto-generated method stub
		int demCham = 0;
		for (int i = 0; i < z.length; i++) {
			if (z[i] % 2 == 0) {
				demCham++;
			}
	
	}
		System.out.format("%d số chẵn , %d số lẻ ", demCham, z.length - demCham);
	}
	private static void sapXep(int[] z) {
		// TODO Auto-generated method stub
		System.out.println("Mảng sau khi sắp xếp tăng dần : ");
		for (int i = 0; i < z.length - 1; i++) {
			for (int j = i + 1; j < z.length; j++) {
				if (z[i] > z[j]) {
					int temp = z[i];
					z[i] = z[j];
					z[j] = temp;
				}
				
			}
		}
	}

	private static void print(int[] z) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < z.length; i++) {
			System.out.format("%d ", z[i]).print("\t");
		}
		System.out.println();
	}

	private static void input(int[] z) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 100;
		for (int i = 0; i < z.length; i++) {
			z[i] = randomInteger(min, max);
		}
	}

	private static int randomInteger(int min, int max) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return rand.nextInt(max + 1 - min) + min;
	}
}
	
	
	
