package assignment1;

public class PatternStar4 {

	public static void main(String[] args) {
		int n = 20;
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if(i-j>=n/2 || i+j>=n+(n-1)/2  ) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}System.out.println();
		}
		

	}

}
