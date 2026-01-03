public class LinkedList_Merge {
    
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    
        
    }
    public static Node head;
    private Node getMid(Node head){
        Node slow = head ;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow ;  // mid node
    }

    private Node merge(Node head1 , Node head2){
        Node merge
    }

    public Node mergeSort(Node head){
        if(head == null && head.next !=null){
            return head;
        }
        // find mid
        Node mid = getMid();
        // left & right mid
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight= mergeSort(righthead);

        // merge
        return mergeSort(newLeft , newRight);
    }

    public static void main(String args[]){

    }
    
}
