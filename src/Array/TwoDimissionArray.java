package Array;

public class TwoDimissionArray {

	public static void main(String[] args) {
		   
		int a[][]=new int[7][3];
		int row=a.length;
		 int column=a[0].length;
		 System.out.println("row:" +row);
		 System.out.println("column:" +column);
		
		 
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[0].length-1;j++) {
				System.out.print(a[i][j]+ " ");
				
			}
			System.out.println();
		
		}
		
	}

}
