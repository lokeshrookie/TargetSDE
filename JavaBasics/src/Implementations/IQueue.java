package Implementations;

/**
 * Simple working: when queue is empty, first = -1, last = -1.
 * When one element is added, first and last will be 0,
 * when second element is added, first will be 0, but last will be 1.
 * in this way, when new elements added, last value increments.
 * */


/**
 *
 * When a queue is initially empty, both first and last are set to -1 to indicate an empty queue.
 *
 * When you add the first element to the queue, both first and last are updated to 0, indicating that the queue now has one element.
 *
 * As you continue to add elements to the queue, the last index increments with each addition, marking the position of the most recently added element. The first index remains at 0, pointing to the front element.
 *
 * When you dequeue an element, the first index increments, indicating that the front element has been removed. If the queue becomes empty after dequeuing, both first and last return to -1 to indicate an empty queue again.
 */
// ------------

/**
 * Key Concepts:
 * FIFO (First-In-First-Out): Queues follow the FIFO principle, meaning that the first element added to the queue will be the first one to be removed.
 *
 * Enqueue: Adding an element to the rear (end) of the queue.
 *
 * Dequeue: Removing an element from the front of the queue.
 *
 * Front and Rear (or Head and Tail): The front represents the first element in the queue, and the rear represents the last element.
 *
 * Important Points:
 * Initialization: When initializing a queue, make sure to set both the first and last indices to appropriate values (e.g., -1 for an empty queue).
 *
 * Checking for Empty and Full: Always check whether the queue is empty or full before dequeuing or enqueuing elements to avoid errors.
 *
 * Updating Indices: After dequeuing, update the first index to point to the new front element. After enqueuing, update the last index to point to the new rear element.
 *
 * Circular Queue: In a circular queue, consider using modulo arithmetic to handle the wrap-around of indices when the queue reaches its maximum size.
 *
 * Array or Linked List: Decide whether to use an array-based or linked-list-based implementation of a queue based on the specific requirements of your application.
 *
 * Peek: Use the peek() method to view the front element without removing it.
 *
 * Capacity: Be aware of the maximum capacity of your queue and avoid exceeding it.
 *
 * Error Handling: Implement error handling for cases when the queue is empty (for dequeue) or full (for enqueue) to prevent runtime exceptions.
 *
 * Element Types: Ensure that the queue can handle the appropriate data types (e.g., integers, strings) based on your application's needs.
 *
 * Efficiency: Consider the time complexity of enqueue and dequeue operations in your implementation. For array-based queues, shifting elements can be costly; linked-list-based queues may be more efficient for certain use cases.
 *
 * Testing: Thoroughly test your queue implementation with various scenarios, including empty and full queues, to ensure it behaves correctly.
 *
 * Documentation: Include clear comments and documentation in your code to explain the purpose of methods and variables, making it easier for others (and your future self) to understand.
 *
 */

public class IQueue {
    private int first;
    private int last;
    private int[] queueArray;
    private int size;

    public IQueue(int size) {
        queueArray = new int[size];
        first = -1;
        last = -1;
        this.size = size;
    }

    // Enqueue
    public void enqueue(int value) throws QueueException {
        if (isFull()) {
            throw new QueueException("Queue is already full");
        }
        if (isEmpty()) {
            first = 0; // Set the first index when enqueueing the first element.
        }
        last++;
        queueArray[last] = value;
    }

    // Dequeue
    // Removes the first element
//    public int dequeue() throws QueueException {
//        if (isEmpty()) {
//            throw new QueueException("Queue is empty. Can't remove");
//        }
//        int removed = queueArray[first];
//
//        // Shift elements one step to the left.
//        for (int i = 1; i <= last; i++) {
//            queueArray[i - 1] = queueArray[i];
//        }
//
//        // Reset the last element to 0 (optional but recommended for clarity).
//        queueArray[last] = 0;
//
//        if (first == last) {
//            // If there was only one element in the queue, reset first and last.
//            first = -1;
//            last = -1;
//        } else {
//            // Otherwise, decrement last.
//            last--;
//        }
//        return removed;
//    }

    public int dequeue() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty. Can't remove");
        }
        int removed = queueArray[first];

        // Shift elements one step to the left.
        for (int i = 1; i <= last; i++) {
            queueArray[i - 1] = queueArray[i];
        }

        // Reset the last element to 0 (optional but recommended for clarity).
        queueArray[last] = 0;

        first++;
        last--;
        return removed;
    }

    // isFull
    public boolean isFull() {
        return last == size - 1;
    }

    // isEmpty
    public boolean isEmpty() {
        return first == -1 && last == -1;
    }

    // Peek
    public int peek() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Empty queue. Can't peek");
        }
        return queueArray[first];
    }

    // Display
    public void display() {
        for (int i = 0; i <=last; i++) {
            System.out.println(queueArray[i]);
        }
    }

    public static void main(String[] args) throws  QueueException{
        IQueue queue = new IQueue(4);
        queue.enqueue( 1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
////        queue.enqueue(5);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
        queue.display();

    }
}