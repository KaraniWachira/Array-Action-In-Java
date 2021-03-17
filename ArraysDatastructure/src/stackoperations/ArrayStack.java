package stackoperations;

import java.util.Scanner;

public class ArrayStack implements Stack {
	
	private Object a[]; 
    private int top; // stack top 
    
    public ArrayStack(int n) // constructor 
    { 
        a = new Object[n]; // create stack array 
        top = -1; // no items in the stack 
    } 
    
    public void push(Object item) {
        if(top == a.length-1) 
        { 
            System.out.println("Stack is full");
        } 
        top++; // increment top 
        a[top] = item; // insert an item 
    }
    
 public Object pop() {
        
        if( isEmpty() ) 
        { 
            System.out.println("Stack is empty"); 
            return null; 
        } 
        Object item = a[top]; // access top item 
        top--; // decrement top 
        return item; 
    }

public Object peek() // get top item of stack 
{
    if( isEmpty() ) 
        return null; 
    return a[top]; 
} 

public boolean isEmpty(){ // true if stack is empty 
    return (top == -1); 
} 

public int size(){ // returns number of items in the stack 
    return top+1; 
}

public static void main(String[] args) {
    int choice = 0,num;
    Scanner scan = new Scanner(System.in);
    ArrayStack as = new ArrayStack(10);
    
    while(choice!=5){
        System.out.println();
        System.out.println("ENTER:\n 1 TO PUSH \n "
                + "2 TO POP \n 3 TO PEEK \n 4 TO CHECK STACK SIZE \n "
                + "5 TO QUIT");
        choice = scan.nextInt();
        if(choice==1)
        {
            System.out.print("Enter number to push to the Stack: ");
            num = scan.nextInt();
            as.push(num);
            System.out.print("Number pushed to the stack...");
        }
        if(choice==2)
        {
            System.out.print("Element popped: "+as.pop());
        }
        if(choice==3)
        {
            if(as.peek()==null)
                System.out.println("Stack Empty");
            else
                System.out.println("Top element: "+as.peek());
        }
        if(choice==4)
        {
            System.out.println("Stack size: "+as.size());
        }
        if(choice==5)
        {
            System.exit(0);
        }
        
    	}
    
	} 
}
   

	
	
	
	

	 
	    



















