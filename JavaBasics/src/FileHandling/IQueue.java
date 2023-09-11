//package FileHandling;
//
//import Implementations.QueueException;
//
////public class IQueue {
////}
//public class IQueue {
//    private int first;
//    private int last;
//    private int[] queueArray;
//    private int size;
//
//    public IQueue(int size) {
//        queueArray = new int[size];
//        first = -1;
//        last = -1;
//        this.size = size;
//    }
//
//    // Enqueue
//    public void enqueue(int value) throws QueueException {
//        if (isFull()) {
//            throw new QueueException("Queue is already full");
//        }
//        if (isEmpty()) {
//            first = 0; // Set the first index when enqueueing the first element.
//        }
//        last++;
//        queueArray[last] = value;
//    }
//
//    // Dequeue
//    // Removes the first element
////    public int dequeue() throws QueueException {
////        if (isEmpty()) {
////            throw new QueueException("Queue is empty. Can't remove");
////        }
////        int removed = queueArray[first];
////
////        // Shift elements one step to the left.
////        for (int i = 1; i <= last; i++) {
////            queueArray[i - 1] = queueArray[i];
////        }
////
////        // Reset the last element to 0 (optional but recommended for clarity).
////        queueArray[last] = 0;
////
////        if (first == last) {
////            // If there was only one element in the queue, reset first and last.
////            first = -1;
////            last = -1;
////        } else {
////            // Otherwise, decrement last.
////            last--;
////        }
////        return removed;
////    }
//
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
//        first++;
//
//        return removed;
//    }
//
//    // isFull
//    public boolean isFull() {
//        return last == size - 1;
//    }
//
//    // isEmpty
//    public boolean isEmpty() {
//        return first == -1 && last == -1;
//    }
//
//    // Peek
//    public int peek() throws QueueException {
//        if (isEmpty()) {
//            throw new QueueException("Empty queue. Can't peek");
//        }
//        return queueArray[first];
//    }
//
//    // Display
//    public void display() {
//        for (int i = 0; i <= last; i++) {
//            System.out.println(queueArray[i]);
//        }
//    }
//
//    public static void main(String[] args) throws  QueueException{
//        IQueue queue = new IQueue(4);
////        queue.enqueue( 1);
////        queue.enqueue(2);
////        queue.enqueue(3);
////        queue.enqueue(4);
//////        queue.enqueue(5);
////        queue.dequeue();
////        queue.dequeue();
//        queue.dequeue();
//        queue.display();
//
//    }
//}
//
