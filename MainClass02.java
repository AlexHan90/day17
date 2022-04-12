package day17;

class BBB<TTTT>{    //TTTT 자료형
	public void sumFunc(TTTT a, TTTT b ) {
		System.out.println(a+","+b);
		System.out.println(a.getClass());  		//어떠한 타입이 있는지를 알려준다.
	}
}


public class MainClass02 {

	public static void main(String[] args) {
	BBB<Integer> b = new BBB<>();
	b.sumFunc(100, 200);
	BBB<String> bb = new BBB();
	bb.sumFunc("안녕", "하세요");
	
	/*
	 * BBB<Double> bbb = new BBB(); bb.sumFunc(10.5, 9.5);
	 */
	
	}

}

/*
 * T : Type
 * E : Element
 */