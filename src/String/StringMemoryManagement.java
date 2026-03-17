package String;

public class StringMemoryManagement {

	public static void main(String[] args) {
		
		String data= "Apple"; 
		String data2= "Apple";
		String data3= "apple";
		int a=10;
		System.out.println(data.hashCode());//63476538
		
		System.out.println(data2.hashCode());//63476538
	
		System.out.println(data3.hashCode());//93029210
		
		System.out.println(data==data2); // it will not compare the value
		//reference hashcode are same so it will give output as TRUE
		
		System.out.println(data==data3);//it will not compare the value
		//reference hashcode are different so it will give output as FALSE
		
        System.out.println(data.equals(data2));
        
        System.out.println(data.equalsIgnoreCase(data3));
        
        System.out.println(data.equals(data3));
        
        String datastring=a+" ";
        System.out.println(datastring);
        
        
        
        
        
	}

}
