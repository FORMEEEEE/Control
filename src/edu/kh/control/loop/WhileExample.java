package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	
	/* while문
	 * - 별도의 초기, 증감식이 존재하지 않고
	 *  반복 종료 조건을 자유롭게 설정하는 반복문.
	 *  
	 * ** 확실히 언제 반복이 끝날지는 모르지만
	 * 	  언젠가 반복 조건이 false가 되는 경우 반복을 종료함.
	 * 
	 * 
	 * [작성법]
	 * while(조건식){
	 * 		조건식이 true일 동안 반복 수행될 구문
	 * }
	 * */

	public void ex1() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		while(input != 9) { // input이 9가 아닐때 반복
			System.out.println("=========키오스크=========");
			System.out.println("=========메뉴선택=========");
			System.out.println("1. 떡볶이");
			System.out.println("2. 김밥");
			System.out.println("3. 쫄면");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
					
			switch(input) {
			case 1 :System.out.println("떡볶이 주문 완료"); break;
			case 2 :System.out.println("김밥 주문 완료"); break;
			case 3 :System.out.println("쫄면 주문 주문 완료"); break;
			case 9 :System.out.println("키오스크를 종료합니다"); break;
			default : System.out.println("잘 못 눌렀음");
			}		
		}
		
	}
	
	
	public void ex2() {
		//입력되는 모든 정수 합 구하기
		//단, 0이 입력되면 반복 종료 후 결과 출력
				// -> 0이 입력 되지 않으면 계속 반복
		
		
		Scanner sc = new Scanner(System.in);
		int input = 1;
		int sum = 0;
		
		while(input != 0) {
			System.out.print("정수 입력 :");
			input = sc.nextInt();
		
			sum += input; //입력받은 값 sum 누적
			
		}
		
		System.out.println("합계 "+ sum);
	}
	
	
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력해주세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		
	
		if(input > 0) {
			int i = 1;
			
			while(1 <= input) {
				sum += i;
				i++;
			}
			System.out.println("1부터" + input + "까지의 합은" + sum + "입니다");
		}else {
			System.out.println("1이상 숫자를 입력하세요");
		}
		
		
	}
	
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		//do~while문
		// 최소 한번은 수행함
		
		do{
			System.out.println("점수 : ");
			input =sc.nextInt();
			
			sum += input;
			
		}while(input != 0);
			
		System.out.println("합계 : " + sum);
	}
	
	
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			System.out.print("" +i +" ");
			
		}
		if(input >= 0);
		System.out.println("ㅇㅇ");
	}
	
	
	
	
	
	
	
	
	
}
