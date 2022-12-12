package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("1이상의 숫자 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.print(i);
		}if(1 > input) {
			System.out.print("안돼");
		}
		
	}
	
	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int a = input; a >= 1; a--) {
			System.out.print(a);
		}if(input < 0 ) {
			System.out.print("1이상의 숫자를 입력해주세요");
		}
	}
	
		
	public void practice3() {
			Scanner sc = new Scanner(System.in);
		
			System.out.print("정수 하나 입력 : ");
			int num = sc.nextInt();
			
			int sum = 0;
			
			for(int i=1 ; i <= num ; i++) {
				sum += i;
				
				if(i < num) {
					System.out.print(i + " + ");
				} else {
					System.out.println(i + " = " + sum);
				}
			}
		}

	public void practice4() {
		
		System.out.print("첫번째 숫자 :");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 :");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}else {
			if(num1 < num2) {
				int a = num1;
				num1 = num2;
				num2 = a;
			}
			for(int i = num1; i <= num2; i++) {
				System.out.print(i);
			}
			
		}
	}
	
	public void practice6() {
		System.out.print("숫자 : ");
		int num1 = sc.nextInt();
		
		if(num1 > 1 && num1 < 9) { //둘다 맞아야 트루
			for(int a = num1; a <= 9; a++) {
				System.out.println("=====" + a + "단" + "=====");
				for(int b = 1; b <= 9; b++) {
					System.out.printf("%d X %d = %d\n", a,b,a*b);
				}
				System.out.println();
			}
		}else {
			System.out.println("오류");
		}
	}
	
	public void practice7() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int a = 1; a <= input; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice8() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		for(int a = 1; a <= input; a++) {
			for(int b = input; a <= b; b-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	
	public void practice9() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
					// 1회전) 1 <= 4
		for(int row = 1; row <= input; row++) { //쉽게말해서 세로열 코드
			
							
			for(int col = 1; col <= input; col++ ) { //이게 가로열 코드
				
				// 1회전) 1 <= 4-1
				// 2회전) 2 <= 4-1
				// 3회전) 3 <= 4-1
				// 3회전) 4 <= 4-1
				if(col <= input - row) { //빈칸코드
					System.out.print(" ");//true 일때 칸을 비움
				}else {
					System.out.print("*"); //false 일때만 별 찍히게 함
				}
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int a = 1; a <= input; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			
				}
				for(int c = 1; c <= input; c++) {
					for(int d = input; c <= d; d--) {
						System.out.print("*");
			}
					System.out.println();
					
		}
	}
	
	public void practice11() {

		// 삼각형 만들기...
		/*
		 * 		*
		 * 	   ***	
		 * 	  *****
		 *   ******* <= input * 2 -1
		 *   //마지막 줄은 무슨수를 넣던 넣은수*2-1
		 * */
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= input *2 - 1; col++ ) {
				//마지막 줄의 별 갯수 : input에 2를 곱한값의 -1
					//4 - 1 >= 1 || 4 + 1 <= 1
					//4 - 1 >= 2 || 4 + 1 <= 2
					//4 - 1 >= 3 || 4 + 1 <= 3
					//4 - 1 >= 4 || 4 + 1 <= 4
				if(input - row >= col || input + row <= col) {// 빈칸 코드
					System.out.println(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	public void practice12() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= input; col++) {
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}
	
	public void practice13() {
		// 조건1) 2의 배수 또는 3의 배수인 경우 출력
		// 2나 3으로 나누었을때 나머지 값이 0인 경우
		// 조건2) 2와 3의 공배수는 ?
		// 2로도 나누어 떨어지고 3으로도 나누어 떨어진다
		
		System.out.print("자연수 입력 : ");
		int input = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {// || 또눈
				System.out.print(i + " ");
				
				if(i % 2 == 0 && i % 3 == 0) { //그리고
					count++;
				}
			}
		}
		System.out.println("\ncount:" + count);
	}
	
	
	
}
