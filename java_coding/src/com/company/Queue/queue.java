package com.company.Queue;
class queueUSingArray {
    int front_Q, rear_Q, capacityOfQueue;
    int[] q1;

    queueUSingArray(int size) {
        capacityOfQueue = size;
        q1 = new int[capacityOfQueue];
    }

    void enqueue(int value) {
        if (rear_Q == capacityOfQueue) {
            System.out.println("Queue is full,you can not insert the value");
        } else {
            q1[rear_Q] = value;
            rear_Q++;
        }
    }

    void dequeue() {
        if (rear_Q == 0) {
            System.out.println("Queue is empty,there is nothing to delete");
        } else {
            for (int i = 0; i < rear_Q - 1; i++) {
                q1[i] = q1[i + 1];
            }
            rear_Q--;
        }
    }

    void display() {
        if (rear_Q == 0) {
            System.out.println("Queue is empty,nothing to display");
        } else {
            for (int i = 0; i < rear_Q; i++) {
                System.out.print(q1[i] + " ");
            }
        }
    }
}
public class queue {
    public static void main(String[] args) {
        queueUSingArray qe = new queueUSingArray(5);
        qe.enqueue(1);
        qe.enqueue(2);
        qe.enqueue(3);
        qe.enqueue(4);
        qe.enqueue(5);
        qe.display();
        System.out.println();
        qe.dequeue(); // in queue FIFO method is used
        qe.dequeue();
        qe.display();
    }
}
