package chapter2;

public class SpecialChar {
	public static void main(String[] args) {
		char single = '\''; // \' 따옴표 출력, single = '''; 와 같이 할 수 없다
		String dblQuote = "\"Hello\""; // \" 겹따옴표를 출력
		
		String root = "c:\\"; // \\ 역슬래쉬 출력
		System.out.println(single);
		System.out.println(dblQuote);
		System.out.println(root);
		
	}

}
