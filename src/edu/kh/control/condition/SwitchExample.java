package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	
	/*
	 *switch문
	 * -식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 문
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 실행된다
	 * 
	 * [작성법]
	 * 
	 * switch(식) {
	 * 
	 *  case 결과값1 : 수행코드1; break;
	 *  case 결과값2 : 수행코드2; break;
	 *  case 결과값3 : 수행코드3; break;
	 *  ....
	 * default : case를 모두 만족하지 않는 경우 수행하는 코드(else문)
	 * 
	 * }
	 * */
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수만 입력 : ");
		int input = sc.nextInt();
		
		String result;
		
		/*if(input == 1) {
			result = "빨강";
		}else if(input == 2) {
			result = "주황";
		}else if(input == 3) {
			result = "노랑";
		}else if(input == 4) {
			result = "초록";
		}else {
			result = "흰색";
		}
		
		System.out.println(result);*/
		
		switch(input) {
		
		case 1 : result ="빨강"; break;
		case 2 : result ="주황"; break;
		case 3 : result ="노랑"; break;
		case 4 : result ="초록"; break;
		default : result ="흰색";
		}
		
		System.out.println(result);
		
		//개념정리해라 시험나옴
		
		
		
	}
	
	
	
	
	
}
