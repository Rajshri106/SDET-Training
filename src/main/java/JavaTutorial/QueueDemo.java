package JavaTutorial;

import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
	public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("America");
        queue.add("Germany");
        queue.add("India");
        System.out.println("Queue: " + queue);
        System.out.println("popped element:" + queue.remove());
        // To view the head of queue
        String head = queue.peek();
        System.out.println("head of queue-"
                + head);
        int size = queue.size();
        System.out.println("Size of queue-"
                + size);
    }
}
