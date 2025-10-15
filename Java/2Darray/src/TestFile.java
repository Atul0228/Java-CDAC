import java.util.Scanner;
public class TestFile {

	public static void main(String[] args) {
		int[][] a=new int[3][3];
	Scanner sc=new Scanner(System.in);
	
	int[][] arr=new int[a.length][a[0].length];
	
	for(int i=0;i<a.length;i++)
	{for(int j=0;j<a[0].length;j++)
	{
		System.out.println("the row is"+i+ "column is"+j);
	     arr[i][j]=sc.nextInt();
			}
	}
	for(int i=0;i<a.length;i++)
	{for(int j=0;j<a[0].length;j++)
	{
		System.out.print(""+arr[i][j]+"\t");
		
		
			}
	System.out.println();
	}


	}
	}
	

      
	//}

//}
