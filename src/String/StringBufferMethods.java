package String;

public class StringBufferMethods {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		String str1 = new String("Hello");
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(str.isEmpty());
		//length of string
		System.out.println(sb.length());
		System.out.println(sb.append(" world"));
		System.out.println(sb.charAt(3));
		System.out.println(sb.indexOf("o"));
		System.out.println(sb.indexOf("llo")); //it will use first char of string
		System.out.println(sb.lastIndexOf("lo"));
		
		StringBuffer sb1 = new StringBuffer("");
		System.out.println(sb1.isEmpty());
		
		//System.out.println(sb.reverse()); 
		
		System.out.println(sb.insert(11, "tanmay"));
		
		System.out.println(sb.deleteCharAt(3));
		
		System.out.println(sb.delete(1, 4));
		
		System.out.println(sb.replace(0, 2, "12345"));
		
		
		
	
	}

}
