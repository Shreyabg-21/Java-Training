package Day13.heaps;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
        public static void main(String[] args) {
            //💠💠💠in cpp pq it's a max heap by default
            //💠💠💠in java pq it's a min heap by default
            PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Collections.reverseOrder());//for doing the heap we should use priority queue
            //2 9 6 8 4 3 1 0
            //💠Adding the element into the heap
            maxHeap.add(2);
            maxHeap.add(9);
            maxHeap.add(6);
            maxHeap.add(8);
            maxHeap.add(4);
            maxHeap.add(3);
            maxHeap.add(1);
            maxHeap.add(0);
            System.out.println("Max Heap:"+maxHeap);
            System.out.println(maxHeap.poll());
        }
    }