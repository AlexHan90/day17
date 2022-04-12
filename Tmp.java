package day17;

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
	
	
	class Name{
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		ArrayList<Name> arr = new ArrayList<Name>();
	}

	
	
	
	
	while(true) {
		System.out.println("1.저장");
		System.out.println("2.모든 이름 출력");
		System.out.println("3.이름 조회");
		num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("이름 입력");
			 name = input.nextInt();
			 Name n = new Name();
			 n.setName(name);
			 arr.add(n)
			 break;
			 
		case 2:
			
		for(int i=0; i<arr.size();i++) {
			Name a = arr.get(i);
			System.out.println(a.getName());
		}
		
		System.out.println("==============");
			 
			
			 
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






















public class Tmp {


	

}
