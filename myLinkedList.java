class myLinkedList {

    Node head;  
	
    class Node { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; }     
    } 
    
    int size = 0;
	 
    // add a new node at the beginning of the list
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = null;
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }
    
    // add a new node at the end of the list
    public void addLast(int value) {
        Node newNode = new Node(value); 
        if (head == null) { 
            head = new Node(value); 
            return; 
        }
        newNode.next = null; 
        Node last = head;  
        while (last.next != null) { 
            last = last.next; 
        }
        last.next = newNode;         
        this.size++;
        return; 
    }
    
    // print the value of the first node
    public void getFirst(){
    	System.out.println(this.head.data);
    }
    
    // print the value of the last node
    public void getLast() {
    	Node newNode = head;
    	while(newNode.next != null) {
    		newNode = newNode.next;
    	}
    	System.out.println(newNode.data); 
    }
    
    //return the size of the linked list
    public int size() {
    	return this.size;
    }
    
    // clear all data from linked list
    public void clear() {
    	head = null;
    } 
    
    // returns the index of a given integer if it is in the linked list
    public void indexOf(int x) { 
        Node newNode = head;
        int count = 0;
        while (newNode != null) { 
            if (newNode.data == x) {
                System.out.println(count);;
            }
            newNode = newNode.next; 
            count++;
        } 
    } 
    
    // prints the current linked list
    public void printList() { 
        Node newNode = head; 
        while (newNode != null) { 
            System.out.print(newNode.data+" "); 
            newNode = newNode.next; 
        } 
    } 
    
}
