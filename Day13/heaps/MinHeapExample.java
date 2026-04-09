package Day13.heaps;
import java.util.PriorityQueue;

public class MinHeapExample {
                public static void main(String[] args) {
                        //💠💠💠in cpp pq it's a max heap by default
                        //💠💠💠in java pq it's a min heap by default
                        PriorityQueue<Integer> minHeap= new  PriorityQueue<>();//for doing the heap we should use priority queue
                        //2 9 6 8 4 3 1 0
                        //💠Adding the element into the heap
                        minHeap.add(2);
                        minHeap.add(9);
                        minHeap.add(6);
                        minHeap.add(8);
                        minHeap.add(4);
                        minHeap.add(3);
                        minHeap.add(1);
                        minHeap.add(0);
                        System.out.println("Min Heap:"+minHeap);
                }
        }