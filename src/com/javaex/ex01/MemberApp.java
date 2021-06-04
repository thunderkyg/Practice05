package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member member1 = new Member("정우성", "jws", 50000);
		Member member2 = new Member("유재석", "yjs", 40000);
		Member member3 = new Member("이효리", "lhr", 30000);
		
		Member[] member = new Member[3];
		member[0] = member1;
		member[1] = member2;
		member[2] = member3;
		
		for (int i = 0; i<member.length; i++) {
			member[i].showInfo();
		}
	}

}
