import java.util.*;

// Class for queue
public class ImpFila implements IFila{
	private int arr[];         // array to store queue elements
	private int front;         // front points to front element in the queue
	private int rear;          // rear points to last element in the queue
	private int capacity;      // maximum capacity of the queue
	private int count;         // current size of the queue
	
	// Constructor to initialize queue
	ImpFila(int size)
	{
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	//Override
	public void dequeue()
	{
		// check for queue underflow
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		count--;
	}

	// Override
	public void enqueue(int item)
	{
		// check for queue overflow
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Inserting " + item);

		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	// Override
	public int first()
	{
		if (isEmpty()) 
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		return arr[front];
    }
    
    // Override
	public int last()
	{
		if (isEmpty()) 
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		return arr[rear];
	}

	// Override
	public int size()
	{
		return count;
	}

	//Override
	public boolean isEmpty()
	{
		return (size() == 0);
	}

	// Override
	public boolean isFull()
	{
		return (size() == capacity);
	}
	
	// Queue implementation in java
	public static void main (String[] args)
	{
		// create a queue of capacity 5
		ImpFila q = new ImpFila(5);

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println("Front element is: " + q.first());
		q.dequeue();
		System.out.println("Front element is: " + q.first());

		System.out.println("Queue size is " + q.size());

		q.dequeue();
		q.dequeue();
		
		if (q.isEmpty())
			System.out.println("Queue Is Empty");
		else
			System.out.println("Queue Is Not Empty");
	}
}