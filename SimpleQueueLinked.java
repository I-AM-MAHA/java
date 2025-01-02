package javaprograms1;
import java.util.LinkedList;
import java.util.Queue;


public class SimpleQueueLinked { 
	public static void main(String args[])
	{
		Queue<String> queue=new LinkedList<>();
		queue.add("apple");
		queue.add("Mango");
		queue.add("Grapes");
		queue.add("vacoda");
		System.out.println(queue);
		System.out.println("The peek value is"+queue.peek());
		System.out.println("Queue total size"+queue.size());
		System.out.println("Queue includes fruits'apple'?:"+queue.contains("Apple"));
		queue.clear();

	}

}
