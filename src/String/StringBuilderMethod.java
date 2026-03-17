package String;

public class StringBuilderMethod {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello Tanmay");
		
		System.out.println(sb.append(" welcome to java"));
		
		System.out.println(sb.insert(0, "!"));
		
		System.out.println(sb.delete(1, 6));
		
		System.out.println(sb.length());

	}

}
