public class Queue_Array {
     static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front ; // circular queue

        Queue(int n){
            arr = new int [ n];
            size = n;
            rear = -1;
            front = -1; // circular queue
        }
     
     public static boolean isEmpty(){
         return rear == -1 && front == -1;
     }

     public static boolean isFull(){
        return (rear + 1) % size == front ;
     }
     // add 
      public static void add(int data){  // Time Complexity = O(1)
        if(isFull()){
            System.out.println("queue is full");
            return ;
        }
        if(isEmpty()){
            front =0;
            rear = 0;
        }else{
         rear = (rear + 1) % size;
         arr [ rear]= data; 
        }
    } 
    //remove
    public static int remove (){  // Time Complexity = O(n)
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }

      int result = arr[ front ];
      // last element dalete
      if(front== rear ){
        front= rear = -1;
      } else{
        front = (front +1 )% size;
      }
    
      return result;
    
    } 
    // peek 
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[front];
    }



 }


    public static void main (String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }

  // wrong output
    }
    

