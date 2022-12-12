package edu.kh.control.brench;

import java.util.Scanner;

public class BrenchExample {

	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성(for)
		// 단, 5를 출력하면 반복문을 멈춤(if)
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				System.out.println(i);
				break; //반복문을 멈춤
			} 
		}
	}
	
	
	public void ex2() {
		int input = 0;
		int sum = 0;
				
		while(true) {
			System.out.println("정수입력 : ");
			input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			sum += input;
			
		}	
		System.out.println("합계 : " + sum);
	}
	
	public void ex3() {
		// 3의 배수 제외하고 1~10까지 출력
		// break : 반복문 멈춤
		// continue : 다음 반복으로 넘어감
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	
	public void ex4() {
		// 1~100까지 1씩 증가하며 출력하는 반복문
		//단, 5의 배수는 건너뛰고, 증가하는 값이 40이 되었을때 반복 멈춤
		// continue break 둘 다 사용하면 무조건 break부터 씀 
		// continue부터 쓰면 그 다음 반복문까지 안감
		
		for(int i = 1; i <= 100; i++) {
			if(i == 40) {
				break;
			}
			if(i % 5 ==0) {
				continue;
			}
			System.out.println(i);
		}
		 
	}
	
	
	
	
	
	
	
	
	
	
	
}
