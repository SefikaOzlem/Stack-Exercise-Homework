package homework_2;

public class Stack {
	private int top;
	private Object[] elements;
	
	Stack(int capacity)
	{
		elements=new Object[capacity];
		top=-1;
	}
	
	void push(Object data)
	{
		if(isFull())
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top++;
			elements[top]=data;
		}
	}
	
	Object pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return null;
		}
		else
		{
			Object retData=elements[top];
			top--;
			return retData;
		}
	}
	
	Object peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return null;
		}
		else
		{
			return elements[top];
		}
	}
	boolean isEmpty()
	{
		return (top==-1);
	}
	boolean isFull()
	{
		return (top+1==elements.length);
	}
	int size()
	{
		return top+1;
	}

	
	
/*
	 public char get(int i) {
		return (char) top;
	}

	public void set(char top) {
		this.top = top;
	}

	public Object[] getElements() {
		return elements;
	}

	public void setElements(Object[] elements) {
		this.elements = elements;
	}

	boolean Contain( Object a) {
		boolean isln=false;
		 for(Object item:elements)
		 {
			 if(a.equals(item))
			 {
				 isln=false;
				 break;
			 }
		 }
		 return isln;
	}
*/
	

	

	
	
	
	
	
	
	
	
	
}
