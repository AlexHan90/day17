package day17;

import java.util.ArrayList;



public class MainClass03 {

	public static void main(String[] args) {
		/*
		 * ArrayList arr = new ArrayList(); // ctrl + 마우스 갖다대면 클래스 명령문 모아놓은곳 이동
		 * arr.add("aaa"); arr.add(1111); System.out.println(arr.get(0));
		 * System.out.println(arr.get(1)); //int a = arr.get(1) * 10; //문제 발생이 생겨서 제네릭을
		 * 사용해야 한다 // String s = arr.get(0);
		 */
		
		ArrayList<Integer> arr02 = new ArrayList<Integer>();
		arr02.add(1111);
		// arr02.add("aaa");
		
		int a02 = arr02.get(0);
		System.out.println(a02);
		
		ArrayList<String> arr03 = new ArrayList<String>();
		arr03.add("test");
		// arr03.add(1234);
		String ss = arr03.get(0);
		System.out.println(ss);
		
	}

}
