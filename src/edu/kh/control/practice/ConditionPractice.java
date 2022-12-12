package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num1 = sc.nextInt();
		String result;
		
		if(num1 % 2 == 0) {
			result = "짝수입니다";
		}
		
	}
	
}
