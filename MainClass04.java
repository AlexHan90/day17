package day17;

import java.util.ArrayList;

class St{
	private String stNum;
	private String name;
	
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println(stNum);
		System.out.println(name);
		
	}
	
}

public class MainClass04 {

	public static void main(String[] args) {
	
	ArrayList<St> st = new ArrayList<St>();               //  St 클래스 집어넣기
	St s = new St();
	s.setName("홍길동");
	s.setStNum("111");
	st.add(s);
	
	
	St ss = st.get(0);
	ss.print();
	
	St s01 = new St();
	s01.setName("홍길동111");
	s01.setStNum("111222");
	
	st.get(0).print();
	// s.print();
	
	st.add(s01);                 						//객체가 여러개있을때는  ArrayList 사용
	st.get(1).print();
	
	// St ss =st.get(0);
	// ss.print();
	 
		
	for(int i = 0; i<st.size() ; i++) {
		St a = st.get(i);
		a.print();
	}
		System.out.println("==================");
		
	for(St b : st) {                 //for each문
		b.print();
	}
	ArrayList<Integer> arr = new ArrayList<Integer>();
	arr.add(111);
	arr.add(222);
	for(int num : arr) {
		System.out.println(num); 
	}
	
		
		
		
		
		
		
	}

}
