package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {

	public void example1() {
		//if 문
		//- 조건식이 true 일때만 내부 코드 수행
		/*
		 * [작성법]
		 * if(조건식) {
		 * 조건식이 true 일 때 수행될 코드
		 * }
		 * 
		 * if - else 문
		 * -조건식 결과가 true면 if문,
		 * false면 else문 수행
		 * 
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true일 때 수행될 코드
		 * } else{
		 * 		조건식이 false일 때 수행될 코드
		 * }
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int input = sc.nextInt();
		
		// 입력된 정수가 양수인지 검사
		if(input > 0) {
		System.out.println("양수입니다");
			} else
			{ System.out.println("양수가 아니다");
				
			}	
		
		/*if(input <=0 ) {
			System.out.println("양수가 아니다");
		}*/
	}
	
	public void ex2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int input = sc.nextInt();
		
		if(input % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수");
		}
		
	}
	
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int month = sc.nextInt();
		
		//사용자에게 온도를 받음
		System.out.print("온도입력: ");
		int temp = sc.nextInt();
		
		String season;
		
		// 봄 : 3 4 5
		//여름 : 6.7.8
		if(month == 3 || month == 4 || month == 5) {
			season = "봄";
		}else if( month >=6 && month <= 8 ) {
			season = "여름";
			
			if(temp >= 35) {
				
				// season = season + " ";
				// season = "여행" + "폭염경보"
				season += ":폭염 경보";
			}else if(temp >= 33) {
				season += "폭염주의보";
			}
			
		}else if( month >= 9 && month <=11 ) {
			season = "가을";
		}else if(month == 12 ||  month == 1 || month ==2){
			season = "겨울";
		}else {
			season = "해당하는 계절 없음";
		}
		System.out.println(season);
	  	}
	
	
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력: ");
		int age = sc.nextInt();

		
		if(age <= 13) {
			System.out.println("어린이입니다");
		}else if(age >13 && age <=19) {
			System.out.println("청소년입니다");
		}else if(age > 19) {
			System.out.println("성인입니다");
		}
		}
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		String result; //결과를 담을 string 변수 선언
		
		if(score >= 90) {
			result = "A";
		}else if(score >= 80 ) {
			result = "B";
		}else if(score >= 70 ) {
			result = "C";
		}else if(score >= 60 ) {
			result = "D";
		}else if(score < 60 ) {
			result = "F";
		}else {
			result = "잘못입력";
		}
	}
	// 놀이기구 탑승 제한 검사 프로그램
	//조건 나이 12세 이상
	// 카 140.0 이상
	
	//나이를 0~100세 사이로 입력하지 않은경우 
	//키 250
	//입력되자마자 잘못된 경우 프로그램 종료
	//나이 o x  x o  x  x  o  o
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 0 || age > 100) {
			result = "나이를 잘못 입력 하셨습니다";
		}else { 
		System.out.print("키: ");
		double cm = sc.nextDouble();
		
		if(cm < 0 || cm > 250.0) {
		result = "키를 잘못 입력 하셨습니다";
		}else {
		
		if (age >= 12 && cm <= 140 ) {
			result = "나이는 맞는데 키가 안됨";
		}else if(age <= 12 && cm >= 140) {
			result = "키는 맞는데 나이가 안됨";
		}else if(age <= 12 && cm <= 140 ) {
			result = "둘다 안됨";
		}else {
			result = "탑승가능";
		}
		System.out.println(result);
		}
		
		}	
		
	}
	
	}
	


		
	
	
		
	// if는 조건문 처음시작
		//else만 쓸때는 if문 긍정일떄만 나오게함 안되면 안나옴
		// else if는 둘다 되는데 경우만 수만 다름

			
	
	

