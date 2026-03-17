package InterViewQuestion;

public class nestedClass extends ComplexErrorProducer{

	public nestedClass(int value) {
		
	  count = value;
	}
	
	public static void main(String[] args) {
		
		ComplexErrorProducer cep = new ComplexErrorProducer();

	         System.out.println("Name: " + cep.getName() + ", Value: " + count); // Error 2
	         
	    
		
	}
	 


}
