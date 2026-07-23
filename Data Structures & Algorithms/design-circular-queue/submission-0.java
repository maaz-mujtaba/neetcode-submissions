class MyCircularQueue {
    int rear;
    int front;
    int max;
    int []nums;
    public MyCircularQueue(int k) {
        rear = -1;
        front = -1;
        max = k;
        nums = new int[max];
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;

        else if(isEmpty()){
            rear = 0;
            front = 0;
        }
        else rear = (rear+1)%max;
        nums[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        else if(rear == front)
        {
            rear = -1;
            front = -1;
        }
        else front = (front + 1)%max;

        return true;
    }
    
    public int Front() {
        if(front == -1) return -1;
        return nums[front];
    }
    
    public int Rear() {
        if(rear == -1) return -1;

        return nums[rear];
    }
    
    public boolean isEmpty() {
        if(rear == -1 && front == -1) return true;
        return false;
    }
    
    public boolean isFull() {
        if((rear+1)%max == front) return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */