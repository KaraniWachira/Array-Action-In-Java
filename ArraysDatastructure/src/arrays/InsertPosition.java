package arrays;

import java.util.Scanner;

public class InsertPosition {

	public static void main(String[] args) {
		int a[]=new int[10];
        int i,len,pos,num;
        Scanner scan = new Scanner(System.in);
        InsertPosition ip = new InsertPosition();
        System.out.println("Enter integers to be read");
        len=scan.nextInt();
        System.out.println("Enter integers");
            for(i=0;i<=len;i++)
              {
                a[i]=scan.nextInt();
              }
        System.out.println("Enter integer to be inserted");
        num=scan.nextInt();
        System.out.println("Enter position in the array for insertion");
        pos=scan.nextInt();
        --pos;
        ip.insert(a,len,pos,num);
    }
	 void insert (int a[], int len, int pos, int num)
	    {
		 int i;
	        for(i=len;i>=pos;i--)
	        {
	            a[i+1]=a[i];
	        }
	        a[pos]=num;
	        if(pos>len)
	        {
	            System.out.println("insertion outside the array");
	        }
	        len++;
	        System.out.println("New array");
	        for(i=0;i<len;i++)
	        {
	            System.out.println(a[i]);
	        }   

	}

}






















