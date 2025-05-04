package i_dataStructure.Graph;

// Binary Tree is a special type of graph(cyclic graph).
// It stores the data in unordered or non-sequential manner.
import java.util.*;

class Node {
	int key;
	Node left;
	Node right;
	Node(int k){
		key = k;
	}
	Node(int k, Node l, Node r){
		key = k;
		left = l;
		right = r;
	}
}

public class BinaryTree {
	private Node root;
	
	public void add() {
		System.out.print("Enter the root element: ");
		@SuppressWarnings("resource")
		int key = new Scanner(System.in).nextInt();
		root = new Node(key);
		addNode(root);
	}
	private void addNode(Node n) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert left of "+n.key+" Y/N: ");
		char option = sc.next().charAt(0);
		if(option=='Y' || option=='y') {
			System.out.print("Enter the element: ");
			n.left = new Node(sc.nextInt());
			addNode(n.left);
		}
		
		System.out.print("Insert right of "+n.key+" Y/N: ");
		option = sc.next().charAt(0);
		if(option=='Y' || option=='y') {
			System.out.print("Enter the element: ");
			n.right = new Node(sc.nextInt());
			addNode(n.right);
		}
	}
	
	//Traversing
	//Breadth-First Traverse(Level-Order Traverse)
	public void levelOrder() {
		Queue<Node> q = new LinkedList<>();
		if(root!=null) q.add(root);
		while(!q.isEmpty()) {
			Node n = q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
		}
		System.out.println();
	}
	
	//Depth-First Traverse
	//Pre-Order Traverse(root, left, right)
	public void preOrder() {
		preOrder(root);
		System.out.println();
	}
	private void preOrder(Node n) {
		if(n==null) return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	
	//Post-Order Traverse(left, right, root)
	public void postOrder() {
		postOrder(root);
		System.out.println();
	}
	private void postOrder(Node n) {
		if(n==null) return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	
	//In-Order Traverse(left, root, right)
	public void inOrder() {
		inOrder(root);
		System.out.println();
	}
	private void inOrder(Node n) {
		if(n==null) return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right);
	}
	
	public void display() {
		show(root, 0);
	}
	private void show(Node n, int level) {
		if(n==null) return;
		show(n.right, level+1);
		if(level!=0) {
			for(int i=0; i<level; i++) System.out.println("|\t");
			System.out.println("------------->"+n.key);
		}
		else System.out.println(n.key);
		show(n.left, level+1);
	}
}















