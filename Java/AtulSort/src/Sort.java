import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		// TODOint Auto-generated method stub
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the size of array");
	 int n;
	 n=sc.nextInt();
		int arr[] = new int[n];
			for(int i=0;i<=4;i++) {
				System.out.println("the array" +i);
				arr[i]=sc.nextInt();
				System.out.println("the array" +i+ "are" +arr[i]+"\n");
			}
	
	for(int i=0;i<n;i++) {
		System.out.println("the value are"+arr[i]);
		
	}
	
	}

}
