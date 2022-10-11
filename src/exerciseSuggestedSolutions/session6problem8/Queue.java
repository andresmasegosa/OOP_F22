package exerciseSuggestedSolutions.session6problem8;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    List<T> queue;

    public Queue() {
        this.queue = new ArrayList<>();;
    }

    void enqueue(T t){
        queue.add(t);
    }
    public List<T> getQueue() {
        return queue;
    }
    T dequeue(){
        T element = this.queue.get(0);
        this.queue.remove(0);
        return element;
    }
    T drain(int n){
        T element;
        //avoid error if draining more than list size
        if(n > this.queue.size()){
            element = this.queue.get(this.queue.size()-1);
            this.queue.clear();
            return element;
        }
        //default code
        element = this.queue.get(n-1);
        this.queue = this.queue.subList(n, queue.size());
        return element;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue();
        for(int i = 0; i < 20; i++){
            queue.enqueue(i);
        }
        System.out.println(queue.getQueue());
        System.out.println("dequeued element "+queue.dequeue());
        System.out.println(queue.getQueue());
        System.out.println("drain first 5 elements, last one to be drained: "+queue.drain(5));
        System.out.println(queue.getQueue());
    }
}
