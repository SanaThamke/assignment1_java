public class ineoron{

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		/*int n=10;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==n-1/2) {
					
					System.out.println("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) {
					
					System.out.println("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || i==n-1/2 || j==0  ) 
				{
					
					System.out.println("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if((j==0 && i!=n-1) || i==n-1 || (j==n-1 && i!=0)){
					
					System.out.println("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && ) || j==n-1/2) {
					
					System.out.println("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==n-1/2) {
					
					System.out.println("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==n-1/2) {
					
					System.out.println("*");
				}
				else {
					System.out.print(" ");
				}
			}	
			
		}

	}*/
		int n=11;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) 
			{
				if(i==0&&j>n/4&&j<(3*n)/4||j==(n-1)/2||i==(n-1)&&j>n/4&&j<(3*n)/4)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j==0||j==(3*n)/4||i==j&&j<=(3*n)/4){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++) {
				if(i==0&&j<(3*n)/4||j==0||i==(n-1)/2&&j<(3*n)/4||i==n-1&&j<(3*n)/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++) {
				if((j==0&&i<n-1)||(j==(3*n)/4&&i<n-1)||i==n-1&&j>0&&j<(3*n)/4) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++) 
			{
				if(j==0||(i==0&&j<=(3*n)/4)||j==(3*n)/4&&i>0&&i<(n-1)/2||i==(n-1)/2&&j>=0&&j<=(3*n)/4||i-j==(n-1)/2) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++) 
			{
				if((j==0&&i>0&&i<n-1)||(i==n-1&&j>0&&j<(3*n)/4)||(i==0&&j>0&&j<(3*n)/4)||(j==(3*n)/4&&i>0&&i<n-1)) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
	
			for(int j=0;j<n;j++) 
			{
				if(j==0||j==(3*n)/4||i==j&&j<=(3*n)/4) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}