class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    // Your code here
	    arr[top+1] = a;
	    top++;
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
        // Your code here
        if (top==-1) return -1;
        int value = arr[top];
        arr[top] = 0;
        top--;
        return value;
	}
}
