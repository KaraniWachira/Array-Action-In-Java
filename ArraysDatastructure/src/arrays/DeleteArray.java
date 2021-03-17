package arrays;

import java.util.Scanner;

public class DeleteArray {
	 void delete(int a[],int pos,int n) {
		 	int j,i;
	        
	        for(j=pos;j<=n-1;j++)
	        {
	            a[j]=a[j+1];
	        }
	        n=n-1;
	        for(i=0;i<=n-1;i++)
	            System.out.println(a[i]);
	    }
	
	 public static void main(String[] args) {
		 int a[]=new int[10],pos,n,i;
	        Scanner scan = new Scanner(System.in);
	        DeleteArray da = new DeleteArray();
	    
	        System.out.println("How many elements in the array");
	        n=scan.nextInt();
	        System.out.println("Enter the element of the array");
	        for(i=0;i<=n-1;i++){
	            a[i]=scan.nextInt();
	        }
	        boolean pass=false;
	        do{                
	        System.out.print("On which array position do you want delete: ");
	        pos=scan.nextInt();
	        if(pos>n-1)
	            System.out.println("The array position you entered has not been defined. Try Again!");
	        else
	            pass=true;
	        }while(!pass);
	        
	        da.delete(a,pos,n);
	}

}
