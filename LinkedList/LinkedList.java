public class LinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    
        
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Method
    // add at first
    public void addFirst(int data){  // Time Complexity = O(1)        // step 1.
        Node newNode = new Node(data);
        size++;
        
        if(head == null ){
            head = tail = newNode;
            return;
        }
        // step 2 - newNode next = head
        newNode.next = head; // link
        // step 3 - head = newNode
        head = newNode;
    }
        public void addlast(int data){
            //step 1.
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            // step 2 - tail.next = newNode
            tail.next = newNode;  // link
            // step 3 - tail =newNode
            tail = newNode;
        }
        public void addMiddle(int idx , int data){
            if(idx==0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i= 0;
            while(i<idx-1){  //Time Complexity = O(n)
                temp = temp.next;
                i++;
            }
            //i=idx-1 ; temp-> prev
            newNode.next= temp.next;
            temp.next = newNode;


        }
        public void print(){  // Time Complexity = O(1)
            if(head == null){
                System.out.println("Linked List empty");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->" );
                temp = temp.next;
            }
            System.out.println("null");
        


    }
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    public int removeLast(){
        if(size== 0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;

        }else if(size == 1){
            int val = head.data;
            head = tail= null;
            size =0;
            return val;
        }
        // prev :i = size -2
        Node prev = head;
        for( int i = 0; i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size --;
        return val;
    }
    public int itrSearch(int key){  // Time Complexity = O(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data==key){  // key found 
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1 ; // key not found

    }
    public int helper(Node head , int key){  // TC = O(n)  /Space Complexity= O(n)
        if(head == null){
            return -1;
        }
        if(head.data==key){
        
                return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node  next;
        while (curr!=null){
            next = curr.next;
            curr.next= prev;
            prev=curr;
            curr=next;
        }
        head = prev;
    }
    public void deleteNthfromEnf(int n){
        //calculate size
        int sz =0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next;//removeFirst
            return;
        }
        //sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev =head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    // slow fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;

        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head == null || head.next==null){
            return true;
        }
        // step1 - find mid
        Node miNode = findMid(head);
        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;
        while (curr!=null) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr= next;            
        }
        // right half head
        Node right = prev;
        Node left = head;
        // step3 - check left half & right half
        while(right !=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right= right.next;
        }
        return true;
    }
    
    public static void main(String args[]){  // Time Complexity = O(1)
        LinkedList ll = new LinkedList();
       // ll.addFirst(1);
        //ll.addFirst(2);
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(1);
        //ll.addMiddle(2, 3);
       // ll.print();
        //System.out.println(ll.size);
        //ll.removeFirst();
        //ll.print();
        //ll.removeLast();
        //ll.print();
        //System.out.println(ll.itrSearch(3));
       // System.out.println(ll.itrSearch(10));
      // System.out.println(ll.recSearch(3));
       //System.out.println(ll.recSearch(10));
       //ll.reverse();
       //ll.print();
       //ll.deleteNthfromEnf(3);
       
       ll.print();
       System.out.println(ll.checkPalindrome());

    }

    
}
