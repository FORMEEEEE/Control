package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	
	/* 반복문 종류

	 *	for문 : 반복 횟수가 정해진 반복일때 주로 사용 <~하는동안>
	 *	(반복 여부를 결정짓는 조건식이 처음에 제시되므로 한번도 실행이 안될수도있음)
	 *  while문 : 반복 횟수가 정해지지 않은 반복일 때 주로 사용
	 *  (반복 여부를 결정짓는 조건식이 처음에 제시되므로 한번도 실행이 안될수도 있음)
	 *  do~while문 : 반복 횟수가 정해지지 않은 반복일 때 주로 사용
	 *  (반복 여부를 결정짓는 조건식이 끝(아래)에 제시되므로 무조건 한번은 실행됨)
	 * 
	 * for문
	 * - 끝이 정해져 있는(횟수가 정해져있는) 반복문
	 * - 조건에 따라 한번도 수행되지 않을 수 있음
	 * 
	 * [작성법]
	 * 
	 * for(초기식; 조건식; 증감식;{
	 * 반복 수행할 코드
	 * }
	 * 
	 * - 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식,(다음 반복 진행해?)
	 * 			보통 초기식에 사용된 변수를 이용해 조건식을 작성함.
	 * 
	 * - 증감식 : 초기식에 사용된 변수를
	 *			for문이 끝날 때 마다 증가 or 감소 시켜
	 *			조건식의 결과를 변하게 하는 식
	 * */		
	
	public void ex1() {
		// 1~10까지 출력하기
		// 1부터 10까지 1씩 증가하며 출력
		// 반복문은 조건식이 true 일 때만 반복
		for(int i = 1; i <= 10; i++) {
		//1) 초기식; 2) 조건식; 4) 증감식
			System.out.println("i:" + i);
			// 3) 반복 수행될 코드
		}
	}
	
	
	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력
		for(int i = 3; i <= 7; i++) {
			System.out.println(i);
		}
	}
	
	
	public void ex3() {

		// 1부터 (입력받은 수까지) 1씩 증가하며 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int i = sc.nextInt();
		
		for(int a = 1; a <= i; a++) {
			System.out.println(i);
		}
			
	}
	
	
	public void ex4() {

		// 1.0부터 입력받은 실수까지 0.5씩 증가하며 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("실수만 입력: " );
		double input = sc.nextDouble();
		
		
		for(double a = 1.0; a <= input; a += 0.5 ) {
								// i = i + 0.5
			System.out.println(a);
		}
		
	}
	
	
	public void ex5() {
		
	
		for(int a = 'A';  a <= 'Z'; a++  ) {
			// 유니코드 알파벳 인트 사용가능
			System.out.println((char)a);
		}
	}
	
	
	public void ex8() {
		// 1부터 10까지 모든 정수의 합 구하기
		int result = 0; //반복되어 증가되는 i의 값을 담을 변수
						// 0으로 선언하는 이유 : 빈공간이라 더할 숫자가 없음 
		
		for(int i = 1; i <= 10; i++) {
			result += i;
			// result = result + i 
		}
		System.out.println("합계 : " + result);
		// i가 11이 됬을때 탈출해서 출력해야되니깐 괄호 밖으로 나와서 
	}
	
	
	public void ex9() {
		
	// 1부터 20까지 1씩 증가하면서 출력
		
	// 단 5의 배수에 ()를 붙여서 출력
		
	// ex) 1234(5)...	
		
		for(int i = 1; i <= 20; i++ ) {
		if(i % 5 == 0) {
			System.out.print("("+ i +") ");
		} else {
			 System.out.print(i +  " ");
		}
	}	
	}
	
	
	
	//******* 중첩반복문 *******
	public void ex10() {
		// 구구단 모두 출력하기
		for(int dan = 2; dan <= 9; dan++) { // 2~ 9 단 까지 차례대로 증가
			for(int su = 1; su <= 9; su++) { // 각 단에 고배질 수 1~9까지 차례대로 증가
				System.out.printf("%2d X %2d = %2d",dan, su , dan*su);
			}
			System.out.println();
		}
		
	}
	
	
	public void ex11() {
		//구구단 역순 출력
		//9~2단으로 역방향
		for(int dan = 9; dan >= 2; dan--) {
			for(int su = 1; su <= 9; su++) {
				System.out.printf("%2d X %2d = %2d",dan, su , dan*su);
			}
			System.out.println();
		} 
	}
	
	
	public void ex12() {
		for(int i = 1; i <= 5; i++) {
			for(int a = 1; a <= 5; a++ ) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
	
	public void ex13() {
		for(int i = 1; i <= 3; i++) { //5바퀴 반복하는 for문
			for(int a = 5; a >= 1; a--) { //12345 한줄 출력하는 for문
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
	
	public void ex14() {
		for(int i = 1; i <= 4; i++) {
			for(int a = 1; a <= i; a++) {
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.print("=================");
		System.out.println();
		
		for(int b = 4; b >= 1; b--) {
			for(int c = b; c >= 1; c--){
				System.out.print(c);
			}
			System.out.println();
		}		
	}
	
	
}

