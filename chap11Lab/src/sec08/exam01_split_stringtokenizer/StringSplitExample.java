package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		
		String text = "홍길동&유재석,송지효,전소민-김자바";
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}

	}

}
