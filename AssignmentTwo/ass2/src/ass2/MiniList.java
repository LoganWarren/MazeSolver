package ass2;
import java.util.NoSuchElementException;

public class MiniList<E>
{                 
    private class Node
    {
        public E data;
        public Node next;
    
        public Node(E data, Node next)
        {
            this.data = data;
            this.next = next;
        }
        
        public String toString()
        {
            return this.data.toString();
        }
    }
    
    private Node head;
    private Node tail;
    

	public E getFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return head.data;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node currentNode = head;
		int index = 0;
		while (currentNode != null) {
			sb.append(index).append(": ").append(currentNode.data).append("\n");
			currentNode = currentNode.next;
			index++;
		}
		return sb.toString();
	}


    public MiniList()
    {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty()
    {
        return (head == null);
    }

    public void addFirst(E element)
    {
        if (head == null)
        {
            head = new Node(element, null);
            tail = head;
        }
        else
        {
            Node newNode = new Node(element, head);
            head = newNode;
        }
    }
    
    public E removeFirst()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        else
        {
            Node temp = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return temp.data;
        }
    }
    
    public void addLast(E element)
    {
        if (isEmpty())
        {
            addFirst(element);
        }
        else
        {
            Node newNode = new Node(element, null);
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public E removeLast()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        else if (head.next == null)
        {
            return removeFirst();
        }
        else
        {
            Node node = head;
            while (node.next.next != null)
            {
                node = node.next;
            }
            Node temp = node.next;
            node.next = null;
            tail = node;
            return temp.data;
        }
    }
}