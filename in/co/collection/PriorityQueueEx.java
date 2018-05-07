package in.co.collection;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		q.add(2);
		q.add(4);
		q.offer(2.3);
		System.out.println(q);
	}
}
