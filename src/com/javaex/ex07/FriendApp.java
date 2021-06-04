package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        
        
        
        //Wrong
//        String[] name = new String[3];
//        String[] hp = new String[3];
//        String[] school = new String[3];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
        for (int i = 0; i < friendArray.length; i++) {
        	friendArray = new Friend();
        	
        	System.out.println("이름: ");
        	[i] = sc.next();       	
        	
        	System.out.println("핸드폰: ");
        	hp[i] = sc.next();
        	
        	
        	System.out.println("학교: ");
        	school[i] = sc.next();
        	
        	System.out.println("--------------------------------------");
        	
        	// Friend 인스턴스 생성하여 데이터 넣기
        	
        	// 인스턴스 주소를 배열에 대입
        	
        	
        	
        }
        
        


        
        // 친구정보 출력
//        for (int i = 0; i < friendArray.length; i++) {
//            friendArray[i].showInfo();
//        }

        sc.close();
    }

}
