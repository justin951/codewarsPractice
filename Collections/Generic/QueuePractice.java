package Collections.Generic;

import java.util.*;

public class QueuePractice {
  public static void main(String[] args) {
    // Create an instance of QueuePractice
    QueuePractice queuePractice = new QueuePractice();

    // Call the practiceQueue method
    queuePractice.practiceQueue();
  }

  public void practiceQueue() {
    // create Queue
    Queue<Integer> ticketCount = new LinkedList<>();

    // creating a PriorityQueue
    PriorityQueue<Integer> ticketCount = new PriorityQueue<>();

    // add elements to the Queue
    ticketCount.add(3);
    ticketCount.add(5);
    ticketCount.add(2);
    ticketCount.add(1);

    // offer elements to the queue
    // more often used w/ restircted queue's
    ticketCount.offer(10);

    // loop through queue (1st way)
    // does not remove items from queue
    Iterator<Integer> it = ticketCount.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    System.out.println();

    // use the element() to look at head of queue
    System.out.println("Element will return the head of the queue and if empty will return NoSuchElementException: "
        + ticketCount.element());

    // peek at head of queue
    System.out.println("peek() return head of queue and if empty will return null: " + ticketCount.peek());

    // poll element in queue
    System.out.println("poll() returns head of queue and removes it from queue; if queue is empty, returns null: "
        + ticketCount.poll());

    // remove elements from queue
    ticketCount.remove(); // removes head element
    ticketCount.remove(1); // removes specified element
    // while (ticketCount.size() > 0) {
    //   System.out.println(ticketCount.poll());
    // }
    while(!ticketCount.isEmpty()){
      System.out.println(ticketCount.poll());
    }
  }

  public class Lab {
    /**
     * Instantiate and return some type of Deque, which is a class that contains
     * Queue and Stack functionality.
     *
     * @return an instantiated Deque. Queue, by itself, doesn't have a class, so you
     *         should use a class that
     *         implements the Queue interface, such as ArrayDeque. Deques contain
     *         all the methods required for both Queue and
     *         Stack behavior.
     */
    public Deque<String> createQueue() {
        ArrayDeque<String> myDeque = new ArrayDeque<>();
        return myDeque;
    }

    /**
     * Return the size of a queue.
     *
     * @param queue a Queue<String> object.
     * @return the length of queue.
     */
    public int getSize(Queue<String> queue) {
        return queue.size();
    }

    /**
     * Add an item to the end of the queue - the queue will be able to return to
     * that item once all the items
     * in front of it have been removed.
     *
     * @param queue a Queue<String> object.
     * @param item  a String that should be added to Queue.
     */
    public void addToEndOfQueue(Queue<String> queue, String item) {
        queue.add(item);
    }

    /**
     * Remove an item from a queue, and return the removed item.
     * (The method used to remove items from queues also returns the item.)
     *
     * @param queue a Queue<String> object.
     * @return the next String due to be removed (polled) from the Queue<String>
     *         (the oldest item in the queue.)
     */
    public String removeFromStartOfQueue(Queue<String> queue) {
        return queue.poll();
    }

    /**
     * Return the next item from a queue which is due to be removed, but do not
     * remove it. This is referred to as
     * a 'peek'.
     *
     * @param queue a Queue<String> object.
     * @return the next String due to be removed (peeked) from the Queue<String>
     *         (the oldest item in the queue.)
     */
    public String getStartOfQueueWithoutRemoving(Queue<String> queue) {
        return queue.peek();
    }
}
}
